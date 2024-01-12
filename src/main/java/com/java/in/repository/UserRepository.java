package com.java.in.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.java.in.entity.Users;

@Repository
public interface UserRepository extends JpaRepository<Users, String> {

}
