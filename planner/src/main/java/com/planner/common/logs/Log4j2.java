package com.planner.common.logs;

import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;



public class Log4j2 {

	 final static Logger logger = LogManager.getLogger(Log4j2.class);

	    public static void main(String[] args) {
	        logger.log(Level.ALL,"LOG TEST");
	        logger.trace("TRACE TEST");
	        logger.info("INFO TEST");
	        logger.debug("DEBUG TEST");
	        logger.warn("WARN TEST");
	        logger.error("ERROR TEST");
	        logger.fatal("FATAL TEST");
	        System.out.println(logger.getLevel());
	        System.out.println(logger.getLevel().intLevel());
	    }
}
