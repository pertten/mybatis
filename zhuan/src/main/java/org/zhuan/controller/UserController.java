package org.zhuan.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.zhuan.domain.User;
import org.zhuan.service.UserService;

@Controller
public class UserController {

	@Autowired
	private UserService userService;
	
	public void setUserService(UserService userService) {
		this.userService = userService;
	}

	@RequestMapping("/getuser")
	public void getUser(Model model,@RequestParam String id){
		User user=userService.getUser(id);
		System.out.println(user.getName());
		model.addAttribute(user);
	}
}
