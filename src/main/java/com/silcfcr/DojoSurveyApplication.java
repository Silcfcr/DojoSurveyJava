package com.silcfcr;

import com.silcfcr.models.User;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;


@SpringBootApplication
@Controller
public class DojoSurveyApplication {
	public static void main(String[] args) {
		
		SpringApplication.run(DojoSurveyApplication.class, args);
	}
	
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String AddUser() {
	
		return "addUser.jsp";
	}
	
	@RequestMapping(value = "/addUser", method = RequestMethod.POST)
	public String User(@RequestParam(value ="name") String name,
			@RequestParam(value ="location") String location,
			@RequestParam(value ="language") String language,
			@RequestParam(value ="comment") String comment,
			RedirectAttributes redirectAttributes, Model model) {
			User user1 = new User (name, location, language, comment );
			
		if (name.equals(" ")) {
			redirectAttributes.addFlashAttribute("errorMessage", "Provide first name");
			return "redirect:/";
		}
		else {
			System.out.println(user1.getName());
			model.addAttribute("user", user1 );
			if (language.equals("Java")) {
				return "java.jsp";
			}
			return "result.jsp";
		}
		
	}
	
}


