package com.maliheh.fullstackbackend.repository;

import com.maliheh.fullstackbackend.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User,Long> {
}
