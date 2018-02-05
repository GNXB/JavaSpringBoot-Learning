package com.arms.app.staticpages;

import java.security.Principal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.arms.domain.service.UserService;

@Controller
public class StaticPagesController {
	
	@Autowired
	UserService userService;
	
	@RequestMapping("/help")
	public ModelAndView help(ModelAndView modelAndView, Principal principal) {
		return this.forStatic(modelAndView, principal, "static/help");
	}
	
	@RequestMapping("/contact")
	public ModelAndView contact(ModelAndView modelAndView, Principal principal) {
		return this.forStatic(modelAndView, principal, "static/contact");
	}
	
	@RequestMapping("/about")
	public ModelAndView about(ModelAndView modelAndView, Principal principal) {
		return this.forStatic(modelAndView, principal, "static/about");
	}
	
	public ModelAndView forStatic(ModelAndView modelAndView, Principal principal, String view) {	
		modelAndView.setViewName(view);
		return modelAndView;
	}
}
