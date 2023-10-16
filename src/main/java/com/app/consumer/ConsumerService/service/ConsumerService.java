package com.app.consumer.ConsumerService.service;

import com.app.consumer.ConsumerService.entity.Consumer;

import java.util.List;

public interface ConsumerService {
    Consumer fetchConsumer(Integer consumerID);

    List<Consumer> fetchConsumers(List<Integer> consumerID);

    Consumer createConsumer(Consumer consumer);

    String removeConsumer(Integer consumerID);

    Consumer updateConsumer(Consumer consumer);


    List<Consumer> fetchAllConsumers();
}
