package org.launchcode.OneThingTodayApp.config;

import org.launchcode.OneThingTodayApp.util.CustomPasswordEncoder;
import org.springframework.beans.factory.annotation.Autowired;

//the commented-out code below this line was copied from
// https://github.com/eugenp/tutorials/blob/master/spring-security-modules/spring-security-web-react/src/main/java/com/baeldung/spring/SecSecurityConfig.java

//other parts were copied from 49-video series by CoderCampus (video 6, etc.)

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;
import org.springframework.http.HttpMethod;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;
import org.springframework.security.web.SecurityFilterChain;
import org.springframework.security.web.csrf.CookieCsrfTokenRepository;

@Configuration
@EnableWebSecurity
@Profile("!https")
public class SecSecurityConfig {
	
	@Autowired
	private UserDetailsService userDetailsService;
	
	@Autowired
	private CustomPasswordEncoder customPasswordEncoder;
	
	protected void configure(AuthenticationManagerBuilder auth) throws Exception {
		auth.userDetailsService(userDetailsService).passwordEncoder(customPasswordEncoder.getPasswordEncoder());
	}
	
	protected void configure(HttpSecurity http) throws Exception {
		configure(http);
	}

//    @Bean
//    public InMemoryUserDetailsManager userDetailsService() throws Exception {
//        UserDetails user1 = User.withUsername("user1")
//            .password("{noop}user1Pass")
//            .roles("USER")
//            .build();
//
//        UserDetails user2 = User.withUsername("user2")
//            .password("{noop}user2Pass")
//            .roles("USER")
//            .build();
//
//        UserDetails admin = User.withUsername("admin")
//            .password("{noop}admin0Pass")
//            .roles("ADMIN")
//            .build();
//        return new InMemoryUserDetailsManager(user1, user2, admin);
//    }
    


//    @Bean
//    public SecurityFilterChain filterChain(HttpSecurity http) throws Exception {
//        return http.csrf(csrf -> csrf.csrfTokenRepository(CookieCsrfTokenRepository.withHttpOnlyFalse()))
//            .authorizeHttpRequests(request -> request.requestMatchers("/admin/**")
//                .hasRole("ADMIN")
//                .requestMatchers("/anonymous*")
//                .anonymous()
//                .requestMatchers(HttpMethod.GET, "/index*", "/static/**", "/*.js", "/*.json", "/*.ico", "/rest")
//                .permitAll()
//                .anyRequest()
//                .authenticated())
//            .formLogin(form -> form.loginPage("/index.html")
//                .loginProcessingUrl("/perform_login")
//                .defaultSuccessUrl("/homepage.html", true)
//                .failureUrl("/index.html?error=true"))
//            .logout(logout -> logout.logoutUrl("/perform_logout")
//                .deleteCookies("JSESSIONID"))
//            .build();
//    }
}