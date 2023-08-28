package com.example.test2808.student;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;

@Repository
public class InMemoryStudentDao {
    private final List<Student> STUDENT=new ArrayList<>();

    public List<Student> findAllStudent() {
        return STUDENT;
    }


    public Student save(Student student) {
        STUDENT.add(student);
        return student;
    }


    public Student findByEmail(String email) {
        return STUDENT.stream()
                .filter(student -> email.equals(student.getEmail()))
                .findFirst()
                .orElse(null);
    }


    public Student update(Student student) {
        var studentIndex= IntStream.range(0,STUDENT.size())
                .filter(index->STUDENT.get(index).getEmail().equals(student.getEmail()))
                .findFirst()
                .orElse(-1);
        if (studentIndex>-1){
            STUDENT.set(studentIndex,student);
        }
        return student;
    }


    public void delete(String email) {
        var student=findByEmail(email);
        if (student!=null){
            STUDENT.remove(student);
        }
    }
}
