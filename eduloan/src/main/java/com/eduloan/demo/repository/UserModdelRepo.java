package com.eduloan.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.eduloan.demo.model.UserModel;

@Repository
public interface UserModdelRepo extends JpaRepository<UserModel,Integer> {

}