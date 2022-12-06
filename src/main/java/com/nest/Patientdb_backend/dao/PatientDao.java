package com.nest.Patientdb_backend.dao;

import com.nest.Patientdb_backend.model.Patient;
import org.springframework.data.repository.CrudRepository;

public interface PatientDao extends CrudRepository<Patient,Integer> {
}
