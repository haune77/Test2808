package com.example.test2808.student;

import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;

@Service
public class StudentService {

    public List<Student> findAllStudent(){
        return List.of(
                new Student("Nguyen","Duong", LocalDate.now(),"yeu@gmail.com",19),
                new Student("Dan","Bich", LocalDate.now(),"em@gmail.com",19));
    }
}
