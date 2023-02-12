package com.example.universityEvent.service;

import com.example.universityEvent.model.Student;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

@Service
public class StudentService {
    private static List<Student> students = new ArrayList<>();

    private static int studentCount = 0;

    static {
        students.add(new Student(++studentCount, "Ram", "Kumar", 24, "electrical"));
        students.add(new Student(++studentCount, "Shyam", "Kumar", 20, "Mechanical"));
        students.add(new Student(++studentCount, "Reeta", "Kumari", 23, "civil"));
        students.add(new Student(++studentCount, "Sita", "Kumari", 25, "electronics"));
        students.add(new Student(++studentCount, "Punam", "Kumari", 24, "computer"));
    }
    public static List<Student>findAll(){
        return students;
    }
   public void addStudent(Student student){
        students.add(student);
   }
   public Student findById(int id){
       Predicate<?super Student>predicate=student -> student.getStudentId()==id;
       Student student=students.stream().filter(predicate).findFirst().get();
       return student;
   }
   public void updateStudentDept(int id,Student newStudent){
        Student student=findById(id);
        student.setStudentId(newStudent.getStudentId());
        student.setDepartment(newStudent.getDepartment());
   }
   public void DeleteStudent(int studentId){
        Predicate<?super Student>predicate=student -> student.getStudentId()==studentId;
        students.removeIf(predicate);
   }
}
