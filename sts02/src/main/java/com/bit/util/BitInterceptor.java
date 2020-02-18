package com.bit.util;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

public class BitInterceptor extends HandlerInterceptorAdapter{
	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)
			throws Exception {
		System.out.println(" 컨트롤러 실행 전"+handler);
		return true;
		//false로 할경우 컨트롤러 실행 전에서 컨트롤러로 안넘어감.
	}

	@Override
	public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler,
			ModelAndView mav) throws Exception {
		System.out.println("컨트롤러 실행 후 뷰 위임 전"+handler);
		System.out.println("컨트롤러 실행 후 뷰 위임 전"+mav);
		HttpSession session = request.getSession();
		if(session.getAttribute("login")==null)mav.setViewName("login/login");
		System.out.println("컨트롤러 실행 후 뷰 위임 전"+mav);
	}

	@Override
	public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex)
			throws Exception {
		System.out.println("뷰 위임후후");
		if(ex!=null) {
			request.setAttribute("err", ex.getMessage());
			request.getRequestDispatcher("/err.jsp").forward(request, response);
//			response.sendRedirect("/sts02/err.jsp");
		}
	}
}
