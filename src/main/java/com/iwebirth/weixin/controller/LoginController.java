package com.iwebirth.weixin.controller;

import java.io.UnsupportedEncodingException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class LoginController {
	
	@RequestMapping(value={"/"})
	public String start(HttpServletRequest request) throws UnsupportedEncodingException{
		request.setCharacterEncoding("UTF-8");
		return "login";
	}
	@RequestMapping(value={"/{param}"})
	public String start(HttpServletRequest request,@PathVariable String param) throws UnsupportedEncodingException{
		request.setCharacterEncoding("UTF-8");
		return "login";
	}
	@RequestMapping(value={"/login/{timestamp}"})
	public String logincheck(@PathVariable String timestamp,HttpServletRequest request,HttpServletResponse response,ModelMap model){
		System.out.println("本次Login时间--->"+timestamp);
		System.out.println(request.getParameter("email")+request.getParameter("password"));
		model.put("login", "OK");
		return "contact";
	}
	
}
