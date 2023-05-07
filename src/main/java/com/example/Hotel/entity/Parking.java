package com.example.Hotel.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Entity
public class Parking {

    @Id
    @Column(name = "parking_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotNull
    @NotBlank
    private String parkingLot;

    private Integer price;

    @NotNull
    @Enumerated(EnumType.STRING)
    private ParkingType parkingType;

    @OneToOne(mappedBy = "parking")
    private Hotel hotel;

}
