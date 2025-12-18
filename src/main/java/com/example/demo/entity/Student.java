package com.example.demo.entity;

import org.springframework.data.annotation.Id;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;

@Entity
public class Student{

    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private int id;
    private String name;
    private String password;
    private String role;

public Student(int id, String name, String password, String role){
    this.id = id;
    this.name = name;
    this.password = password;
    this.role = role;
}
public Student(){

}
public int getId(){
    return id;
}
public void setId(int id){
    this.id = id;
}
public String getName(){
    return name;
}
public void setName(String name){
    this.name = name;
}
public String getPassword(){
    return password;
}
public void setPassword(String password){
    this.password = password;
}
public String getRole(){
    return role;
}
public void setRole(String role){
    this.role = role;
}
}
