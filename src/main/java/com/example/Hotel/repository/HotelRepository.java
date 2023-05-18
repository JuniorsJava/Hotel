package com.example.Hotel.repository;

import com.example.Hotel.entity.Hotel;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface HotelRepository extends JpaRepository<Hotel, UUID> {


}