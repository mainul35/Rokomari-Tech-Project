package com.rokomari.techieHunt.repository;

import com.rokomari.techieHunt.model.Doctor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by Mainul35 on 3/4/2017.
 */
@Repository
public interface DoctorRepository extends JpaRepository<Doctor, Integer> {
}
