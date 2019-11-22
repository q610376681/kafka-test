package com.example.kafka;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;

import static javafx.scene.input.KeyCode.R;


@RestController
@RequestMapping("/test")
public class SenderController {

    @Autowired
    private KafkaTemplate kafkaTemplate;

    @RequestMapping(value = "/producer")
    public String consume(String body) throws IOException {
        kafkaTemplate.send("result",body);
        return "ok";
    }
}