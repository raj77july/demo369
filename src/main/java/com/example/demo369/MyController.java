package com.example.demo369;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/show")
public class MyController {

    @GetMapping(value="/test")
  public String  test(){
      return "Jai Shree Ram99";
  }
}
