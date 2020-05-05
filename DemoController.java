package com.example.demo;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class DemoController {
@RequestMapping("home")

	public ModelAndView display(@RequestParam ("name") String name) {
	
	
	System.out.println("inside controller");
	ModelAndView mv=new ModelAndView();
	mv.addObject("name", name);
	mv.setViewName("home");
		return mv;
	}
}
