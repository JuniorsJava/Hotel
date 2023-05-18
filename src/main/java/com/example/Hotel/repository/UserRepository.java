package com.example.Hotel.repository;

import com.example.Hotel.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;
import java.util.UUID;

public interface UserRepository extends JpaRepository<User, UUID> {

    User findByUsernameIgnoreCase(String username);

    User findByEmail(String email);

    User findByRandomToken(String token);

    @Query(value = "SELECT * FROM user u WHERE u.username LIKE %:keyword% OR u.full_name LIKE %:keyword% OR u.email LIKE %:keyword% " +
            "OR u.user_id LIKE %:keyword% OR u.car LIKE %:keyword%",
            nativeQuery = true)
    List<User> searchUser(@Param("keyword") String keyword);

}