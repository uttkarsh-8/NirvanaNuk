package com.nirvananook.nirvananook.repository;

import com.nirvananook.nirvananook.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
