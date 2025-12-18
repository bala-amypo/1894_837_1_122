package com.example.demo.entity;
import jakarta.persistence.*;


public class Influencer{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private Long id;
    private String name;
    private String socialHandle;
    private boolean active;

public Influencer{

}
public Influencer(String name, String socialHandle, boolean active){
    this.name = name;
    this.socialHandle = socialHandle;
    this.active = active;
}

}