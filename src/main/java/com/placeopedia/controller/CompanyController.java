package com.placeopedia.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.placeopedia.model.CompanyModel;
import com.placeopedia.service.CompanyService;

@Controller
public class CompanyController {

	@Autowired
	CompanyService service;
	
	CompanyModel userCompany = new CompanyModel();
	
	@ResponseBody
	@GetMapping("/")
	public String Display()
	{
		return "hello";
	}
	
	@GetMapping("login")
	public ModelAndView Login()
	{
		ModelAndView mv = new ModelAndView("login");
		mv.addObject("userCompany",userCompany);
		return mv;
	}
	
	@PostMapping("checkCompany")
	public ModelAndView CheckCompany(@ModelAttribute("userCompany") CompanyModel userCompany)
	{
		
		CompanyModel company = service.checkCompany(userCompany);
		
		if(company!= null)
		{
		return new ModelAndView("homepage");
		}
		else
		{
			ModelAndView mv = new ModelAndView("login");
			mv.addObject("invaliduser","Username / Password incorrect");
			return mv;
		}
	}
	
	@GetMapping("createcompany")
	public ModelAndView createCompany()
	{
		ModelAndView mv = new ModelAndView("createCompany");
		mv.addObject("newCompany",new CompanyModel());
		return mv;
	}
	
	@PostMapping("checkNewCompany")
	public ModelAndView CheckNewCompany(@ModelAttribute("newCompany") CompanyModel newCompany)
	{
		CompanyModel company = service.checkNewCompany(newCompany);
		
		if(company!=null)
		{
		ModelAndView mv = new ModelAndView("login");
		mv.addObject("userCompany",userCompany);
		return mv;
		}
		else
		{
			ModelAndView mv = new ModelAndView("createcompany");
			mv.addObject("userexists","User Already Exists");
			return mv;
		}
	}
	
}
