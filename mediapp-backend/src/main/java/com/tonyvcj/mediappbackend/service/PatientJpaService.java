package com.tonyvcj.mediappbackend.service;

import com.tonyvcj.mediappbackend.model.Patient;
import com.tonyvcj.mediappbackend.repository.PatientRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Service
public class PatientJpaService implements PatientService{

    private final PatientRepository repository;

    public PatientJpaService(PatientRepository repository) {
        this.repository = repository;
    }

    @Override
    public Patient save(Patient p) throws Exception {
        return repository.save(p);
    }

    @Override
    public Patient edit(Patient p) throws Exception {
        return repository.save(p);
    }

    @Override
    public List<Patient> findAll() throws Exception {
        return repository.findAll();
    }

    @Override
    public Optional<Patient> findById(UUID id) throws Exception {
        return repository.findById(id);
    }

    @Override
    public void delete(UUID id) throws Exception {
        repository.deleteById(id);
    }
}
