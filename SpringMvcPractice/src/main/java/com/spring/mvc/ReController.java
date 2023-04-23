package com.spring.mvc;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.view.RedirectView;

@Controller
public class ReController {

	@RequestMapping("/one")
	public String one() {
		
		System.out.println("This is one handler");
		return "redirect:/enjoy";   // redircting prefix
	}
	
	@RequestMapping("/enjoy")
	public String  enjoy() {
		
		System.out.println("This secoend handler");
		return "contact";
	}
	
	@RequestMapping("/two")
	public RedirectView	two() {
		RedirectView redirectView=new RedirectView();
		redirectView.setUrl("contact");
		return redirectView;
	}
}
