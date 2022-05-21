package com.placeopedia.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.placeopedia.model.CompanyModel;
import com.placeopedia.repo.CompanyRepo;

@Service
public class CompanyService {
	
	@Autowired
	CompanyRepo repo;

	public CompanyModel checkCompany(CompanyModel company)
	{
		if(repo.existsById(company.getCompany_Username())) {
		CompanyModel temp = repo.findById(company.getCompany_Username()).get();
		if(temp.getCompany_Password().equals(company.getCompany_Password()))
			return temp;
		else
			return null;
		}
		else
			return null;
			
	}

	public CompanyModel checkNewCompany(CompanyModel newCompany) {
		if(repo.existsById(newCompany.getCompany_Username()))
			return null;
		else {
			repo.save(newCompany);
			return newCompany;
		}
	}
	

}
