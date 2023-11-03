package com.example.enjoyTrip.config;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Component;
import org.springframework.web.servlet.HandlerInterceptor;

import com.example.enjoyTrip.dto.UserDto;

@Component
public class LoginCheckInterceptor implements HandlerInterceptor{
	
	@Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
		System.out.println("LoginCheckInterceptor >>> " + request.getRequestURI());
		UserDto user = (UserDto) request.getSession().getAttribute("user");
		
		// 일단 인터셉터 적용하지 말기. 11-03
		if( user == null) {
			response.sendRedirect("/noLogin");
			return false;
		}
    	return true;
    }

}
