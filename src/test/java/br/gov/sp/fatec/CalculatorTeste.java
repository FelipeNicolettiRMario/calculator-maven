package br.gov.sp.fatec;

import org.junit.Test;
import org.junit.Assert;


public class CalculatorTeste {
	

	
	@Test
	public void testSum() {
		Calculator calc = new Calculator(4F,5F);
		Assert.assertTrue(calc.sum() == 9);
	}
	
	@Test
	public void testSubtraction() {
		Calculator calc = new Calculator(10F,5F);
		Assert.assertTrue(calc.subtraction() == 5F);
	}
	
	@Test
	public void testMultiplication() {
		Calculator calc = new Calculator(4F,8F);
		Assert.assertTrue(calc.multiplication() == 32F);
	}
	
	@Test
	public void testDivision() {
		Calculator calc = new Calculator(24F,4F);
		Assert.assertTrue(calc.division() == 6F);
	}
}
