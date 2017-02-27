package com.rokomari.techieHunt.Services;

import com.rokomari.techieHunt.Model.Topic;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;
import java.util.NoSuchElementException;

/**
 * Created by Mainul35 on 2/27/2017.
 */
@Service
public class TopicService {
    private List<Topic> topics = Arrays.asList(
            new Topic("java", "Description of JAVA"),
            new Topic("php", "Description of PHP")
    );

    public List<Topic> getAllTopics(){
        return this.topics;
    }

    public Topic getTopic(String topicName){
        try {
            return this.getAllTopics().stream().filter(topic->topic.getTopicName().equals(topicName)).findFirst().get();
        }catch (NoSuchElementException e){
            return null;
        }

    }
}
