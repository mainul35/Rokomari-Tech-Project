package com.rokomari.techieHunt.old.Model;

//import org.springframework.data.annotation.Id;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/**
 * Created by Mainul35 on 3/1/2017.
 */
//@Entity
public class Doctor extends Person {
//    @Id
//    @GeneratedValue(strategy = GenerationType.AUTO)
//    @NotNull
    private Long id;
//    @NotNull
//    @Size(max = 60)
    private String name;
//    @NotNull
//    @OneToMany
//    @JoinTable(name = "DOCTOR_APPOINTMENT",
//            joinColumns = @JoinColumn(name = "doctorId"),
//            inverseJoinColumns = @JoinColumn(name = "appointmentId")
//    )
    private
    Collection<Appointment> appointments = new ArrayList<Appointment>();
//    @OneToMany(mappedBy = "doctor", cascade = CascadeType.ALL)
    private
    List<Prescription> prescriptions = new ArrayList<>();

//    @NotNull
    private boolean requestApproved;
//    @NotNull
//    @Size(max = 50)
    private String username;
//    @NotNull
//    @Size(max = 100)
    private String password;
//    @ManyToOne(targetEntity = Department.class)
//    @NotNull
//    @JoinTable(name = "DEPARTMENT_DOCTOR",
//            joinColumns = @JoinColumn(name = "doctorId"),
//            inverseJoinColumns = @JoinColumn(name = "departmentId")
//    )
    private Department department;
    @Override
    public Long getId() {
        return this.id;
    }

    @Override
    public void setId(Long id) {
        this.id = id;
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    public Collection<Appointment> getAppointments() {
        return appointments;
    }

    public void setAppointments(Collection<Appointment> appointments) {
        this.appointments = appointments;
    }

    public List<Prescription> getPrescriptions() {
        return prescriptions;
    }

    public void setPrescriptions(List<Prescription> prescriptions) {
        this.prescriptions = prescriptions;
    }

    public boolean isRequestApproved() {
        return requestApproved;
    }

    public void setRequestApproved(boolean requestApproved) {
        this.requestApproved = requestApproved;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Department getDepartment() {
        return department;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }
}
