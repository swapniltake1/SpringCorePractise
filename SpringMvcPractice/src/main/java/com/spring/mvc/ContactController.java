package com.spring.mvc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import com.spring.mvc.model.User;
import com.spring.mvc.service.UserService;

@Controller
public class ContactController {

	@Autowired
	private UserService userService;
	
	@ModelAttribute          //automatically data set up for view
	public void commmonDataForModel(Model m) {
		m.addAttribute("desc", "Signup for join");
		m.addAttribute("head", "Join Us ");
	}
	
	@RequestMapping("/contact")
	public String showForm(Model m) {
	//	m.addAttribute("header", "Registration Form");
	/*
	 * m.addAttribute("desc", "Signup for join"); m.addAttribute("head",
	 * "Join Us ");
	 */
		
		return "contact";
	}

	@RequestMapping(path = "/processform", method = RequestMethod.POST)
	public String processForm(@ModelAttribute("user") User user, Model model) {
		// Modelattribute is setting data automaticaly and returning that value into success.jsp page 
		
		this.userService.createUser(user);
		
		return "success";
		
		
		
	}

	/*old pattern 
	 * @RequestMapping(path = "/processform", method = RequestMethod.POST) public
	 * String processForm(@RequestParam("userName") String
	 * userName,@RequestParam("userEmail") String
	 * userEmail, @RequestParam("userPassword") String userPassword , Model model) {
	 * 
	 * System.out.println("User Nmae is : "+userName);
	 * System.out.println("User Email is : "+userEmail);
	 * System.out.println("User Password Is : "+userPassword);
	 * 
	 * 
	 * User user=new User(); user.setUserEmail(userEmail);
	 * user.setUserName(userName); user.setUserPassword(userPassword);
	 * 
	 * 
	 * 
	 * model.addAttribute("userName", userName); model.addAttribute("userEmail",
	 * userEmail); model.addAttribute("userPassword", userPassword);
	 * 
	 * 
	 * // All data set into the class and them sended it into view
	 * model.addAttribute("user", user); return "success"; }
	 */
	
	
	}

