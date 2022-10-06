package com.example.thymeleaftrainingproject;

import com.example.thymeleaftrainingproject.bootstrap.DataGenerator;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class ThymeleafTrainingProjectApplication {

    public static void main(String[] args) {
        ConfigurableApplicationContext context = SpringApplication.run(ThymeleafTrainingProjectApplication.class, args);
        DataGenerator bootStrap = context.getBean(DataGenerator.class);
        bootStrap.createUsers();
    }

}
