package com.example.skiersspringclient;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@SpringBootApplication
@RestController
public class SkiersSpringClientApplication {

  public static void main(String[] args) {
    SpringApplication.run(SkiersSpringClientApplication.class, args);
  }

  @PostMapping(value = "skiers/*")
  public String sayHello(HttpServletResponse response) {
    response.setStatus(response.SC_OK);
    return "OK";
  }
}
