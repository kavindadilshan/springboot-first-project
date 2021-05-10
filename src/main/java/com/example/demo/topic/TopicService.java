package com.example.demo.topic;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class TopicService {
    private List<Topic> topics = new ArrayList<>(
            Arrays.asList(
                    new Topic("spring", "spring framwork", "spring description"),
                    new Topic("spring1", "spring1 framwork", "spring1 description"),
                    new Topic("spring2", "spring2 framwork", "spring2 description")
            )
    );

    public List<Topic> getAllTopics() {
        return topics;
    }

    public Topic getTopic(String id) {
        return topics.stream().filter(t -> t.getId().equals(id)).findFirst().get();
    }

    public void addTopic(Topic topic) {
        topics.add(topic);
    }
}
