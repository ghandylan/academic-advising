package com.example.academicadvising.model;
import jakarta.persistence.*;

@Entity
@Table(name = "admin")
public class Admin {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "admin_number", nullable = false)
    private String adminNumber; // primary key

    @Column(name = "admin_email")
    private String email;

    @Column(name = "admin_password")
    private String password;

    @Column(name = "admin_name")
    private String name;
}
