package com.springboot.demo;

import org.springframework.stereotype.Controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController 
{
	//  Here we are using the old approach of Servlets.
	//	@RequestMapping("home")
	//	public String home(HttpServletRequest req)
	//	{
	//		HttpSession session = req.getSession();
	//		
	//		String name = req.getParameter("name");
	//		session.setAttribute("name", name);
	//		
	//		return "home";
	//	}
	
	//Example 1 : Query Parameter where we accept multiple request parameters and add it.
	@RequestMapping("home")
	public ModelAndView home(@RequestParam("fname")String FirstName, @RequestParam("lname")String LastName) //Key and Value Pair
	{
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.addObject("fname", FirstName);
		modelAndView.addObject("lname", LastName);
		modelAndView.setViewName("home");
		
		return modelAndView; 
	}
	
	//Example 2 : Accept an Object in the Query Parameters
	@RequestMapping("homepage")
	public ModelAndView homepage(Programmer programmer)
	{
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.addObject("obj", programmer);
		modelAndView.setViewName("home");
		
		return modelAndView;
	}
}
