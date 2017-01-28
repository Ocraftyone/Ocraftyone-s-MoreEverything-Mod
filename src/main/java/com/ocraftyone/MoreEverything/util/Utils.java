package com.ocraftyone.MoreEverything.util;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.ocraftyone.MoreEverything.Reference;

public class Utils {
	
	private static Logger Logger;
	
	public static Logger getLogger() {
		if(Logger == null){
			Logger = LogManager.getFormatterLogger(Reference.modid);
		}
		return Logger;
	}
}
