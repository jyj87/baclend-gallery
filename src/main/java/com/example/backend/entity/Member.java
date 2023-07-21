package com.example.backend.entity;

import lombok.Getter;

import javax.persistence.*;

@Table(name = "members")
@Entity
@Getter
public class Member {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(length = 50, nullable = false , unique = true)
    private String email;

    @Column(length = 100, nullable = false)
    private String password;

}
