

package com.example.enjoyTrip.config;

import org.springframework.boot.web.servlet.view.MustacheViewResolver;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.ViewResolverRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class WebMvcConfig implements WebMvcConfigurer{

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