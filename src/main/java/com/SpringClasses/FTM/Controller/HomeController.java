package com.SpringClasses.FTM.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.SpringClasses.FTM.Repository.RegisterRepository;
import com.SpringClasses.FTM.Model.Login;
import com.SpringClasses.FTM.Model.Register;

@Controller
public class HomeController {
	 @Autowired
	    private RegisterRepository RegisterRepository;
	     
	    @GetMapping("/Home")
	    public String viewHomePage() {
	        return "Home";
	    }
	    @GetMapping("/Register")
	    public String showRegistrationForm(Model model) {
	        model.addAttribute("user", new Register());	         
	        return "Register";
	    }
	    
	    @GetMapping("/Login")
	    public String showLoginForm(Model model) {
	        model.addAttribute("user", new Login());	         
	        return "Login";
	    }
}
