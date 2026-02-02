package com.ecom.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.ecom.service.CalculatorService;



@RestController
@RequestMapping("/api/calc")
public class CalculatorController
{
@Autowired
CalculatorService calculatorService;
    

    @GetMapping("/add")
    public double add(@RequestParam double a, @RequestParam double b)
    {
		return calculatorService.add(a, b);
    }

}
