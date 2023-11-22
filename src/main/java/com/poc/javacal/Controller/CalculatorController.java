package com.poc.javacal.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.poc.javacal.Service.CalculationService;
 
@RestController
@RequestMapping("/calculator")
public class CalculatorController {
 
    @Autowired
    private CalculationService calculationService;
 
    @PostMapping("/calculate")
    public double calculate(@RequestParam double num1, @RequestParam String operator, @RequestParam double num2) {
        return calculationService.performCalculation(num1, operator, num2);
    }
}