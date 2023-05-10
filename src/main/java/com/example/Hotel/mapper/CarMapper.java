package com.example.Hotel.mapper;

import com.example.Hotel.entity.Car;
import com.example.Hotel.model.CarDTO;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper
public interface CarMapper {

    Car carDtoToCar(CarDTO carDto);

    CarDTO carToCarDto(Car car);
}
