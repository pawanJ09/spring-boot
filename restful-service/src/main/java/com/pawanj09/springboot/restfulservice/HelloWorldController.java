package com.pawanj09.springboot.restfulservice;

import com.pawanj09.springboot.restfulservice.config.SvcConfiguration;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {

  @Autowired
  private SvcConfiguration svcConfiguration;
  
  @GetMapping(path = "/hello-world")
  public String helloWorld() {
    return "Hello World";
  }

  @GetMapping(path = "/get-config")
  public SvcConfiguration getConfig() {
    return svcConfiguration;
  }
}
