package com.rokomari.techieHunt.Services;

import com.rokomari.techieHunt.Model.Topic;
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
    private List<Topic> topics = new ArrayList<>(Arrays.asList(
            new Topic("java", "Description of JAVA"),
            new Topic("php", "Description of PHP")
    ));

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

    public void addTopic(Topic topic){
        this.getAllTopics().add(topic);
    }

    public void addTopic(String id, Topic topic) {
        for(int i = 0; i<topics.size(); i++){
            if(topics.get(i).getTopicName().equals(id)){
                topics.set(i, topic);
            }
        }
    }

    public void deleteTopic(String id) {
        topics.removeIf(t->{return t.getTopicName().equals(id);});
    }
}
