package com.eduloan.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.eduloan.demo.model.LoanApplicationModel;

public interface LoanApplicationModelRepo extends JpaRepository <LoanApplicationModel,Integer>{

}