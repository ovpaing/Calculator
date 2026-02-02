package com.ecom;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import com.ecom.service.*;


public class CalculatorServiceTest 
{
	private final CalculatorService calculatorService = new CalculatorService();
            															

	@Test
	void testAdd() 
	{
		double a = 2;
		double b = 3;
		
		
		double r = calculatorService.add(a,b);
		
		assertEquals(5,r);
				
	}
		
}
