package com.college.config;

import com.college.Course;
import com.college.Student;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.Arrays;

@Configuration
public class AppConfig {

    // Each @Bean method name acts as the bean ID in Spring's container

    @Bean
    public Course course1() {
        return new Course("C101", "Spring Basics");
    }

    @Bean
    public Course course2() {
        return new Course("C102", "Data Structures");
    }

    @Bean
    public Course course3() {
        return new Course("C103", "Databases");
    }

    @Bean
    public Student student1() {
        // The student is being created with 3 injected courses
        return new Student("S001", "Amit", Arrays.asList(course1(), course2(), course3()));
    }
}
