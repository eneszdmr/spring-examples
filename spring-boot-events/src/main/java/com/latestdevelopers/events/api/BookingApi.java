package com.latestdevelopers.events.api;

import com.latestdevelopers.events.HotelBookRequest;
import com.latestdevelopers.events.service.ReservationService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/getir")
public class BookingApi {

    private ReservationService reservationService;
    @PostMapping
    public void bookHotel(@RequestBody HotelBookRequest hotelBookRequest) {
        reservationService.publishReservationEvent(hotelBookRequest);
        System.out.println("kullanici isleme alindi"+hotelBookRequest);

    }
}
