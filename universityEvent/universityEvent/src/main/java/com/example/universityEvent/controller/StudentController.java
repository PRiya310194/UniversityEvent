package com.example.universityEvent.controller;

import com.example.universityEvent.model.Student;
import com.example.universityEvent.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/student")
public class StudentController {
    @Autowired
    private StudentService studentService;

    @PostMapping("add-student")
    public void addNewStudent(@RequestBody Student student){
        studentService.addStudent(student);
    }
   @PutMapping("update-department")
   public void updateDepartment(@PathVariable int id,@RequestBody Student student){
        studentService.updateStudentDept(id,student);
    }
    @GetMapping("/find-student/id/{id}")
    public Student findByStudentId(@PathVariable int id){
        return studentService.findById(id);
    }
    @GetMapping("/find-all")
    public List<Student> findAllStudent(){
        return StudentService.findAll();
    }
    @DeleteMapping("delete-student/id/{id}")
    public void DeleteStu(@PathVariable int id){
         studentService.DeleteStudent(id);
    }
}
