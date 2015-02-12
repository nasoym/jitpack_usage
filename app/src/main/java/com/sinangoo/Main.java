package com.sinangoo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.sinangoo.test.HelloWorld;

public class Main {

    private final static Logger LOGGER = LoggerFactory.getLogger(Main.class);

    public static void main(String[] args) {
        LOGGER.debug("start main");
        HelloWorld hello = new HelloWorld();
        hello.put("a","aaa aaaa");
        hello.put("a","bbb bbb");
        hello.put("a","ccc ccc");
        LOGGER.debug("hello world string: " + hello);
    }


}
