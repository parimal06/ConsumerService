package com.app.consumer.ConsumerService.service.impl;

import com.app.consumer.ConsumerService.dao.ConsumerDao;
import com.app.consumer.ConsumerService.entity.Consumer;
import com.app.consumer.ConsumerService.service.ConsumerService;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;
import java.util.Optional;

@Service
public class ConsumerServiceImpl implements ConsumerService {

    private static Logger logger = LoggerFactory.getLogger(ConsumerServiceImpl.class);

    @Autowired
    ConsumerDao consumerDao;

    @Override
    public Consumer fetchConsumer(Integer consumerID) {
        logger.info("fetch for consumerID "+consumerID);
        Optional<Consumer> consumerEntity = consumerDao.getById(consumerID);
        return consumerEntity.get();
    }

    @Override
    public List<Consumer> fetchConsumers(List<Integer> consumerIDs) {
        logger.info("fetch for consumerIDs "+consumerIDs);
        List<Consumer> consumerEntities = consumerDao.getAllById(consumerIDs);
        return consumerEntities;
    }

    @Override
    public List<Consumer> fetchAllConsumers() {
        logger.info("fetch for All consumer");
        return consumerDao.getAll();
    }

    @Override
    @Transactional
    public Consumer createConsumer(Consumer consumer) {
        logger.info("create new consumer called!");
        Consumer consumerEntity = consumerDao.save(consumer);
        return consumerEntity;
    }

    @Override
    @Transactional
    public String removeConsumer(Integer consumerID) {
        logger.info("remove for consumerID "+consumerID);
        consumerDao.deleteById(consumerID);
        return "Success!";
    }

    @Override
    @Transactional
    public Consumer updateConsumer(Consumer consumer) {
        logger.info("update for consumerID "+consumer.getConsumerID());
        Consumer consumerEntity = consumerDao.save(consumer);
        return consumerEntity;
    }
}
