package com.tapestry.genetify.demo.components;

import org.apache.tapestry5.BindingConstants;
import org.apache.tapestry5.ComponentResources;
import org.apache.tapestry5.Link;
import org.apache.tapestry5.annotations.Import;
import org.apache.tapestry5.annotations.Parameter;
import org.apache.tapestry5.annotations.Property;
import org.apache.tapestry5.ioc.annotations.Inject;
import org.apache.tapestry5.services.PageRenderLinkSource;

import com.adaptivui.tapestry5.genetify.annotations.Genetify;


@Import(stylesheet = {
		"context:static/css/product.css"
		})
@Genetify
public class Layout {
	@Inject
	private ComponentResources componentResources;
	
	@Parameter(defaultPrefix=BindingConstants.LITERAL,value="no title")
	private String title;
	
	public String getTitle(){
		return title;
	}
}
