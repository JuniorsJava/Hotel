package com.example.Hotel.model;

import com.example.Hotel.entity.User;
import lombok.Builder;
import lombok.Data;

@Builder
@Data
public class CarDTO {

    private Long id;
    private String model;
    private UserDTO user;
}
