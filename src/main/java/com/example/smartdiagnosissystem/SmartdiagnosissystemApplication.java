package com.example.smartdiagnosissystem;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@SpringBootApplication
public class SmartdiagnosissystemApplication {

    public static void main(String[] args) {
        SpringApplication.run(SmartdiagnosissystemApplication.class, args);
    }




@Bean
public WebMvcConfigurer corsConfigurer(){
    return new WebMvcConfigurer() {
        public void addCorsMapping(CorsRegistry corsRegistry){
            corsRegistry.addMapping("/**")
                    .allowedMethods("*")
                    .allowedOrigins("http://localhost:3000");

        }
    };

}
}