package com.eduloan.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.eduloan.demo.model.LoginModel;

@Repository
public interface LoginModelRepo extends JpaRepository <LoginModel,String>{

}
