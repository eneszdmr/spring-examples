package com.latestdevelopers.events.service;

import com.latestdevelopers.events.HotelBookRequest;
import com.latestdevelopers.events.event.ReservationCreatedEvent;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.stereotype.Service;

@Service
public class ReservationService {

    @Autowired
    private ApplicationEventPublisher applicationEventPublisher;

    public void publishReservationEvent(HotelBookRequest hotelBookRequest) {
        applicationEventPublisher.publishEvent(new ReservationCreatedEvent(hotelBookRequest));
    }
}
