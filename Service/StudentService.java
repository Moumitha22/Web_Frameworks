package com.example.demo.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Entity.Student;
import com.example.demo.Repository.StudentRepository;

@Service
public class StudentService {
   @Autowired
   
   private StudentRepository stuRepo;
   
   //TO POST - INSERT
   public Student saveStudent(Student student) {
	   return stuRepo.save(student);
   }
   
   //TO GET - READ
   public List<Student> getAllStudents(){
	   return stuRepo.findAll();
   }
   
   public Student getStudentById(int roll){
	   return stuRepo.findById(roll).orElse(null);
   }
   
   public void deleteDepartmentById(int id) {
	   stuRepo.deleteById(id);
   }
   
}