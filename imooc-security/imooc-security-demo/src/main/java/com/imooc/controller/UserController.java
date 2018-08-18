package com.imooc.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.imooc.dto.UserTO;

@RestController
public class UserController {

	@RequestMapping(value="/user",method=RequestMethod.GET)
	public List<UserTO> query(){
		
		List<UserTO> userList = new ArrayList<>();
		userList.add(new UserTO("tom","123456"));
		userList.add(new UserTO("jerry","123456"));
		userList.add(new UserTO("lily","123456"));
		return userList;
	}

}
