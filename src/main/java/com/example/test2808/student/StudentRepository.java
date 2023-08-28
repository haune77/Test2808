package com.example.test2808.student;

import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<Student,Integer> {
    Student findByEmail(String email);
    void deleteById(Integer id);
}
