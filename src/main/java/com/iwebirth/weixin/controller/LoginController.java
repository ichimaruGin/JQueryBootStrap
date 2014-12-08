package com.iwebirth.weixin.controller;

import java.io.UnsupportedEncodingException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.servlet.ModelAndView;

import com.iwebirth.weixin.responsebody.User;

@Controller
@RequestMapping
public class LoginController {
	Integer userId = 0;
	@RequestMapping(value={"/login"})
	public String start(HttpServletRequest request,HttpSession session,ModelMap model) throws UnsupportedEncodingException{
		request.setCharacterEncoding("UTF-8");		
		String userName = (String)session.getAttribute("userName");
		String passWord = (String)session.getAttribute("passWord");
		if("admin".equals(userName)&&"admin".equals(passWord)){
			//直接登录
			model.put("navi_foucs", "mainpage");
			return "mainpage";
		}else{
			model.put("navi_foucs", "login");
			return "login";
		}
	}
	
	@RequestMapping(value={"/login/check"})
	public String logincheck(HttpServletRequest request,HttpServletResponse response,ModelMap model){		
		String userName = request.getParameter("userName");
		String passWord = request.getParameter("passWord");
		System.out.println(userName+" "+passWord);
		if("admin".equals(userName)&&"admin".equals(passWord)){
			//直接登录
			model.put("navi_foucs", "mainpage");
			return "mainpage";
		}else{
			model.put("navi_foucs", "login");
			return "login";
		}
	}
	
	@RequestMapping(value={"/login/out"})
	public @ResponseBody
	User loginout(){
		User user = new User("admin","admin");
		return user;
	}
}
