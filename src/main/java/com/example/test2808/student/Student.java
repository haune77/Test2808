package com.example.test2808.student;

import lombok.*;

import java.time.LocalDate;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Student {
    private String firstName;
    private String lastName;
    private LocalDate dateOfBirth;
    private String email;
    private int age;

}
