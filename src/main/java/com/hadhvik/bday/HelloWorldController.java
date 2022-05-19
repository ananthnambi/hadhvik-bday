package com.hadhvik.bday;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@RestController
class HelloWorldController {

  @GetMapping("/")
  public ModelAndView hello() {
    ModelAndView modelAndView = new ModelAndView();
    modelAndView.setViewName("index.html");
    return modelAndView;
  }

}
