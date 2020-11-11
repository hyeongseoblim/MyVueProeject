package com.web.custom;

import org.springframework.boot.autoconfigure.flyway.FlywayDataSource;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.context.ApplicationListener;
import org.springframework.context.annotation.Bean;
import org.springframework.context.event.EventListener;
import org.springframework.core.Ordered;
import org.springframework.core.annotation.Order;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Component;

@Component
public class MyEventHandler {
    @EventListener
    @Async
    public void handle(MyEvent myEvent) {
        System.out.println(Thread.currentThread().toString());

        System.out.println("Data is "+ myEvent.getData());
    }
}
