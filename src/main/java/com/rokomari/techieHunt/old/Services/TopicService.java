package com.rokomari.techieHunt.old.Services;

import com.rokomari.techieHunt.old.Model.Topic;
import com.rokomari.techieHunt.old.repositories.TopicRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.NoSuchElementException;

/**
 * Created by Mainul35 on 2/27/2017.
 */
@Service
public class TopicService {

    @Autowired
    private TopicRepository topicRepository;

    private List<Topic> topics = new ArrayList<>(Arrays.asList(
            new Topic(1L,"java", "Description of JAVA"),
            new Topic(2L, "php", "Description of PHP")
    ));

    public List<Topic> getAllTopics(){
        List<Topic> topics = new ArrayList<>();
//        topicRepository.findAll().forEach(topics::add);
        return topics;
    }

    public Topic getTopic(String topicName){
        try {
            return this.getAllTopics().stream().filter(topic->topic.getTopicName().equals(topicName)).findFirst().get();
        }catch (NoSuchElementException e){

        }
        return null;
    }

    public void addTopic(Topic topic){
        topicRepository.save(topic);
    }

    public void addTopic(String id, Topic topic) {
        topicRepository.save(topics.get(0));
    }

    public void deleteTopic(String id) {
        topics.removeIf(t->{return t.getTopicName().equals(id);});
    }
}
