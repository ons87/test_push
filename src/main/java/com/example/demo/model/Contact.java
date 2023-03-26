package com.example.demo.model;

import javax.persistence.*;
import java.io.Serializable;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "CONTACT")
@Getter
@Setter
public class Contact implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(nullable = false, updatable = true)
    private Long id;

    private String first_name;
    private String last_name;
    private String gender;
    private String email;
    private String company;





}
