package com.skkutable;  // 적절한 패키지 경로로 설정

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class WebConfig implements WebMvcConfigurer {

  @Override
  public void addCorsMappings(CorsRegistry registry) {
    registry.addMapping("/**")
        .allowedOrigins("http://localhost:3000")  // Next.js 주소
        .allowedMethods("GET", "POST", "PUT", "DELETE")
        .allowedHeaders("*");
  }
}