package org.generation.app.security;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpMethod;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;
import org.springframework.security.web.SecurityFilterChain;
import static org.springframework.security.config.Customizer.withDefaults;

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
	SecurityFilterChain filterChain(HttpSecurity http) throws Exception {
		
		// STEP 2.1 Deshabilitar la seguridad
//		return http
//				.authorizeHttpRequests( authorize -> authorize.anyRequest().permitAll()  )
//				.csrf( csrf -> csrf.disable() )
//				.httpBasic( withDefaults()  )
//				.build();				
		
		// STEP 2.2 Configurar la seguridad
		return http
				.authorizeHttpRequests( authorize -> authorize
						.requestMatchers( "/", "/index.html", "/assets/**" ).permitAll()
						.requestMatchers(HttpMethod.POST, "/api/v1/users",  "/api/v1/roles").permitAll()
						.requestMatchers("/api/v1/users/**").hasRole("ADMIN")
						.requestMatchers("/api/v2/users/**").hasAnyRole("ADMIN", "CUSTOMER")
						.anyRequest().authenticated()
						)
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

}
