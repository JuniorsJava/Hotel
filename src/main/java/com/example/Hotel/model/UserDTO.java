package com.example.Hotel.model;

import com.example.Hotel.entity.Car;
import com.example.Hotel.entity.Role;
import lombok.*;
import java.util.List;
import java.util.Set;
import java.util.UUID;
@Builder
@Data
public class UserDTO {

    private UUID id;
    private String username;
    private String fullName;
    private String email;

    private Set<Role> roles;
    private Car car;
}
