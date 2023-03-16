package com.example.academicadvising.model;

import jakarta.persistence.*;

@Entity
@Table(name = "student")
public class Student {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "student_number")
    private String studentNumber; // primary key

    @Column(name = "student_email")
    private String email;

    @Column(name = "student_password")
    private String password;

    @Column(name = "student_name")
    private String name;

    @Column(name = "student_contact_no")
    private String contact_number;

    @Column(name = "student_program")
    private String program;

    @Column(name = "student_year")
    private int year;

    @Column(name = "student_concern")
    private String concern;

    @Column(name = "class_id") // foreign key
    private int class_id;
}
