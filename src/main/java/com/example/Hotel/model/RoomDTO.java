package com.example.Hotel.model;

import com.example.Hotel.entity.Hotel;
import lombok.Builder;
import lombok.Data;

@Builder
@Data
public class RoomDTO {

    private Long id;
    private String number;
    private Integer price;
    private Hotel hotel;
}
