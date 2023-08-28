package com.example.test2808.student;
import java.util.List;


public interface StudentService {
    List<Student> findAllStudent();
    Student save(Student student);
    Student findByEmail(String email);
    Student update(Student student);
<<<<<<< HEAD
    void delete(String email);
=======
    void delete(Integer id);
>>>>>>> cecd741 (initializing spring boot project)
}
