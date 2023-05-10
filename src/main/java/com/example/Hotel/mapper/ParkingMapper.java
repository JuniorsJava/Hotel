package com.example.Hotel.mapper;

import com.example.Hotel.entity.Parking;
import com.example.Hotel.model.ParkingDTO;
import org.mapstruct.Mapper;

@Mapper
public interface ParkingMapper {

    Parking parkingDtoToParking(ParkingDTO parkingDto);
    ParkingDTO parkingToParkingDto(Parking parking);
}
