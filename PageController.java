package org.onlinecatalog.fromhomefront.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class PageController 
{

		@RequestMapping(value = {"/", "/home", "/index"})
		public ModelAndView show()
		{
			
				ModelAndView mv = new ModelAndView("page");
				mv.addObject("greeting", "Great to Start with Spring MVC");
				return mv;
		}






}
