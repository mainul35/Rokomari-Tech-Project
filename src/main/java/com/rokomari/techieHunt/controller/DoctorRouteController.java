package com.rokomari.techieHunt.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.rokomari.techieHunt.model.Doctor;

/**
 * Created by Mainul35 on 3/5/2017.
 */
@Controller
public class DoctorRouteController {

    @RequestMapping(method = RequestMethod.GET, value = "/add")
    public String routeToAddDoctor(Model model){
    	model.addAttribute("doctor", new Doctor());
        return "doctor/addDoctor";
    }
}
