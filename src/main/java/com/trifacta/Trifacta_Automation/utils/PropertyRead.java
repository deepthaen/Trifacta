package com.trifacta.Trifacta_Automation.utils;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class PropertyRead {
	
	/**
	 * Reading key value from config.properties
	 * @param Key
	 * @return
	 */
	public static String getProp_Value(String Key) {
		Properties propVal = new Properties();
		try {
			propVal.load(new FileInputStream("./config.properties"));
			String ref = propVal.getProperty(Key);
			return ref;			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return null;
	}
}
