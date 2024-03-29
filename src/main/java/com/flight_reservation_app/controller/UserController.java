package com.flight_reservation_app.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.flight_reservation_app.entities.User;
import com.flight_reservation_app.repositories.UserRepository;

@Controller
public class UserController {
	@Autowired
	private UserRepository userRepo;
	
	@RequestMapping("/showLoginPage")
	public String showLoginPage() {
		return "login/login";
	}

	@RequestMapping("/showReg")
	public String showReg() {
		return "login/showReg";
	}
	@RequestMapping("/saveReg")
	public String saveReg(@ModelAttribute("user") User user) {
		userRepo.save(user);
		return "login/login";
	}
	@RequestMapping("/verifyLogin")
	public String verifyLogin(@RequestParam("emailid") String emailid, @RequestParam("password") String password, ModelMap modelMap) {
//		System.out.println(emailid);
//		System.out.println(password);
		/////////*******////////
		User user = userRepo.findByEmail(emailid);
//		System.out.println(user.getEmail());
//		System.out.println(user.getPassword());
		if (user.getEmail().equals(emailid) && user.getPassword().equals(password)) {
			return "findFlights";
		}else {
			modelMap.addAttribute("Error", "Invalid username/password");
			return "login/login";
		}
		
	}
}
