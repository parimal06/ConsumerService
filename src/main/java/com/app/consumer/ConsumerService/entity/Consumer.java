package com.app.consumer.ConsumerService.entity;

import javax.persistence.*;
import java.io.Serializable;

@Entity
public class Consumer implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE,generator = "consumer_gen")
    @SequenceGenerator(name = "consumer_gen",sequenceName = "consumer_seq",initialValue = 5,allocationSize=10)
    private Integer consumerID;

    private String consumerName;

    private String consumerAddress;

    private Long consumerContact;

    public Consumer() {
    }

    public Consumer(Integer consumerID, String consumerName, String consumerAddress, Long consumerContact) {
        this.consumerID = consumerID;
        this.consumerName = consumerName;
        this.consumerAddress = consumerAddress;
        this.consumerContact = consumerContact;
    }

    public Integer getConsumerID() {
        return consumerID;
    }

    public void setConsumerID(Integer consumerID) {
        this.consumerID = consumerID;
    }

    public String getConsumerName() {
        return consumerName;
    }

    public void setConsumerName(String consumerName) {
        this.consumerName = consumerName;
    }

    public String getConsumerAddress() {
        return consumerAddress;
    }

    public void setConsumerAddress(String consumerAddress) {
        this.consumerAddress = consumerAddress;
    }

    public Long getConsumerContact() {
        return consumerContact;
    }

    public void setConsumerContact(Long consumerContact) {
        this.consumerContact = consumerContact;
    }
}
