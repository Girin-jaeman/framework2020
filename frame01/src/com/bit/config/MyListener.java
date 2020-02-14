package com.bit.config;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;
/*w
 * <listener>
 * 		여기원래 Xml에서 쓰던건데 떼어냈으니까
 * </listener>
 * 
 * 
 * */



@WebListener
public class MyListener implements ServletContextListener{

	@Override
	public void contextDestroyed(ServletContextEvent arg0) {
		System.out.println("WAS destroy...");
	}

	@Override
	public void contextInitialized(ServletContextEvent arg0) {
		System.out.println("WAS init...");
	}

	
	
}
