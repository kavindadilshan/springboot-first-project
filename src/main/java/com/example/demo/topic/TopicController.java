package com.example.demo.topic;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
public class TopicController {
    @RequestMapping("/topic")
    public List<Topic> topic(){
        return Arrays.asList(
                new Topic("spring","spring framwork","spring description"),
                new Topic("spring1","spring1 framwork","spring1 description"),
                new Topic("spring2","spring2 framwork","spring2 description")
        );
    }
}
