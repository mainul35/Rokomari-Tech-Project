package com.rokomari.techieHunt.old.Model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

/**
 * Created by Mainul35 on 2/27/2017.
 */
@Entity
public class Topic {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @NotNull
    Long id;
    @Size(max = 25)
    @NotNull
    String topicName;
    @NotNull
    @Size(max = 200)
    String topicDescription;

    public Topic() {
    }

    public Topic(Long id, String topicName, String topicDescription) {
        this.id = id;
        this.topicName = topicName;
        this.topicDescription = topicDescription;
    }

    public Topic(String topicName, String topicDescription) {
        this.topicName = topicName;
        this.topicDescription = topicDescription;
    }

    public String getTopicName() {
        return topicName;
    }

    public void setTopicName(String topicName) {
        this.topicName = topicName;
    }

    public String getTopicDescription() {
        return topicDescription;
    }

    public void setTopicDescription(String topicDescription) {
        this.topicDescription = topicDescription;
    }
}
