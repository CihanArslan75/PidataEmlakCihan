package com.cihan.estate.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController {
	@RequestMapping("/msg")
	@ResponseBody
	public String getMessage() {
		return "ilk Spring Projem";
	}
	
	@RequestMapping("/index")
	@ResponseBody
	public ModelAndView getOwnerName() {
		ModelAndView mav= new ModelAndView();
		mav.addObject("owner","Cihan Arslan");
		mav.setViewName("index"); // sayfanını adı
		return mav;
	}
	@RequestMapping("/login")
	@ResponseBody
	public ModelAndView getLogin() {
		ModelAndView mav= new ModelAndView();
		mav.setViewName("login"); 
		return mav;
	}
	
	@RequestMapping("/anketgirisi")
	@ResponseBody
	public ModelAndView getOwnerName2() {
		ModelAndView mav= new ModelAndView();
		mav.addObject("owner","Cihan Arslan");
		mav.setViewName("anketgirisi"); 
		return mav;
	}

}
