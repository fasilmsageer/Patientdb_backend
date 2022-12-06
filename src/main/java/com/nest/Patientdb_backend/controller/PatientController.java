package com.nest.Patientdb_backend.controller;


import com.nest.Patientdb_backend.dao.PatientDao;
import com.nest.Patientdb_backend.model.Patient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class PatientController {


    @Autowired
    private PatientDao dao;

    @CrossOrigin(origins = "*")
    @GetMapping("/viewpatient")
    public List<Patient> viewpatient(){
        return (List<Patient>) dao.findAll();}

    @CrossOrigin(origins = "*")
    @PostMapping(value = "/addpatient", consumes = "application/json", produces = "application/json")
    public String addpatient(@RequestBody Patient p){
        System.out.println(p.getName().toString());
        System.out.println(p.getAge().toString());
        System.out.println(p.getGender().toString());
        System.out.println(p.getDoctor().toString());

        dao.save(p);


        return "add patient";}
}
