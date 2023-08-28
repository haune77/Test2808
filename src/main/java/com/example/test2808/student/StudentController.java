package com.example.test2808.student;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.beans.factory.annotation.Qualifier;

import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/student")
public class StudentController {



    private final StudentService service;

    public StudentController(@Qualifier("DBStudentService") StudentService service) {
        this.service = service;
    }


    @PostMapping
    public Student save(@RequestBody Student student){
        return service.save(student);
    }

    @GetMapping("/{email}")
    public Student findByEmail(@PathVariable("email") String email){
        return service.findByEmail(email);
    }

    @GetMapping
    public List<Student> findAllStudent(){
        return service.findAllStudent();
    }

    @PutMapping
    public Student studentUpdate(@RequestBody Student student){
        return service.update(student);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable("id") Integer id){
        service.delete(id);
    }
}
