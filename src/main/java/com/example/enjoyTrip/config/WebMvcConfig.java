

package com.example.enjoyTrip.config;

import org.springframework.boot.web.servlet.view.MustacheViewResolver;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.ViewResolverRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class WebMvcConfig implements WebMvcConfigurer{


    public void addCorsMappings(CorsRegistry registry) {
        registry.addMapping("/**")
                .allowedOrigins("http://localhost:5173")
                .allowedMethods("GET", "POST", "PUT", "DELETE", "PATCH", "OPTIONS") // get, post는 기본적으로 모든 웹서버에서 default로 구현했다고 가정한다.
                //근데 put,delete는 신뢰할 수 없는 메소드로 아직까지 지정이 되어있기때문에 put, delete 요청전에 options 메소로 먼저 put,delete를 받을 수 있는지 확인한다.
                .allowedHeaders("*")
                .allowCredentials(true)
                .maxAge(3000);
    }
//    LoginCheckInterceptor loginCheckInterceptor;

//    public WebMvcConfig(LoginCheckInterceptor loginCheckInterceptor) {
//        this.loginCheckInterceptor = loginCheckInterceptor;
//    }

//    @Override
//    public void configureViewResolvers(ViewResolverRegistry registry) {
//        MustacheViewResolver resolver = new MustacheViewResolver();
//
//        resolver.setCharset("UTF-8");
//        resolver.setContentType("text/html; charset=UTF-8");
//        resolver.setPrefix("classpath:/templates/");
//        resolver.setSuffix(".html");
//
//        registry.viewResolver(resolver);
//    }

//    @Override
//    public void addInterceptors(InterceptorRegistry registry) { // interceptorRegistry라는 저장소에 interceptor를 집어넣자.
//        registry.addInterceptor(loginCheckInterceptor)
//                .addPathPatterns("/users/**")
//                .addPathPatterns("/attractions/")
//                .excludePathPatterns("/users/interceptTest")
//                .excludePathPatterns("/login/**"); // users는 모든 요청에대해 인터셉터를 적용시키고, login 으로 되어있는건 다 적용X
//
//    }
}