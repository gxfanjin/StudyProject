package com.fan.web.controller;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.fan.core.entity.UserEntity;
import com.fan.core.service.UserService;

@Controller
@RequestMapping("/user")
public class UserController {
	
	@Autowired
	private UserService userService;
	
	@RequestMapping("/queryAllUser")
	public ModelAndView queryDimension(HttpServletRequest request){
		ModelAndView mav = new ModelAndView("/userList");
		//查询所有的维度值
		try {
			List<UserEntity> userList=new ArrayList<UserEntity>();
			userList=userService.findAll();
			request.setAttribute("userList",userList);
		} catch (Exception e) {
		}
		
		return mav;
	}

}
