package com.example.hoangspring.entity;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "SpringDemo")
public class User {

    @Id
    @Column(name = "id")
   private Long id;

    @Column(name = "name")
    private  String name;
}
