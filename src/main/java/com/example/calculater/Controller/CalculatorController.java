package com.example.calculater.Controller;

import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.*;

@Slf4j
@RestController
@RequestMapping("/numbers")
public class CalculatorController {

    private static final Logger log = LoggerFactory.getLogger(CalculatorController.class);

    @PostMapping("/add")
    public int add(@RequestParam int num1, @RequestParam int num2) {
//        System.out.println("Logs");
        log.debug("Adding numbers:{} + {} ", num1, num2);


        log.info("Result is: {} " , num1 + num2);
        return num1 + num2;
    }

    @PostMapping("/subtract")
    public int subtract(@RequestParam int num1, @RequestParam int num2) {
        System.out.println("Numbers subtracted");
        log.debug("Subtracting numbers: {} + {}", num1, num2);
        return num1 - num2;
    }
}

