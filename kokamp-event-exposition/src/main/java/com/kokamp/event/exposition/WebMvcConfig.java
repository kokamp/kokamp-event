package com.kokamp.event.exposition;

import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpMethod;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
@EnableWebMvc
public class WebMvcConfig implements WebMvcConfigurer {

    @Override
    public void addCorsMappings(CorsRegistry registry) {
        registry.addMapping("/**").allowedHeaders("**").allowedMethods(HttpMethod.GET.name(),
                HttpMethod.DELETE.name(),
                HttpMethod.POST.name(),
        HttpMethod.PUT.name(),
        HttpMethod.HEAD.name());

    }
}
