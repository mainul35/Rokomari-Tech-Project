package com.rokomari.techieHunt.Model;

/**
 * Created by Mainul35 on 2/27/2017.
 */
public class Topic {
    String topicName;
    String topicDescription;

    public Topic() {}

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
