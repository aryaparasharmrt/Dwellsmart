package com.example.calculater.Controller;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/numbers")
public class CalculatorController {

    @PostMapping("/add")
    public int add(@RequestParam int num1, @RequestParam int num2) {
        System.out.println("Numbers added");
        return num1 + num2;
    }
}

