package com.tonyvcj.mediappbackend.service;

import com.tonyvcj.mediappbackend.model.Patient;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

public interface PatientService {

    Patient save(Patient p) throws Exception;

    Patient edit(Patient p) throws Exception;

    List<Patient> findAll() throws Exception;

    Optional<Patient> findById(UUID id) throws Exception;

    void delete(UUID id) throws Exception;
}
