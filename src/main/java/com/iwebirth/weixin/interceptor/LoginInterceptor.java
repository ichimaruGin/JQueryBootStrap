package com.iwebirth.weixin.interceptor;

import java.util.UUID;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

public class LoginInterceptor extends HandlerInterceptorAdapter{

	/**
	 * @return true 直接通过preHandle的验证   进入下一层或下一个拦截器进行处理
	 * @return false 无法通过preHandle的验证  重新进入当前preHandle进行处理
	 * **/
	@Override
	public boolean preHandle(HttpServletRequest request,
			HttpServletResponse response, Object handler) throws Exception {
		// TODO Auto-generated method stub
		System.out.println("preHandle"+request.getContextPath());
		String uri = request.getRequestURI();		
		HttpSession session = request.getSession();
		if(uri.endsWith("/login/check") || uri.endsWith("/login/out")){
			//登录验证和登出直接通过
			return true;  
		}
		if(uri.endsWith("login") || uri.endsWith("login/")){
			return true;
		}
		if(uri.contains("resource")){
			//资源直接通过
			return true;
		}
		if(uri.endsWith(request.getContextPath()+"/")||uri.contains(request.getContextPath()+"/login")){
			//uri.endsWith(request.getContextPath()+"/") 		对http://localhost/JQueryBootstrap/进行拦截重定向
			//uri.contains("login")								对http://localhost/JQueryBootstrap/login******进行拦截重定向
			//将于login相关的uri都定位到/login
			response.sendRedirect(request.getContextPath()+"/login");
			return false; 
		}	
//		response.sendRedirect(request.getContextPath()+"/login");
//		return false;//对其他的URL都进行拦截 并且重定向到登陆页面;若返回true，则对于其他的URL都放行；
		return true; //放行其他的URL
	}

	@Override
	public void afterCompletion(HttpServletRequest request,
			HttpServletResponse response, Object handler, Exception ex)
			throws Exception {
		// TODO Auto-generated method stub
		System.out.println("in afterCompletion");
		//super.afterCompletion(request, response, handler, ex);
	}

	@Override
	public void postHandle(HttpServletRequest request,
			HttpServletResponse response, Object handler,
			ModelAndView modelAndView) throws Exception {
		// TODO Auto-generated method stub
		System.out.println("in postHandle");
		//super.postHandle(request, response, handler, modelAndView);
	}
	
}
