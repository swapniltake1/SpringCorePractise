
	package com.spring.mvc;

	import java.time.LocalDateTime;
	import java.util.ArrayList;
	import java.util.List;

	import org.springframework.stereotype.Controller;
	import org.springframework.ui.Model;
	import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

	@Controller
	public class HomeController {
	     
		@RequestMapping(path = "/home", method=RequestMethod.GET )
		public String home(Model model) {
			System.out.println("hello thisis home URl");
			model.addAttribute("name", "Swapnil Take");
			model.addAttribute("ID", 101);
			
			List<String> friends=new ArrayList<String>();
			friends.add("Pooja");
			friends.add("chakuli");
			friends.add("Poojali");
			friends.add("Zapi");
			friends.add("makeupkit");
			friends.add("nimchadhi");
			
			model.addAttribute("f", friends);
			
			return "index";
		}
		
		@RequestMapping("/about")
		public String About() {
			System.out.println("This is my abiout page ");
			return "about";
		}
		
		@RequestMapping("/help")
		public ModelAndView help() {
			System.out.println("This is help page ");
			
			// Creating object of model and view 
			ModelAndView modelAndView=new ModelAndView();
			
			modelAndView.addObject("Name", "Swapnil Take");
			modelAndView.addObject("address", "Newasa");
			LocalDateTime localDateTime= LocalDateTime.now();
			modelAndView.addObject("time", localDateTime);
			
			List<Integer> marksList=new ArrayList<Integer>();
			marksList.add(22);
			marksList.add(52);
			marksList.add(86);
			marksList.add(860);
			marksList.add(7886);
			modelAndView.addObject("marks", marksList);
			modelAndView.setViewName("help");
			return modelAndView;
		}
		
		
	}


