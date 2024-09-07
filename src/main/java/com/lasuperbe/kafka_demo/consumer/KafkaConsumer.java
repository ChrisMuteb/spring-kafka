package com.lasuperbe.kafka_demo.consumer;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class KafkaConsumer {

    @KafkaListener(topics = "chris", groupId = "myGroup")
    public void consumeMsg(String msg){
        log.info(String.format("Consumming the message from Chris topic:: %s", msg));
    }
}
