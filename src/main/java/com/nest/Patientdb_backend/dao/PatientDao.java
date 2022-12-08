package com.nest.Patientdb_backend.dao;

import com.nest.Patientdb_backend.model.Patient;
import jakarta.transaction.Transactional;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface PatientDao extends CrudRepository<Patient,Integer> {

    @Query(value = "SELECT `id`, `age`, `doctor`, `gender`, `name` FROM `patient` WHERE `name` LIKE %:name%",nativeQuery = true)
    List<Patient> SearchPatient(@Param("name")String name);

    @Modifying
    @Transactional
    @Query(value = "DELETE FROM `patient` WHERE `id` =:id",nativeQuery = true)
    void DeletePatient(@Param("id")Integer id);
}
