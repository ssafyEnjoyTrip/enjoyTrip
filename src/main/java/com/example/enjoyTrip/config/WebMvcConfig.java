

package com.example.enjoyTrip.config;

import org.springframework.stereotype.Component;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Component
public class WebMvcConfig implements WebMvcConfigurer{

    LoginCheckInterceptor loginCheckInterceptor;

    public WebMvcConfig(LoginCheckInterceptor loginCheckInterceptor) {
        this.loginCheckInterceptor = loginCheckInterceptor;
    }

    @Override
    public void addInterceptors(InterceptorRegistry registry) { // interceptorRegistry라는 저장소에 interceptor를 집어넣자.
        registry.addInterceptor(loginCheckInterceptor)
                .addPathPatterns("/users/**")
                .excludePathPatterns("/login/**"); // users는 모든 요청에대해 인터셉터를 적용시키고, login 으로 되어있는건 다 적용X

    }
}