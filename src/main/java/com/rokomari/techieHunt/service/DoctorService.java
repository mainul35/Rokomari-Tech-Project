package com.rokomari.techieHunt.service;

import com.rokomari.techieHunt.model.Doctor;
import com.rokomari.techieHunt.old.Model.Topic;
import com.rokomari.techieHunt.repository.DoctorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.print.Doc;
import java.util.*;

/**
 * Created by Mainul35 on 3/4/2017.
 */

@Service
@Transactional
public class DoctorService {
    @Autowired
    DoctorRepository doctorRepository;

    public List<Doctor> listAllDoctors() {
        List<Doctor> doctors = new ArrayList<>();
        doctorRepository.findAll().forEach(doctors::add);
        return doctors;
    }

    public Doctor getDoctorById(Integer id) {
        return this.listAllDoctors().stream()
                .filter(p -> Objects.equals(p.getId(), id))
                .findFirst()
                .orElse(null);
    }

    public void addDoctor(Doctor doctor) {
        doctorRepository.save(doctor);
    }

    public void updateDoctor(Doctor doctor) {
        doctorRepository.save(doctor);
    }

    public void removeDoctor(Integer id) {
        doctorRepository.delete(id);
    }

}
