package com.bit.core;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.bit.controller.AddController;
import com.bit.controller.DetailController;
import com.bit.controller.IndexController;
import com.bit.controller.InsertController;
import com.bit.controller.IntroController;
import com.bit.controller.ListController;
import com.bit.model.EmpDao;

public class DispatchServlet extends HttpServlet{
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("get method");
		try {
			doBit(req,resp);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		req.setCharacterEncoding("utf-8");
		try {
			doBit(req,resp);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	
	protected void doBit(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException, SQLException {
		
		String url = req.getRequestURI();
		
		url=url.substring(req.getContextPath().length());

	
		BitController controller=null;
		if(url.equals("/")){
		
			String info="com.bit.controller.IndexController";
					try {
						Class<?> clzz = Class.forName(info);
						controller= (BitController)clzz.newInstance();
					} catch (InstantiationException | IllegalAccessException e) {
						// TODO Auto-generated catch block
						e.printStackTrace(); 
					} catch (ClassNotFoundException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
			
		}else if(url.equals("/intro")) {
			String info="com.bit.controller.IntroController";
			try {
				Class<?> clzz = Class.forName(info);
				controller= (BitController)clzz.newInstance();
			} catch (InstantiationException | IllegalAccessException e) {
				// TODO Auto-generated catch block
				e.printStackTrace(); 
			} catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}			
		}else if(url.equals("/bbs/list")){
			 controller=new ListController();
		}else if(url.equals("/bbs/add")){
			controller=new AddController();
			
		}else if(url.equals("/bbs/insert")) {
			 controller = new InsertController();
		}else if(url.equals("/bbs/detail")) {
			controller=new DetailController();
		}else {
			
			return; 
		}
		String viewName = controller.execute(req);
		if(viewName.startsWith("redirect:")) {
//			resp.sendRedirect(viewName.replace("redirect",""));
			resp.sendRedirect(viewName.substring(9));
		}else {
		String prifix= "/WEB-INF/view/";
		String suffix= ".jsp";
		viewName=prifix+viewName+suffix;
		RequestDispatcher rd = req.getRequestDispatcher(viewName);
		rd.forward(req, resp);
		}
	}
	
}	
	

