package com.rokomari.techieHunt.controller;

import com.rokomari.techieHunt.model.Doctor;
import com.rokomari.techieHunt.service.DoctorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

/**
 * Created by Mainul35 on 3/4/2017.
 */
@RestController
public class DoctorController {
    @Autowired
    private DoctorService doctorService;

    @RequestMapping(value = "/doctors")
    public List<Doctor> listAllDoctors(){
        return doctorService.listAllDoctors();
    }

    @RequestMapping(value = "/doctors/{id}")
    public Doctor getDoctor(@PathVariable("id") String id){
        return doctorService.getDoctorById(Integer.parseInt(id));
    }
    @RequestMapping(method = RequestMethod.POST, value ="/doctors")
    public void addDoctor(@RequestBody Doctor doctor){
        doctorService.addDoctor(doctor);
    }

    @RequestMapping(method = RequestMethod.PUT, value ="/doctors/{id}")
    public void updateDoctor(@RequestBody Doctor doctor){
        doctorService.updateDoctor(doctor);
    }

    @RequestMapping(method = RequestMethod.DELETE, value = "/doctors/{id}")
    public void removeDoctor(@PathVariable("id") String id){
        doctorService.removeDoctor(Integer.parseInt(id));
    }
}
