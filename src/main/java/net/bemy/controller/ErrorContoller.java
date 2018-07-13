package net.bemy.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.security.Principal;

@Controller
public class ErrorContoller {

  @GetMapping("/error")
  public String index(Model model) {
    model.addAttribute("message", "Error Page");
    return "error";
  }
}
