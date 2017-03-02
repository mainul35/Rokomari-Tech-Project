package com.rokomari.techieHunt.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by Mainul35 on 3/3/2017.
 */
@Controller
public class HomeController {
    @RequestMapping("/")
    public String index(){
        return "index";
    }
}
