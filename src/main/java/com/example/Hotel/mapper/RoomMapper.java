package com.example.Hotel.mapper;

import com.example.Hotel.entity.Room;
import com.example.Hotel.model.RoomDTO;
import org.mapstruct.Mapper;

@Mapper
public interface RoomMapper {

    Room roomDtoToRoom(RoomDTO roomDto);

    RoomDTO roomToRoomDto(Room room);
}
