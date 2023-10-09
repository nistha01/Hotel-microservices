package io.nitish.hotelService.service;

import io.nitish.hotelService.model.Hotel;
import io.nitish.hotelService.repo.IHotelRepo;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Service
public class HotelService {
    @Autowired
    IHotelRepo iHotelRepo;

    public Hotel getHotelById(Integer id) {
        return iHotelRepo.findById(id).orElse(null);
    }
}
