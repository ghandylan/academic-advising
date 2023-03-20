package com.example.academicadvising.model;

import jakarta.persistence.*;

@Entity
public class Class {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(name = "class_id", nullable = false)
    private Long class_ID;

    @Column(name = "class_name")
    private String class_name;

    @Column(name = "class_code")
    private String class_code;

    @Column(name = "teacher_name")
    private String teacher_name;

    @Column(name = "admin_number") // foreign key
    private String adminNumber;
}
