package com.example.demo.entity;
//import Student from entity;

@Entity
public class Student{

    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private int id;
    private String name;
    private int password;
    private String role;
}
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
    
}
