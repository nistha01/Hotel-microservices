package io.nitish.hotelService.controller;


import io.nitish.hotelService.model.Hotel;
import io.nitish.hotelService.service.HotelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class HotelController {
    @Autowired
    HotelService hotelService;
    @GetMapping("hotel/id/{id}")
    public Hotel getHotelById(@PathVariable Integer id){
       return hotelService.getHotelById(id);
    }
}
