package com.planner.common;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

import org.apache.ibatis.io.Resources;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.planner.common.logs.Log4j2;

public class PlannerProperties {
	
	final static Logger logger = LogManager.getLogger(Log4j2.class);
	
	public static void main(String[] args) {
		String propFileName = "planner.properties";
		Properties prop = connectProp(propFileName);
		
		if(prop != null) {
			logger.info(prop.getProperty("connectedMsg"));
		} else {
			logger.info("property file error");
		}
	}
	
	public static Properties connectProp(String propFileName) {
		 Properties prop = new Properties();
		 try {
			InputStream inputStream =Resources.getResourceAsStream("plannerd.properties");
			if(inputStream != null) {
				prop.load(inputStream);
				return prop;
			}else {
				logger.info("property file " + propFileName + " 이 없습니다");
				return null;
			}
		} catch (Exception e) {
			logger.info("exception msg", e);
			return null;
		}
	}
	
	public static String getProp(Properties prop, String key) {
		String value = "";
		if(prop != null) {
			value = prop.getProperty(key);
			return value;
		} else {
			logger.info("key : " + key + " is empty");
			return null;
		}
	}

}
