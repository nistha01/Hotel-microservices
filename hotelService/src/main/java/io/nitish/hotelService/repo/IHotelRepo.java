package io.nitish.hotelService.repo;

import io.nitish.hotelService.model.Hotel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IHotelRepo extends JpaRepository<Hotel,Integer> {
}
