package com.tapestry.genetify.demo.services;

import org.apache.tapestry5.SymbolConstants;
import org.apache.tapestry5.ioc.MappedConfiguration;
import org.got5.tapestry5.jquery.JQuerySymbolConstants;


public class AppModule {
	public static void contributeApplicationDefaults(MappedConfiguration<String, String> configuration) {
		configuration.add(SymbolConstants.START_PAGE_NAME, "Index");
		configuration.add(SymbolConstants.PRODUCTION_MODE, "false");		
		configuration.add(JQuerySymbolConstants.SUPPRESS_PROTOTYPE, "false");		
		configuration.add(JQuerySymbolConstants.JQUERY_ALIAS, "$j");		
		
	}

}
