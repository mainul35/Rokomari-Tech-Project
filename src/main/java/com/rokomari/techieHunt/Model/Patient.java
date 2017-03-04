package com.rokomari.techieHunt.Model;

//import org.springframework.data.annotation.Id;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.util.List;

/**
 * Created by Mainul35 on 3/1/2017.
 */
@Entity
public class Patient extends Person{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @NotNull
    private Long id;
    @NotNull
    @Size(max = 60)
    private String name;
    @NotNull
    @Size(max = 250)
    private String patientAddress;
    @OneToOne
    @NotNull
    @JoinColumn(name = "appointmentSerial")
    private Appointment appointmentSerial;
    @NotNull
    @OneToMany(mappedBy = "patient", cascade = CascadeType.ALL)
    private List<Prescription> prescriptions;

    @Override
    public Long getId() {
        return id;
    }

    @Override
    public void setId(Long id) {
        this.id = id;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    public String getPatientAddress() {
        return patientAddress;
    }

    public void setPatientAddress(String patientAddress) {
        this.patientAddress = patientAddress;
    }

    public Appointment getAppointmentSerial() {
        return appointmentSerial;
    }

    public void setAppointmentSerial(Appointment appointmentSerial) {
        this.appointmentSerial = appointmentSerial;
    }

    public List<Prescription> getPrescriptions() {
        return prescriptions;
    }

    public void setPrescriptions(List<Prescription> prescriptions) {
        this.prescriptions = prescriptions;
    }
}
