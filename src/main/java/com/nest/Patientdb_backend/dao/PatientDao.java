package com.nest.Patientdb_backend.dao;

import com.nest.Patientdb_backend.model.Patient;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface PatientDao extends CrudRepository<Patient,Integer> {

    @Query(value = "SELECT `id`, `age`, `doctor`, `gender`, `name` FROM `patient` WHERE `name` LIKE %:name%",nativeQuery = true)
    List<Patient> SearchPatient(@Param("name")String name);
}
