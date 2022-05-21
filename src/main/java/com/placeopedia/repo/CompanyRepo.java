package com.placeopedia.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.placeopedia.model.CompanyModel;

public interface CompanyRepo extends JpaRepository<CompanyModel,String>{

}
