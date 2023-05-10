package com.example.Hotel.model;

import com.example.Hotel.entity.Hotel;
import com.example.Hotel.entity.ParkingType;
import lombok.Builder;
import lombok.Data;
@Builder
@Data
public class ParkingDTO {

    private Long id;
    private String parkingLot;
    private Integer price;
    private ParkingType parkingType;
    private Hotel hotel;
}
