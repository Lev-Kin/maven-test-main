package com.maven.example;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import ch.qos.logback.classic.LoggerContext;
import ch.qos.logback.core.util.StatusPrinter;

public class MavenTest1 {

  public static void main(String[] args) {

    Logger logger = LoggerFactory.getLogger("com.maven.example.MavenTest1");

    logger.info("info - Hello Maven-test1 !!!");
    logger.debug("debug - Hello Logback !!!");

    // print internal state
    LoggerContext lc = (LoggerContext) LoggerFactory.getILoggerFactory();
    StatusPrinter.print(lc);

  }

}
