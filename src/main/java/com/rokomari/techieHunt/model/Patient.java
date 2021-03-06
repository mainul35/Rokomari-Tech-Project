package com.rokomari.techieHunt.model;

import javax.persistence.*;
import javax.print.Doc;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.util.ArrayList;
import java.util.Collection;

/**
 * Created by Mainul35 on 3/4/2017.
 */
@Entity
public class Patient {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    @NotNull
    @Size(max = 60)
    private String patientName;
    @NotNull
    @Size(max = 200)
    private String patientAddress;
    @NotNull
    private String patientProblem;
    @NotNull
    @ManyToOne
    @JoinTable(name = "DOCTOR_PATIENT",
            joinColumns = @JoinColumn(name = "DOCTOR_ID"),
            inverseJoinColumns = @JoinColumn(name = "PATIENT_ID"))

    private
    Doctor doctor;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getPatientName() {
        return patientName;
    }

    public void setPatientName(String patientName) {
        this.patientName = patientName;
    }

    public String getPatientAddress() {
        return patientAddress;
    }

    public void setPatientAddress(String patientAddress) {
        this.patientAddress = patientAddress;
    }

    public Doctor getDoctor() {
        return doctor;
    }

    public void setDoctors(Doctor doctor) {
        this.doctor = doctor;
    }

    public String getPatientProblem() {
        return patientProblem;
    }

    public void setPatientProblem(String patientProblem) {
        this.patientProblem = patientProblem;
    }
}
