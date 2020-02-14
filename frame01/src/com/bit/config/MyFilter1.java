package com.bit.config;

import java.io.IOException;
import java.util.logging.Filter;
import java.util.logging.LogRecord;

import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

public class MyFilter1 implements Filter{

	@Override
	public boolean isLoggable(LogRecord record) {
		// TODO Auto-generated method stub
		return false;
	}
/*	public void doFilter(ServletRequest req,ServletResponse res, FilterChain chain) throws IOException, ServletException{
		System.out.println("before doFilter");
		System.out.println("로그인 확인");
		HttpSession session = ((HttpServletRequest)req).getSession();
		if(session.getAtribute("login")!=null) {
			chain.doFilter(req, res);
			System.out.println("after doFilter");
			
		}else {
			((HttpServletREsponse)res).sendRedirect();
			
		}
	}
*/

}
