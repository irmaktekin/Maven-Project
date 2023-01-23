package com.irmaktekin.springboot.myfirstwebapp.todo;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;
import org.springframework.security.web.SecurityFilterChain;
import static org.springframework.security.config.Customizer.withDefaults;
@Configuration
public class SpringSecurityConfiguration {
	
	
	@Bean
	public InMemoryUserDetailsManager createUserDetailsManager() {
		UserDetails userDetails = User.withDefaultPasswordEncoder()
		.username("irmaktekin")
		.password("dummy")
	    .roles("USER","ADMIN")
	    .build();
	    return new InMemoryUserDetailsManager(userDetails);
	}
	
	
	//CSRF disable
	//Frames
	
	
	@Bean
	public SecurityFilterChain filterChain(HttpSecurity http) throws Exception {
		http.authorizeHttpRequests(
				
				auth ->auth.anyRequest().authenticated());
		http.formLogin(withDefaults());		
		http.csrf().disable();
		http.headers().frameOptions().disable();
		return http.build();
		
	}

}
