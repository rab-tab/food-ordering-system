package com.food.ordering.system.restaurant.service.domain.kafka.producer.exception;

public class KafkaProducerException extends RuntimeException{
    public KafkaProducerException(String message) {
        super(message);
    }
}
