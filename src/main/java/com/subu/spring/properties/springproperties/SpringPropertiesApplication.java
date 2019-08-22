package com.subu.spring.properties.springproperties;

import com.subu.spring.properties.springproperties.config.StudentConfig;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

@SpringBootApplication

//@EnableConfigurationProperties(StudentConfig.class) if StudentConfig class not have @configuration then we need to do this
public class SpringPropertiesApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringPropertiesApplication.class, args);
	}

}
