package com.rokomari.techieHunt.old.Model;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Mainul35 on 3/4/2017.
 */
//@Entity
public class Department {
//    @Id
//    @NotNull
//    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer departmentId;
//    @NotNull
//    @Size(max = 50)
    private String departmentName;
//    @NotNull
//    @OneToMany(mappedBy = "department", cascade = CascadeType.ALL)

    private
    List<Doctor> doctors = new ArrayList<>();

    public Integer getDepartmentId() {
        return departmentId;
    }

    public void setDepartmentId(Integer departmentId) {
        this.departmentId = departmentId;
    }

    public String getDepartmentName() {
        return departmentName;
    }

    public void setDepartmentName(String departmentName) {
        this.departmentName = departmentName;
    }

    public List<Doctor> getDoctors() {
        return doctors;
    }

    public void setDoctors(List<Doctor> doctors) {
        this.doctors = doctors;
    }

}
