package com.spring.search;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.view.RedirectView;

@Controller
public class SearchController {

	@RequestMapping("/home")
	public String home() {
		return "home";
	}	
	
	@RequestMapping("/search")
	public RedirectView search(@RequestParam(name = "query", required = false) String query) {
		
		RedirectView redirectView = new RedirectView();
		
		if (query == null || query.trim().isEmpty()) {
	        // if query is null or empty, show a message
	        String errorMessage = "Search query cannot be empty";
	        ModelAndView modelAndView=new ModelAndView();
	        modelAndView.addObject("query", query);
	        modelAndView.addObject("message", errorMessage);
	        modelAndView.setViewName("home");
	        redirectView.setUrl("home");
	        return redirectView;
	        
	      
	    }
		
			
		String url="https://www.google.com/search?q="+query;
		redirectView.setUrl(url);
		return redirectView;
		
	
	}
}
