package com.tapestry.genetify.demo.services;

import net.atos.kawwaportal.components.KawwaConstants;
import net.atos.kawwaportal.components.services.Theme0Stack;

import org.apache.tapestry5.SymbolConstants;
import org.apache.tapestry5.ioc.MappedConfiguration;
import org.apache.tapestry5.services.javascript.JavaScriptStack;
import org.got5.tapestry5.jquery.JQuerySymbolConstants;

import com.adaptivui.tapestry5.genetify.config.GenetifyConstants;


public class AppModule {
	public static void contributeApplicationDefaults(MappedConfiguration<String, String> configuration) {
		configuration.add(SymbolConstants.START_PAGE_NAME, "Index");
		configuration.add(SymbolConstants.PRODUCTION_MODE, "true");		
		/**
		 * set Genetify's options (disable cookie, load controls)
		 * */
		configuration.add(GenetifyConstants.GENETIFY_TEST_MODE,"true");
	}
	
	public static void contributeJavaScriptStackSource(MappedConfiguration<String, JavaScriptStack> configuration)
    {
    	configuration.overrideInstance(KawwaConstants.STACK_ID, Theme0Stack.class);
    }

}
