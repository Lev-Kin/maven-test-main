package com.maven.example;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class MavenTest1 {

  static final Logger logger = LoggerFactory.getLogger(MavenTest1.class);

  public static void main(String[] args) {

    logger.info("info - Hello Maven-test1 !!!");
    logger.debug("debug - Hello Logback !!!");

  }

}
