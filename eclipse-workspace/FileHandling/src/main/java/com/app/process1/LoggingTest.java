package com.app.process1;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.Logger;
public class LoggingTest {

    // Create a logger instance for this class
    private static final Logger logger = LogManager.getLogger(LoggingTest.class);

    public static void main(String[] args) {

        logger.info("Application started...");
        logger.debug("This is a DEBUG message (appears only if level >= DEBUG)");
        logger.warn("This is a WARN message — something might be wrong!");
        logger.error("This is an ERROR message — something went wrong!");
        logger.fatal("This is a FATAL message — serious failure!");

        try {
            int result = 10 / 0; // This will throw an exception
        } catch (Exception e) {
            logger.error("Exception occurred: ", e);
        }

        logger.info("Application finished successfully.");
    }
}

