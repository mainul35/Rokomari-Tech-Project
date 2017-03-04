package com.rokomari.techieHunt.service;

import com.rokomari.techieHunt.model.Patient;
import com.rokomari.techieHunt.repository.PatientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Objects;

/**
 * Created by Mainul35 on 3/4/2017.
 */
@Service
public class PatientService {
    @Autowired
    PatientRepository patientRepository;

    public List<Patient> listAllPatient(){
        List<Patient> patients = new ArrayList<>();
        patientRepository.findAll().forEach(patients::add);
        return patients;
    }

    public Patient getPatientById(Integer id){
        return this.listAllPatient().stream()
                .filter(p -> Objects.equals(p.getId(), id))
                .findFirst()
                .orElse(null);
    }

    public void addPatient(Patient p){
        patientRepository.save(p);
    }

    public void updatePatient(Patient p){
        patientRepository.save(p);
    }

    public void deletePatient(Integer id){
        patientRepository.delete(id);
    }
}
