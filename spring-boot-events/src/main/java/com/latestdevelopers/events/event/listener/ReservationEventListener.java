package com.latestdevelopers.events.event.listener;

import com.latestdevelopers.events.event.ReservationCreatedEvent;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

@Component
public class ReservationEventListener {
    @EventListener
    public void reservationEventHandler(ReservationCreatedEvent reservationCreatedEvent) throws InterruptedException {
        Thread.sleep(5000);
        System.out.println("event listener budur : "+reservationCreatedEvent.getSource().toString());

    }
}
