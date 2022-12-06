package com.nest.Patientdb_backend.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "patient")

public class Patient {

    @Id
    @GeneratedValue()

    private int id;
    private String name;
    private String age;
    private String gender;
    private String doctor;

    public Patient(){}

    public Patient(int id, String name, String age, String gender, String doctor) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.doctor = doctor;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getDoctor() {
        return doctor;
    }

    public void setDoctor(String doctor) {
        this.doctor = doctor;
    }
}
