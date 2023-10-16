package com.app.consumer.ConsumerService.controller;

import com.app.consumer.ConsumerService.entity.Consumer;
import com.app.consumer.ConsumerService.service.ConsumerService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController()
@RequestMapping("/consumer")
public class ConsumerController {

    private static Logger logger = LoggerFactory.getLogger(ConsumerController.class);

    @Autowired
    ConsumerService consumerService;

    @GetMapping("/getConsumer")
    public Consumer getConsumer(@RequestParam("consumerID") Integer consumerID){
        logger.info("called getConsumer");
        Consumer consumerEntity = consumerService.fetchConsumer(consumerID);
        return consumerEntity;
    }

    @GetMapping("/getConsumers")
    public List<Consumer> getConsumers(@RequestParam("consumerIDS") List<Integer> consumerIDs){
        logger.info("called getConsumers");
        List<Consumer> consumerEntities = consumerService.fetchConsumers(consumerIDs);
        return consumerEntities;
    }

    @GetMapping("/getAllConsumers")
    public List<Consumer> getAllConsumer(){
        logger.info("called getAllConsumer");
        List<Consumer> consumerEntities = consumerService.fetchAllConsumers();
        return consumerEntities;
    }

    @PostMapping("/saveConsumer")
    public String saveConsumer(@RequestBody Consumer consumer){
        logger.info("called saveConsumer");
        Consumer consumerEntity = consumerService.createConsumer(consumer);
        if(consumerEntity!=null && consumerEntity.getConsumerID()>0){
            return "Saved!";
        }
        return "Please try again!";

    }

    @DeleteMapping("/deleteConsumer")
    public String deleteConsumer(@RequestParam("consumerID") Integer consumerID){
        logger.info("called deleteConsumer");
        return consumerService.removeConsumer(consumerID);
    }

    @PutMapping("/updateConsumer")
    public Consumer updateConsumer(@RequestBody Consumer consumer){
        logger.info("called updateConsumer");
        Consumer consumerEntity = consumerService.updateConsumer(consumer);
        return consumerEntity;
    }

}
