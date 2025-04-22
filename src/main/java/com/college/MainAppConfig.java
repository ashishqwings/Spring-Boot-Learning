package com.college;

import com.college.config.AppConfig;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MainAppConfig {
    public static void main(String[] args) {
        // Using Java-based configuration (no XML involved)
        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);

        // Bean ID is the same as method name in AppConfig: "student1"
        Student student = context.getBean("student1", Student.class);
        student.showDetails();
    }
}
