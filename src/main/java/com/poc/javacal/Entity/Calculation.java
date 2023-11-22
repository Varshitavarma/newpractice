package com.poc.javacal.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
 
@Entity
public class Calculation {
 
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
 
    private double num1;
    private String operator;
    private double num2;
    private double result;
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public double getNum1() {
		return num1;
	}
	public void setNum1(double num1) {
		this.num1 = num1;
	}
	public String getOperator() {
		return operator;
	}
	public void setOperator(String operator) {
		this.operator = operator;
	}
	public double getNum2() {
		return num2;
	}
	public void setNum2(double num2) {
		this.num2 = num2;
	}
	public double getResult() {
		return result;
	}
	public void setResult(double result) {
		this.result = result;
	}
 
    
}