package com.example.demo.Entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="student1")
public class Student {
	@Id
	@Column(name="RollNo")
	@GeneratedValue
	private int roll;
	
	@Column(name="Name")
	@GeneratedValue
	private String name;
	
	@Column(name="address")
	@GeneratedValue
	private String address;
	
	Student(){}
	
	Student(int roll,String name,String address){
		this.roll = roll;
	}
	
	//Getters and Setters
	public int getRollNo(){
		return roll;
	}
	
	public void setRollNo(int roll) {
	   this.roll = roll;
	}
	
	public String getName() {
	   return name;
	}
	
	public void setName(String name) {
	   this.name = name;
	}
	
	public String getAddress() {
	   return address;
	}
	public void setAddress(String address) {
	   this.address = address;
	}
	

}
