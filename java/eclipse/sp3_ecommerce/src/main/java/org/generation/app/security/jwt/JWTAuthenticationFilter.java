package org.generation.app.security.jwt;

import java.io.IOException;

import org.generation.app.security.UserDetailsImpl;
import org.json.JSONObject;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.web.authentication.UsernamePasswordAuthenticationFilter;

import com.fasterxml.jackson.databind.ObjectMapper;

import jakarta.servlet.FilterChain;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class JWTAuthenticationFilter extends UsernamePasswordAuthenticationFilter {

	// STEP 7.1 recuperar el email y password del body de la solicitud que vendría en localhost:8080/login
	@Override
	public Authentication attemptAuthentication(HttpServletRequest request, HttpServletResponse response)
			throws AuthenticationException {
		
		AuthCredentials authCredentials = new AuthCredentials();
		
		// asumimos que en el body de la petición viene en el formato JSON como { email, password}
		try {
			authCredentials = new ObjectMapper().readValue(  request.getReader(), AuthCredentials.class  );
			
			
		} catch (IOException e) {
			
			e.printStackTrace();
		}
		
		UsernamePasswordAuthenticationToken usernamePAT = new UsernamePasswordAuthenticationToken(
				authCredentials.getEmail(),
				authCredentials.getPassword()
				);
		
		// Autenticar el usuario con authManager
		return getAuthenticationManager().authenticate(usernamePAT);
		
	}
	
	
	// STEP 7.2 Si la autenticación fue correcta agregamos el token a la respuesta
	@Override
	protected void successfulAuthentication(HttpServletRequest request, HttpServletResponse response, FilterChain chain,
			Authentication authResult) throws IOException, ServletException {
		
		UserDetailsImpl userDetails = (UserDetailsImpl) authResult.getPrincipal();
		
		String token = TokenUtils.createToken(userDetails.fullName(), userDetails.getUsername(), userDetails.getAuthorities() );
				
		// Opcional: crear un objeto JSON para la respuesta
		JSONObject jsonResponse = new JSONObject();
		jsonResponse.put("token", token);
		
		// Configuración de la respuesta http
		response.setContentType("application/json");
		response.setCharacterEncoding("UTF-8");
		response.addHeader("Authorization", "Bearer " + token);
		
		// Opcional: Establecer el objeto JSON en el body de la respuesta
		response.getWriter().write( jsonResponse.toString() );
		response.getWriter().close();
		
		super.successfulAuthentication(request, response, chain, authResult);
		
	}
}
