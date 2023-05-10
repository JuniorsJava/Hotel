package com.example.Hotel.mapper;

import com.example.Hotel.entity.Hotel;
import com.example.Hotel.model.HotelDTO;
import org.mapstruct.Mapper;

@Mapper
public interface HotelMapper {

    Hotel hotelDtoToHotel(HotelDTO hotelDto);

    HotelDTO hotelToHotelDto(Hotel hotel);
}
