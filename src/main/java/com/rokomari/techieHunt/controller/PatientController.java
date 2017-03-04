package com.rokomari.techieHunt.controller;

import com.rokomari.techieHunt.model.Doctor;
import com.rokomari.techieHunt.model.Patient;
import com.rokomari.techieHunt.service.PatientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Created by Mainul35 on 3/4/2017.
 */
@RestController
public class PatientController {
    @Autowired
    private PatientService patientService;

    @RequestMapping(value = "/patients")
    public List<Patient> listAllDoctors(){
        return patientService.listAllPatient();
    }

    @RequestMapping(value = "/patients/{id}")
    public Patient getDoctor(@PathVariable("id") String id){
        return patientService.getPatientById(Integer.parseInt(id));
    }
    @RequestMapping(method = RequestMethod.POST, value ="/patients")
    public void addPatoent(@RequestBody Patient patient){
        patientService.addPatient(patient);
    }

    @RequestMapping(method = RequestMethod.PUT, value ="/patients/{id}")
    public void updateDoctor(@RequestBody Patient patient){
        patientService.updatePatient(patient);
    }

    @RequestMapping(method = RequestMethod.DELETE, value = "/patients/{id}")
    public void removeDoctor(@PathVariable("id") String id){
        patientService.deletePatient(Integer.parseInt(id));
    }
}
