package com.nest.Patientdb_backend.controller;


import com.nest.Patientdb_backend.dao.PatientDao;
import com.nest.Patientdb_backend.model.Patient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
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
        return "Patient added";}

    @CrossOrigin(origins = "*")
    @PostMapping(value = "/searchpatient", consumes = "application/json", produces = "application/json")
    public List<Patient> searchpatient(@RequestBody Patient p){
        String name = String.valueOf(p.getName()) ;
        System.out.println(name);
        return (List<Patient>) dao.SearchPatient(p.getName());
    }

    @CrossOrigin
    @PostMapping(path= "/deletepatient", consumes = "application/json", produces = "application/json")
    public HashMap<String, String> deletepatient(@RequestBody Patient p){
        String patientid=String.valueOf(p.getId());
        System.out.println(patientid);
        dao.DeletePatient(p.getId());
        HashMap<String ,String> map=new HashMap<>();
        map.put("status","success");
        return map;
    }



}
