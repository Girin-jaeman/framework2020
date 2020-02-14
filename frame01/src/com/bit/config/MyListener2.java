package com.bit.config;

import javax.servlet.http.HttpSessionActivationListener;
import javax.servlet.http.HttpSessionAttributeListener;
import javax.servlet.http.HttpSessionBindingEvent;
import javax.servlet.http.HttpSessionEvent;

public class MyListener2 implements HttpSessionAttributeListener{
//	public class MyListener2 implements HttpSessionActivationListener{
//세션 생성과 소멸
	@Override
	public void attributeAdded(HttpSessionBindingEvent arg0) {
		System.out.println("added");		
	}

	@Override
	public void attributeRemoved(HttpSessionBindingEvent arg0) {
		System.out.println("revmoved");		
	}

	@Override
	public void attributeReplaced(HttpSessionBindingEvent arg0) {
		System.out.println("replaced");		
		
	}


	
}
