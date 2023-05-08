package com.eduloan.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.eduloan.demo.model.AdminModel;

public interface AdminModelRepo extends JpaRepository<AdminModel,String>{

}