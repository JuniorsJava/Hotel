package com.example.Hotel.mapper;

import com.example.Hotel.entity.User;
import com.example.Hotel.entity.Role;
import com.example.Hotel.model.UserDTO;
import org.mapstruct.Mapper;

@Mapper
public interface UserMapper {

    User userDtoToUser(UserDTO userDto);

    UserDTO userToUserDto(User user);
}
