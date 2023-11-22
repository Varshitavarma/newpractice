package com.poc.javacal.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.poc.javacal.Entity.Calculation;
import com.poc.javacal.Repository.CalculationRepository;
 
@Service
public class CalculationService {
 
    @Autowired
    private CalculationRepository calculationRepository;
 
    public double performCalculation(double num1, String operator, double num2) {
        double result = switch (operator) {
            case "+" -> num1 + num2;
            case "-" -> num1 - num2;
            case "*" -> num1 * num2;
            case "/" -> (num2 != 0) ? num1 / num2 : 0; // Handle division by zero
            default -> throw new IllegalArgumentException("Invalid operator: " + operator);
        };
 
        // Log the calculation to the database
        logToDatabase(num1, operator, num2, result);
 
        return result;
    }
 
    private void logToDatabase(double num1, String operator, double num2, double result) {
        Calculation calculation = new Calculation();
        calculation.setNum1(num1);
        calculation.setOperator(operator);
        calculation.setNum2(num2);
        calculation.setResult(result);
 
        calculationRepository.save(calculation);
    }
}