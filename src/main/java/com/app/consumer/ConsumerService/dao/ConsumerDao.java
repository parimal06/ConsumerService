package com.app.consumer.ConsumerService.dao;

import com.app.consumer.ConsumerService.entity.Consumer;
import java.util.List;
import java.util.Optional;

public interface ConsumerDao{
    Optional<Consumer> getById(Integer consumerID);

    List<Consumer> getAllById(List<Integer> consumerIDs);

    List<Consumer> getAll();

    Consumer save(Consumer consumer);

    void deleteById(Integer consumerID);
}
