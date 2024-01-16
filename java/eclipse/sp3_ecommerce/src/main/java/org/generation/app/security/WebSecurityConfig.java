package org.generation.app.security;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpMethod;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.config.Customizer;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.http.SessionCreationPolicy;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;
import org.springframework.security.web.SecurityFilterChain;
import org.springframework.security.web.authentication.UsernamePasswordAuthenticationFilter;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.cors.CorsConfiguration;
import org.springframework.web.cors.CorsConfigurationSource;
import org.springframework.web.cors.UrlBasedCorsConfigurationSource;

import static org.springframework.security.config.Customizer.withDefaults;

import java.util.List;

import org.generation.app.security.jwt.JWTAuthenticationFilter;
import org.generation.app.security.jwt.JWTAuthorizationFilter;
import org.generation.app.service.UserService;

/**
* @EnableWebSecurity: habilita la configuración de seguridad web 
*   en una aplicación Spring Boot.
* @Configuration: contiene configuraciones para la aplicación, 
*  como definiciones de beans y configuración de componentes, 
*  y que debe ser considerada durante la inicialización del 
*  contexto de la aplicación.
*
*/
@Configuration
@EnableWebSecurity
public class WebSecurityConfig {
	
	@Autowired
	PasswordEncoder passwordEncoder;
	@Autowired
	UserDetailsService userDetailsService;
	
	// STEP 1 Autentcación basada en usuarios en memoria
//	@Bean
//	UserDetailsService userDetailsService() {
//		UserDetails sergio = User.builder()
//				.username("sergio")
//				.password( passwordEncoder.encode("234") ) // "{noop}234"
//				.roles("ADMIN") // ROLE_ADMIN
//				.build();
//		
//		UserDetails tony = User.builder()
//				.username("tony")
//				.password( passwordEncoder.encode("policiadeperritos") )
//				.roles("CUSTOMER")
//				.build();
//		return new InMemoryUserDetailsManager( sergio, tony  );
//	}
	
	// STEP 2 Realizar configuraciones personalizadas del filterChain
	@Bean
	SecurityFilterChain filterChain(
			HttpSecurity http, 
			AuthenticationManager authManager,
			JWTAuthorizationFilter jwtAuthorizationFilter
			) throws Exception {
		
		// STEP 7.3 Crear el objeto y la configuración para jwtAuthenticationFilter
		JWTAuthenticationFilter jwtAuthenticationFilter = new JWTAuthenticationFilter();
		jwtAuthenticationFilter.setAuthenticationManager(  authManager );
		jwtAuthenticationFilter.setFilterProcessesUrl("/login");
		
		
		// STEP 2.1 Deshabilitar la seguridad
//		return http
//				.authorizeHttpRequests( authorize -> authorize.anyRequest().permitAll()  )
//				.csrf( csrf -> csrf.disable() )
//				.httpBasic( withDefaults()  )
//				.build();				
		
		// STEP 2.2 Configurar la seguridad
		return http
				.cors( Customizer.withDefaults() )
				.authorizeHttpRequests( authorize -> authorize
						.requestMatchers( "/", "/index.html", "/assets/**" ).permitAll()
						.requestMatchers(HttpMethod.POST, "/api/v1/users",  "/api/v1/roles").permitAll()
						.requestMatchers("/api/v1/users/**").hasRole("ADMIN")
						.requestMatchers("/api/v2/users/**").hasAnyRole("ADMIN", "CUSTOMER")
						.anyRequest().authenticated()
						)
				// STEP 7: Agregamos el filtro de autenticación del login
				// interceptar las solicitudes de autenticación y generamos el token en la respuesta
				.addFilter( jwtAuthenticationFilter )
				// STEP 8: Agregamos el filtro para las demas solicitudes verificando el token JWT
				// Interceptamos las solicitudes , extraemos y validamos el token
				// y autenticamos al usuario
				.addFilterBefore( jwtAuthorizationFilter  ,  UsernamePasswordAuthenticationFilter.class)
				/*
				 * no es necesario almacenar información de sesión en el servidor, 
				 * ya que toda la información necesaria para la autenticación 
				 * se encuentra en el token, y cada solicitud es autónoma.
				 */
				.sessionManagement(managment -> managment.sessionCreationPolicy(SessionCreationPolicy.STATELESS))
				.csrf( csrf -> csrf.disable() )
				.httpBasic( withDefaults()  )
				.build();
		
	}
	
	/** 
	 *  AuthenticationManager: Gestiona las operaciones de autenticación.
	 *  getSharedObject: Obtiene una instancia compartida de AuthenticationManagerBuilder 
	 *  .userDetailsService: Configura el AuthenticationManagerBuilder 
	 *  	para utilizar un servicio de detalles de usuario personalizado.
	 *  userDetailsService: responsable de cargar detalles específicos 
	 *  	del usuario durante el proceso de autenticación.
	 * @throws Exception 
	 *  
	 */	
	// STEP 3 Autenticación basada en usuarios de la DB
	@Bean
	AuthenticationManager authManager(HttpSecurity httpSecurity) throws Exception {
		AuthenticationManagerBuilder authManagerBuilder = httpSecurity
				.getSharedObject( AuthenticationManagerBuilder.class  );
		
		authManagerBuilder
		 .userDetailsService( userDetailsService ) 
		 .passwordEncoder( passwordEncoder );
		
		return authManagerBuilder.build();
	}
	
	// STEP 6: opcional, configurar los CORS en caso de que no funcione 
	// @CrossOrigin(origins = "*") en los controladores
	@Bean
	CorsConfigurationSource corsConfigurationSource() {
		CorsConfiguration configuration = new CorsConfiguration();
		configuration.setAllowedOrigins( List.of("http://127.0.0.1:5500", "https://ch30-spring.onrender.com") );
		configuration.setAllowedMethods( List.of("GET", "POST", "PUT", "DELETE") );
		configuration.setAllowedHeaders( List.of("Authorization","Content-Type") );
		UrlBasedCorsConfigurationSource source = new UrlBasedCorsConfigurationSource();
		source.registerCorsConfiguration("/**", configuration);
		return source;
		
	}

}
