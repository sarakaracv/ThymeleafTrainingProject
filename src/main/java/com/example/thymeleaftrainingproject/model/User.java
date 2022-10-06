package com.example.thymeleaftrainingproject.model;


import com.example.thymeleaftrainingproject.enums.Gender;
import com.example.thymeleaftrainingproject.enums.State;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class User {

    private String firstName;
    private String lastName;
    private String address;
    private State state;
    private int age;
    private Gender gender;
    private boolean married;



}
