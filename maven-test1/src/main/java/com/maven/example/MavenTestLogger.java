package com.maven.example;

import ch.qos.logback.classic.LoggerContext;
import ch.qos.logback.core.status.OnConsoleStatusListener;
import ch.qos.logback.core.status.StatusManager;
import com.sun.org.apache.xml.internal.serialize.LineSeparator;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class MavenTestLogger {

  static final Logger logger = LoggerFactory.getLogger(MavenTestLogger.class);

  public static void main(String[] args) {

    LoggerContext lc = (LoggerContext) LoggerFactory.getILoggerFactory();
    StatusManager statusManager = lc.getStatusManager();
    OnConsoleStatusListener onConsoleListener = new OnConsoleStatusListener();
    statusManager.add(onConsoleListener);

    Foo foo = new Foo();
    foo.doIt();

    logger.info("info - Hello Maven-test1 !!!");
    logger.debug("debug - Hello Logback !!!");
    logger.error("error !!!");
    logger.warn("warn !!!");
    logger.info("info - Exiting application.{}", System.lineSeparator());

    //==================

  }

}
