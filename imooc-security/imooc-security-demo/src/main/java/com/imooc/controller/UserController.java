package com.imooc.controller;


import java.util.ArrayList;
import java.util.List;

import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.fasterxml.jackson.annotation.JsonView;
import com.imooc.entity.UserTO;

import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;


@RestController
public class UserController {
	
	//在查询方法上也指定视图
	@RequestMapping(value="/user",method=RequestMethod.GET)
	@JsonView(UserTO.UserSimpleView.class)
	@ApiOperation(value="用户查询")
	public List<UserTO> query(){	
		List<UserTO> users = new ArrayList<>();
		users.add(new UserTO("tom","123456"));
		users.add(new UserTO("jerry","123456"));
		users.add(new UserTO("lucy","123456"));
		return users;		
	}
	
	@JsonView(UserTO.UserDetailView.class)
	@RequestMapping(value="/user/param",method=RequestMethod.GET)
	public List<UserTO> query(@ApiParam("用户名")@RequestParam(value ="userName") String userName){	
		List<UserTO> users = new ArrayList<>();
		users.add(new UserTO("tom","123456"));
		users.add(new UserTO("jerry","123456"));
		users.add(new UserTO("lucy","123456"));
		return users;		
	}
	
	@RequestMapping(value="/user/page",method=RequestMethod.GET)
	public List<UserTO> queryByPage(@RequestParam(value ="userName",required=false) String userName,@PageableDefault Pageable page){	
		List<UserTO> users = new ArrayList<>();
		users.add(new UserTO("tom","123456"));
		users.add(new UserTO("jerry","123456"));
		users.add(new UserTO("lucy","123456"));
		return users;		
	}
}
