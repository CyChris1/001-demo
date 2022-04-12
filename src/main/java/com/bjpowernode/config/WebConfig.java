package com.bjpowernode.config;

import com.bjpowernode.filter.BookFilter;
import com.bjpowernode.interceptor.BookInterceptor;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;


import javax.servlet.FilterRegistration;

@Configuration
public class WebConfig implements WebMvcConfigurer {
    public void addInterceptors(InterceptorRegistry registry){
        InterceptorRegistration registration = registry.addInterceptor(new BookInterceptor());
        registration.addPathPatterns("/**");
        registration.excludePathPatterns(
                "/user/**",
                "/swagger-resources/**", "/webjars/**", "/v2/**", "/swagger-ui.html/**", "/var/**",
                "/book/**",
                "/test/**"
        );
    }

    @Bean
    public FilterRegistrationBean filterRegistrationBean(){
        FilterRegistrationBean bean = new FilterRegistrationBean();
        bean.setFilter(new BookFilter());
        bean.addUrlPatterns("/user/*");
        return bean;
    }

    public void addResourceHandlers(ResourceHandlerRegistry registry) {
        registry.addResourceHandler("swagger-ui.html")
                .addResourceLocations("classpath:/META-INF/resources/");
        registry.addResourceHandler("/webjars/**")
                .addResourceLocations("classpath:/META-INF/resources/webjars/");
        registry.addResourceHandler("/var/**").addResourceLocations("file:/var/");
    }

}
