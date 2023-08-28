package com.example.test2808.student;


import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDate;
import java.time.Period;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "student")
public class Student {
    @Id
    @GeneratedValue
    private Integer id;
    private String firstName;
    private String lastName;
    private LocalDate dateOfBirth;
    @Column(unique = true)
    private String email;
    @Transient
    private int age;
    public int getAge() {
        return Period.between(dateOfBirth,LocalDate.now()).getYears();
    }
}
