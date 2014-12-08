package com.iwebirth.weixin.interceptor;

import java.util.UUID;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

public class LoginInterceptor extends HandlerInterceptorAdapter{

	/**
	 * @return true ֱ��ͨ��preHandle����֤   ������һ�����һ�����������д���
	 * @return false �޷�ͨ��preHandle����֤  ���½��뵱ǰpreHandle���д���
	 * **/
	@Override
	public boolean preHandle(HttpServletRequest request,
			HttpServletResponse response, Object handler) throws Exception {
		// TODO Auto-generated method stub
		System.out.println("preHandle"+request.getContextPath());
		String uri = request.getRequestURI();		
		HttpSession session = request.getSession();
		if(uri.endsWith("/login/check") || uri.endsWith("/login/out")){
			//��¼��֤�͵ǳ�ֱ��ͨ��
			return true;  
		}
		if(uri.endsWith("login") || uri.endsWith("login/")){
			return true;
		}
		if(uri.contains("resource")){
			//��Դֱ��ͨ��
			return true;
		}
		if(uri.endsWith(request.getContextPath()+"/")||uri.contains(request.getContextPath()+"/login")){
			//uri.endsWith(request.getContextPath()+"/") 		��http://localhost/JQueryBootstrap/���������ض���
			//uri.contains("login")								��http://localhost/JQueryBootstrap/login******���������ض���
			//����login��ص�uri����λ��/login
			response.sendRedirect(request.getContextPath()+"/login");
			return false; 
		}	
//		response.sendRedirect(request.getContextPath()+"/login");
//		return false;//��������URL���������� �����ض��򵽵�½ҳ��;������true�������������URL�����У�
		return true; //����������URL
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
