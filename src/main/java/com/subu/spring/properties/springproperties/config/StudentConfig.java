package com.subu.spring.properties.springproperties.config;

import com.subu.spring.properties.springproperties.model.Student;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

/**
 * Created by 195920 on 8/21/2019.
 */
@Configuration
public class StudentConfig {

    @Bean
    @ConfigurationProperties(prefix = "student")
    public Student student(){
        Student student = new Student();
       return student;
    }
}
