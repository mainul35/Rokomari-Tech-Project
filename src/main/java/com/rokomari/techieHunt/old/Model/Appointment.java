package com.rokomari.techieHunt.old.Model;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.time.LocalDateTime;

/**
 * Created by Mainul35 on 3/3/2017.
 */
//@Entity
public class Appointment {
//    @Id
//    @GeneratedValue(strategy = GenerationType.AUTO)
//    @NotNull
    private Long appointmentId;
//    @NotNull
    private
    LocalDateTime appointmentDate;
//    @NotNull
//    @OneToOne
    private Patient assignedPatient;
//    @NotNull
//    @ManyToOne
    private Doctor assignedDoctor;

    public Appointment() {
    }

    public Appointment(LocalDateTime appointmentDate, Patient assignedPatient, Doctor assignedDoctor) {
        this.appointmentDate = appointmentDate;
        this.assignedPatient = assignedPatient;
        this.assignedDoctor = assignedDoctor;
    }

    public Long getAppointmentId() {
        return appointmentId;
    }

    public void setAppointmentId(Long appointmentId) {
        this.appointmentId = appointmentId;
    }

    public LocalDateTime getAppointmentDate() {
        return appointmentDate;
    }

    public void setAppointmentDate(LocalDateTime appointmentDate) {
        this.appointmentDate = appointmentDate;
    }

    public Patient getAssignedPatient() {
        return assignedPatient;
    }

    public void setAssignedPatient(Patient assignedPatient) {
        this.assignedPatient = assignedPatient;
    }

    public Doctor getAssignedDoctor() {
        return assignedDoctor;
    }

    public void setAssignedDoctor(Doctor assignedDoctor) {
        this.assignedDoctor = assignedDoctor;
    }
}
