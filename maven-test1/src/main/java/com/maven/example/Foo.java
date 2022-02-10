package com.maven.example;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Foo {

  final static Logger logger = LoggerFactory.getLogger(Foo.class);

  public void doIt() {
    logger.debug("Did it! - Foo.class");



  }

}
