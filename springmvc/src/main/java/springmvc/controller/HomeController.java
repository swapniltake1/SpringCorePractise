package springmvc.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller                   // Declaring this class is controller 
public class HomeController {
	
	@RequestMapping("/home")  // when we want to fire this method
	public String home( Model model)
	{
		System.out.println("----------hello this home url -------");
		
		model.addAttribute("name","Swapnil Rajendra Take");
		model.addAttribute("Id","101");
		
		List <String> friend = new ArrayList<String>();
		friend.add("Swapnil");
		friend.add("pooja ");
		friend.add("abhijit");
		friend.add("Onkar");
		friend.add("shradhha");
		friend.add("rohit");
		model.addAttribute("f",friend);
		
		return "index";
	}
	
	@RequestMapping(value = "/about")
	public String about()
	{
		System.out.println("this is about page ");
		return "about";
	}
	
	@RequestMapping(value = "Carier")
	public String carrier() {
		return "Carier";
	}
	
	/// Sending data with model and view 
	
	@RequestMapping(value = "/help")
	public ModelAndView help() {     // we have return model and view object 
		
		
		ModelAndView modelAndView=new ModelAndView(); // Creating model and view object.
		// setting the data
		modelAndView.addObject("name" ,"Swapnil");
		modelAndView.addObject("rollnumber", 1234 );
		// Setting the view
		modelAndView.setViewName("help");
		
		return modelAndView;
		
	}

}
