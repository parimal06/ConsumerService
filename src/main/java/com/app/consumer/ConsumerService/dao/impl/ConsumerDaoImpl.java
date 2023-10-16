package com.app.consumer.ConsumerService.dao.impl;

import com.app.consumer.ConsumerService.dao.ConsumerDao;
import com.app.consumer.ConsumerService.entity.Consumer;
import com.app.consumer.ConsumerService.repository.ConsumerRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ConsumerDaoImpl implements ConsumerDao {

    private static Logger logger = LoggerFactory.getLogger(ConsumerDaoImpl.class);

    @Autowired
    ConsumerRepository consumerRepository;

    @Override
    public Optional<Consumer> getById(Integer consumerID) {
        logger.info("called consumer getById");
        return consumerRepository.findById(consumerID);
    }

    @Override
    public List<Consumer> getAllById(List<Integer> consumerIDs) {
        logger.info("called consumer getAllById");
        return consumerRepository.findAllById(consumerIDs);
    }

    @Override
    public List<Consumer> getAll() {
        logger.info("called consumer getAll");
        return consumerRepository.findAll();
    }

    @Override
    public Consumer save(Consumer consumer) {
        logger.info("called consumer Save");
        return consumerRepository.save(consumer);
    }

    @Override
    public void deleteById(Integer consumerID) {
        logger.info("called consumer delete");
        consumerRepository.deleteById(consumerID);
    }
}
