package com.nest.Patientdb_backend.controller;


import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PatientController {

    @CrossOrigin(origins = "*")
    @GetMapping("/viewpatient")
    public String viewpatient(){
        return "view all patient";}

    @CrossOrigin(origins = "*")
    @PostMapping(value = "/addpatient", consumes = "application/json", produces = "application/json")
    public String addpatient(){
        return "add patient";}
}
