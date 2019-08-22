package com.subu.spring.properties.springproperties.controller;

import com.subu.spring.properties.springproperties.config.ConfigProperties;
import com.subu.spring.properties.springproperties.model.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.env.Environment;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.logging.Logger;

/**
 * Created by 195920 on 8/21/2019.
 */
@RestController
@RequestMapping(value = "/students")
public class StudentsController {

    Logger LOGGER = Logger.getLogger(StudentsController.class.getName());

    @Autowired
    Environment environment;

    @Value("${student.id}")
    int studentId;

    @Autowired
    ConfigProperties configProperties;

    @Autowired
    Student student;

    @GetMapping
    public ResponseEntity<Student> getStudent(){

       LOGGER.info("Student Id:"+studentId);
       LOGGER.info(configProperties.toString());
       LOGGER.info(student.toString());

        return new ResponseEntity<Student>(
                new Student(
                        Integer.valueOf(environment.getProperty("student.id")),
                                        environment.getProperty("student.name"))
                ,HttpStatus.OK);
    }
}
