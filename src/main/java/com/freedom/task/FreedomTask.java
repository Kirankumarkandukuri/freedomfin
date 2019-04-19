package com.freedom.task;

import java.util.EnumSet;

import javax.servlet.DispatcherType;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

import com.freedom.task.config.SecurityFilter;

import springfox.documentation.swagger2.annotations.EnableSwagger2;

@SpringBootApplication
@EnableSwagger2
public class FreedomTask {
  

    public static void main(String[] args) throws Exception {
        SpringApplication.run(FreedomTask.class, args);
    }
    
    @Bean
    public RestTemplate getRestTemplate() {
       return new RestTemplate();
    }
    
    @Bean public FilterRegistrationBean simpleWebFilter() {
        FilterRegistrationBean registration = new FilterRegistrationBean();
        registration.setFilter(new SecurityFilter());
        registration.addUrlPatterns("/employee","/department");
        registration.setDispatcherTypes(EnumSet.allOf(DispatcherType.class));
        return registration;
    }
 
}
