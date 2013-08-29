package com.tapestry.genetify.demo.base;

import javax.inject.Inject;

import org.apache.tapestry5.Block;
import org.apache.tapestry5.ComponentResources;
import org.apache.tapestry5.EventConstants;
import org.apache.tapestry5.EventContext;
import org.apache.tapestry5.annotations.OnEvent;
import org.apache.tapestry5.annotations.Property;
import org.apache.tapestry5.internal.services.PageSource;

import com.tapestry.genetify.demo.pages.Index;


public class BasePage {
	
	@Property
	private boolean highlight;
	
	@OnEvent(EventConstants.ACTIVATE)
	void init(EventContext context){
		if (context.getCount()!=0){
			highlight = context.get(boolean.class, 0);
		}
	}
	
	@OnEvent(EventConstants.PASSIVATE)
	Object restore(){
		return highlight?true:null;
	}
	
	public String highlight(String color){
		if(highlight)
			return color+"-highlight";
		return "";
	}
}
