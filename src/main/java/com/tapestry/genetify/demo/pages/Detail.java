/**
 * 
 */
package com.tapestry.genetify.demo.pages;


import org.apache.tapestry5.Block;
import org.apache.tapestry5.EventConstants;
import org.apache.tapestry5.annotations.Component;
import org.apache.tapestry5.annotations.OnEvent;
import org.apache.tapestry5.annotations.Property;
import org.apache.tapestry5.corelib.components.Zone;
import org.apache.tapestry5.ioc.annotations.Inject;

import com.tapestry.genetify.demo.base.BasePage;

/**
 * @author FR20120
 *
 */
public class Detail extends BasePage{
	@Inject
	@Property
	private Block expert;
	
	@Component
	private Zone zone;
	
	@OnEvent(value=EventConstants.ACTION, component="addToBasketLink")
	public Object addToBasket(){
		return zone;
	}
}