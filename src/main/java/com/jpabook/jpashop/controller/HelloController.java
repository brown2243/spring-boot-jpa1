package com.jpabook.jpashop.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HelloController {

  @GetMapping("hello")
  public String getMethodName(Model model) {
    model.addAttribute("data", "hello");
    return "hello";
  }
}
