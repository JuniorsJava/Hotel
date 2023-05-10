package com.example.Hotel.model;

import com.example.Hotel.entity.Parking;
import com.example.Hotel.entity.Room;
import lombok.Builder;
import lombok.Data;
import java.util.Set;
import java.util.UUID;

@Builder
@Data
public class HotelDTO {

    private UUID id;
    private String name;
    private Parking parking;
    private Set<Room> rooms;
}
