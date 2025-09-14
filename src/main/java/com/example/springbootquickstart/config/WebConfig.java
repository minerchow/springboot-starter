package com.example.springbootquickstart.config;

import com.example.springbootquickstart.interceptors.Logininterceptor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
@Configuration
public class WebConfig implements WebMvcConfigurer {
    @Autowired
    private Logininterceptor logininterceptor;
    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(logininterceptor).excludePathPatterns("/user/login","/user/register");
    }
}
