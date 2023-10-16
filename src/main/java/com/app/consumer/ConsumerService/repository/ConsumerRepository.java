package com.app.consumer.ConsumerService.repository;

import com.app.consumer.ConsumerService.entity.Consumer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ConsumerRepository extends JpaRepository<Consumer, Integer> {
}
