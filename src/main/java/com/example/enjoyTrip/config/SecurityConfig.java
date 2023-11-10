package com.example.enjoyTrip.config;

import com.example.enjoyTrip.config.auth.MyAuthenticationFailureHandler;
import com.example.enjoyTrip.config.auth.MyAuthenticationSuccessHandler;
import com.example.enjoyTrip.config.auth.PrincipalDetailService;
import lombok.RequiredArgsConstructor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
@EnableWebSecurity // 스프링 시큐리티 필터가 스프링 필터 체인에 등록되게 한다.
@RequiredArgsConstructor
public class SecurityConfig {

	private final MyAuthenticationSuccessHandler authenticationSuccessHandler;

	private final MyAuthenticationFailureHandler authenticationFailureHandler;

	private final PrincipalDetailService principalDetailService;
	@Bean // IoC(제어의 역전)에 등록해준다.
	public BCryptPasswordEncoder encodePwd() {
		return new BCryptPasswordEncoder();
	}
	
	
	@Bean
	public SecurityFilterChain filterChain(HttpSecurity http) throws Exception{
		
		http.csrf().disable(); // csrf 비활성화. csrf가 켜져있으면 form 태그로 요청시 csrf 토큰이 추가된다.
		// 그래서 서버쪽에서 만들어준 form 태그로만 요청이 가능하게 된다.
		http.authorizeRequests()
		.antMatchers("/attractions/**").authenticated() // "/attractions"로 가면 인증해야된다.
		.antMatchers("/manager/**").access("hasAnyRole('ROLE_MANAGER', 'ROLE_ADMIN')")
		.antMatchers("/admin/**").access("hasRole('ROLE_ADMIN')")
		
		.anyRequest().permitAll()
		.and()
		.formLogin()
		.loginPage("/loginForm") // 사용자가 인증되지 않은 경우 로그인 페이지로 리다이렉트 하는데 그게 /loginForm 요청이다.
		.usernameParameter("email")
		.loginProcessingUrl("/login") // /login 주소가 호출이 되면 시큐리티가 낚아채서 대신 로그인을 진행해준다.
				.successHandler(authenticationSuccessHandler)
		.failureHandler(authenticationFailureHandler);
//				.defaultSuccessUrl("/"); // 로그인이 성공하면 / 주소로 간다.
		return http.build();
	}
	
	
}
