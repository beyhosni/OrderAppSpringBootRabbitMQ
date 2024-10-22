package com.orderapp.consumer;

import com.orderapp.model.Order;
import org.springframework.stereotype.Service;
import org.springframework.amqp.rabbit.annotation.RabbitListener;

public class OrderConsumer {

    @RabbitListener(queues = "${rabbitmq.queue}")
    public void receiveOrder(Order order) {
        System.out.println("Commande reçue : " + order);
    }
}
