package com.nest.Patientdb_backend.controller;


import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PatientController {

    @CrossOrigin(origins = "*")
    @GetMapping("/viewpatient")
    public String viewpatient(){
        return "view all employee";}
}
