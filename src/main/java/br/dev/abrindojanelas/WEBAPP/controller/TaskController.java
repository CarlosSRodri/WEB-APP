package br.dev.abrindojanelas.WEBAPP.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class TaskController {
  
    @GetMapping("/create")
    public String getCreateString(){
        return "create";
    }
}
