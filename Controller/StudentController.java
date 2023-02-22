package com.example.demo.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Entity.Student;
import com.example.demo.Service.StudentService;

@RestController
public class StudentController {
   
	@Autowired   
   private StudentService stuService;
   
   @PostMapping("/addStudent")
   public String saveStudent(@RequestBody Student s) {
	   stuService.saveStudent(s);
	   return "Value Added";
   }
   
   @GetMapping("/getStudent")
   public List<Student> getAllStudents(){
	   return stuService.getAllStudents();
   }

   @GetMapping("/{roll}")
   public Student getStudentById(@PathVariable int roll) {
       return stuService.getStudentById(roll);
   }
}