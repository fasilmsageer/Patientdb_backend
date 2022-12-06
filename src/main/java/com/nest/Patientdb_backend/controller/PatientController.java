package com.nest.Patientdb_backend.controller;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;

@Entity
@Table(name = "patient")

public class PatientController {

    @CrossOrigin(origins = "*")
    @GetMapping("/")
    public String viewpatient()
        return
}
