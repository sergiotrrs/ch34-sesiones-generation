package org.generation.app.security;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;
import org.springframework.security.web.SecurityFilterChain;
import static org.springframework.security.config.Customizer.withDefaults;

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
	
	// STEP 1 Autentcación basada en usuarios en memoria
	@Bean
	UserDetailsService userDetailsService() {
		UserDetails sergio = User.builder()
				.username("sergio")
				.password( passwordEncoder.encode("234") )
				.roles("ADMIN")
				.build();
		
		UserDetails tony = User.builder()
				.username("tony")
				.password( passwordEncoder.encode("policiadeperritos") )
				.roles("CUSTOMER")
				.build();
		return new InMemoryUserDetailsManager( sergio, tony  );
	}
	
	// STEP 2 Realizar configuraciones personalizadas del filterChain
	@Bean
	SecurityFilterChain filterChain(HttpSecurity http) throws Exception {
		
		// STEP 2.1 Deshabilitar la seguridad
		return http
				.authorizeHttpRequests( authorize -> authorize.anyRequest().permitAll()  )
				.csrf( csrf -> csrf.disable() )
				.httpBasic( withDefaults()  )
				.build();				
		
	}

}
