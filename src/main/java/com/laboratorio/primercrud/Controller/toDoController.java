package com.laboratorio.primercrud.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
//@RequestMapping("/api")


    public class toDoController {
     @GetMapping(value = "/")
        public String index() {
      //   System.out.println("Hola mundo Api Rest");
         return "Greetings from Spring Boot!";
     }
    }


