package com.rokomari.techieHunt.Controller;

import com.rokomari.techieHunt.Model.Topic;
import com.rokomari.techieHunt.Services.TopicService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Created by Mainul35 on 2/27/2017.
 */
@RestController
public class TopicController {

    @Autowired
    private TopicService topicService;

    @RequestMapping("/topics")
    public List<Topic> getAllTopics(){
        return topicService.getAllTopics();
    }

    @RequestMapping("/topics/{id}")
    public Topic getList(@PathVariable("id") String id){
        return topicService.getTopic(id);
    }

    @RequestMapping(method = RequestMethod.POST, value ="/topics")
    public void addTopic(@RequestBody Topic topic){
        topicService.addTopic(topic);
    }

    @RequestMapping(method = RequestMethod.PUT, value ="/topics/{id}")
    public void addTopic(@RequestBody Topic topic, @PathVariable String id){
        topicService.addTopic(id, topic);
    }

    @RequestMapping(method = RequestMethod.DELETE, value = "/topics/{id}")
    public void deleteList(@PathVariable("id") String id){
        topicService.deleteTopic(id);
    }
}
