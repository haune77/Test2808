package com.example.test2808.student;

import lombok.Data;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;

@Service
@Data
public class InMemoryStudentService implements StudentService{

    private final InMemoryStudentDao dao;

    @Override
    public List<Student> findAllStudent() {
        return dao.findAllStudent();
    }

    @Override
    public Student save(Student student) {
        return dao.save(student);
    }

    @Override
    public Student findByEmail(String email) {
        return dao.findByEmail(email);
    }

    @Override
    public Student update(Student student) {
        return dao.update(student);
    }

    @Override
        public void delete(Integer id) {
        dao.delete(id);
    }
}
