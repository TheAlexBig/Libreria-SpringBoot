package com.biblioteca.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class MainController {
	
	@RequestMapping("/")
	public ModelAndView indexRoute() {
		ModelAndView mav = new ModelAndView();
		mav.setViewName("main");
		return mav;
	}
	
}