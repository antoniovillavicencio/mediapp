package com.tonyvcj.mediappbackend.controller;

import com.tonyvcj.mediappbackend.model.Patient;
import com.tonyvcj.mediappbackend.service.PatientService;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/patients")
public class PatientController {

    private final PatientService patientService;

    public PatientController(PatientService patientService) {
        this.patientService = patientService;
    }

    @GetMapping
    public List<Patient> findAll() throws Exception {
        return patientService.findAll();
    }

    @GetMapping("/{id}")
    public Patient findById(@PathVariable UUID id) throws Exception {
        return patientService.findById(id).orElse(null);
    }

    @PostMapping
    public Patient save(@RequestBody Patient patient) throws Exception {
        return patientService.save(patient);
    }

    @PutMapping
    public Patient edit(@RequestBody Patient patient) throws Exception {
        return patientService.edit(patient);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable UUID id) throws Exception {
        patientService.delete(id);
    }
}
