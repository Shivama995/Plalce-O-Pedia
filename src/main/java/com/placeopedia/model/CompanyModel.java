package com.placeopedia.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class CompanyModel {
	 @Id
	private String company_Username;
	    
	private String company_Name;
    private String company_Number;
    private String company_Address;
    private String company_Headquaters;
    private String company_Email;
    private String company_LogoURL;
    private String company_Desc;
    
    private String company_Password;
   
    
    public String getCompany_Name() {
		return company_Name;
	}
	public void setCompany_Name(String company_Name) {
		this.company_Name = company_Name;
	}
	public String getCompany_Number() {
		return company_Number;
	}
	public void setCompany_Number(String company_Number) {
		this.company_Number = company_Number;
	}
	public String getCompany_Address() {
		return company_Address;
	}
	public void setCompany_Address(String company_Address) {
		this.company_Address = company_Address;
	}
	public String getCompany_Headquaters() {
		return company_Headquaters;
	}
	public void setCompany_Headquaters(String company_Headquaters) {
		this.company_Headquaters = company_Headquaters;
	}
	public String getCompany_Email() {
		return company_Email;
	}
	public void setCompany_Email(String company_Email) {
		this.company_Email = company_Email;
	}
	public String getCompany_LogoURL() {
		return company_LogoURL;
	}
	public void setCompany_LogoURL(String company_LogoURL) {
		this.company_LogoURL = company_LogoURL;
	}
	public String getCompany_Desc() {
		return company_Desc;
	}
	public void setCompany_Desc(String company_Desc) {
		this.company_Desc = company_Desc;
	}
	public String getCompany_Username() {
		return company_Username;
	}
	public void setCompany_Username(String company_Username) {
		this.company_Username = company_Username;
	}
	public String getCompany_Password() {
		return company_Password;
	}
	public void setCompany_Password(String company_Password) {
		this.company_Password = company_Password;
	}
	public CompanyModel() {
		super();
		// TODO Auto-generated constructor stub
	}
	
    
}
