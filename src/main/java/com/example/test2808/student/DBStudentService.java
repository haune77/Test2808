package com.example.test2808.student;

import org.springframework.stereotype.Service;

import java.util.List;

@Service

public class DBStudentService implements StudentService{

    public final StudentRepository repository;

    public DBStudentService(StudentRepository repository) {
        this.repository = repository;
    }

    @Override
    public List<Student> findAllStudent() {
        return repository.findAll();
    }

    @Override
    public Student save(Student student) {
        return repository.save(student);
    }

    @Override
    public Student findByEmail(String email) {
        return repository.findByEmail(email);
    }

    @Override
    public Student update(Student student) {
        return repository.save(student);
    }

    @Override
    public void delete(Integer id) {
        repository.deleteById(id);
    }
}
