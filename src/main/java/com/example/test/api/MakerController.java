package com.example.test.api;


import com.example.test.entity.Person;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class MakerController {
    @GetMapping("/")
    public String index(Model model, @RequestParam(value = "id")String id){
        model.addAttribute("person", Person.lookup(id));
        return "index";
    }
}
