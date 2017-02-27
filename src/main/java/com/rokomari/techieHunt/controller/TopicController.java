package com.rokomari.techieHunt.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Mainul35 on 2/27/2017.
 */
@RestController
public class TopicController {

    @RequestMapping("/topics")
    public String getAllTopics(){
        return "Topics returned";
    }
}
