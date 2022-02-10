package com.maven.example;

import ch.qos.logback.classic.LoggerContext;
import ch.qos.logback.core.util.StatusPrinter;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class MavenTest1 {

  static final Logger logger = LoggerFactory.getLogger(MavenTest1.class);

  public static void main(String[] args) {

    Foo foo = new Foo();
    foo.doIt();

    logger.info("info - Hello Maven-test1 !!!");
    logger.debug("debug - Hello Logback !!! {}", System.lineSeparator());


    // print internal state
    LoggerContext lc = (LoggerContext) LoggerFactory.getILoggerFactory();
    StatusPrinter.print(lc);

  }

}
