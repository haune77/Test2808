package com.example.test2808.student;

import org.springframework.beans.factory.annotation.Autowired;
<<<<<<< HEAD
=======
import org.springframework.beans.factory.annotation.Qualifier;
>>>>>>> cecd741 (initializing spring boot project)
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/student")
public class StudentController {

<<<<<<< HEAD
    @Autowired
    private StudentService service;
=======

    private final StudentService service;
    public StudentController(@Qualifier("DBStudentService") StudentService service) {
        this.service = service;
    }

>>>>>>> cecd741 (initializing spring boot project)
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

<<<<<<< HEAD
    @DeleteMapping("/{email}")
    public void delete(@PathVariable("email") String email){
        service.delete(email);
=======
    @DeleteMapping("/{id}")
    public void delete(@PathVariable("id") Integer id){
        service.delete(id);
>>>>>>> cecd741 (initializing spring boot project)
    }
}
