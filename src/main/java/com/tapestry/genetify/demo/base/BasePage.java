package com.tapestry.genetify.demo.base;

import org.apache.tapestry5.EventConstants;
import org.apache.tapestry5.annotations.OnEvent;
import org.apache.tapestry5.annotations.Property;


public class BasePage {
	@Property
	private boolean highlight;
	
	@OnEvent(EventConstants.ACTIVATE)
	void init(boolean value){
		highlight = value;
	}
	
	@OnEvent(EventConstants.PASSIVATE)
	boolean restore(){
		return highlight;
	}
	
	public String highlight(String color){
		if(highlight)
			return color+"-highlight";
		return "";
	}
}
