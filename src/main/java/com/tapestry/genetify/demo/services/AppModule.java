package com.tapestry.genetify.demo.services;

import net.atos.kawwaportal.components.KawwaConstants;
import net.atos.kawwaportal.components.services.Theme0Stack;

import org.apache.tapestry5.SymbolConstants;
import org.apache.tapestry5.ioc.MappedConfiguration;
import org.apache.tapestry5.services.javascript.JavaScriptStack;
import org.got5.tapestry5.jquery.JQuerySymbolConstants;


public class AppModule {
	public static void contributeApplicationDefaults(MappedConfiguration<String, String> configuration) {
		configuration.add(SymbolConstants.START_PAGE_NAME, "Index");
		configuration.add(SymbolConstants.PRODUCTION_MODE, "true");		
		configuration.add(JQuerySymbolConstants.SUPPRESS_PROTOTYPE, "false");		
		configuration.add(JQuerySymbolConstants.JQUERY_ALIAS, "$j");
	}
	
	public static void contributeJavaScriptStackSource(MappedConfiguration<String, JavaScriptStack> configuration)
    {
    	configuration.overrideInstance(KawwaConstants.STACK_ID, Theme0Stack.class);
    }

}
