package com.laboratorio.primercrud.Controller;

import com.laboratorio.primercrud.Repository.toDoRepository;
import com.laboratorio.primercrud.model.Task;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
//@RequestMapping("/api")


    public class toDoController {
    @Autowired
    private toDoRepository todoRepository; // se crea una instancia de la clase toDoRepository para poder usar sus metodos en el controlador
    @Autowired
    private com.laboratorio.primercrud.Repository.toDoRepository toDoRepository;

    @GetMapping("/")
        public String index() {
      //   System.out.println("Hola mundo Api Rest");
         return "Greetings from Spring Boot!";
     }

     @GetMapping("/tasks")
       public List<Task> getTasks() {
         return todoRepository.findAll();
             }
    @PostMapping(value = "/savetask")
    public String saveTask(@RequestBody Task task) {
         toDoRepository.save(task);
        return "saved task";
     }
    }