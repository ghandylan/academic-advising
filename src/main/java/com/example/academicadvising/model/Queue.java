package com.example.academicadvising.model;
import jakarta.persistence.*;

@Entity
@Table(name = "queue")
public class Queue {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(name = "queue_ID", nullable = false)
    private String queue_ID; // primary key

    @Column(name = "student_number") // foreign key
    private String studentNumber;

    @Column(name = "admin_number") // foreign key
    private String adminNumber;

    @Column(name = "queue_status")
    private String status;
}