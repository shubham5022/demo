package com.telusko.springmvcboot;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.telusko.springmvcboot.model.Alien;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpSession;

@Controller
public class HomeController {

	@RequestMapping("/")
	public String home() {
		return "index";
	}

	
	
	@RequestMapping(value="addAlien",method=RequestMethod.POST)
	public String addAlien(@ModelAttribute("a1") Alien a ){

		return"result";
	}
	
	@GetMapping("getAliens")
	public String getAliens(Model m) {
		
		List<Alien> aliens = Arrays.asList(new Alien(101,"Navin"),new Alien(102,"Shubham"));
		m.addAttribute("result",aliens);
		return "showAliens";
	}
	
	
}
