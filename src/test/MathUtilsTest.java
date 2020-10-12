package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import main.MathUtils;

 @DisplayName("Math Utils")
class MathUtilsTest {
	 MathUtils calc;

//	SET UP
	@BeforeEach
	void init() {
		//create instance of class
		calc = new MathUtils();
	}
	
	//Annotation
	@Test
	@DisplayName("add returns sum of values")
	void testAdd() {
		//expected
		int expected = 4;
		
		//actual
		int actual = calc.add(2,2);
		
		//Verify
		assertEquals(actual, expected);
		//assertEquals(calc.add(2,2), 4, "add should return 4");
	}
	
	@Test
	@DisplayName("subract returns difference of values")
	void testSubtract() {
		//expected 2
		//actual
		//verify
		assertEquals(calc.subtract(4,2), 2);
	}
	
	@Test
	@DisplayName("divide returns quotient of values")
	void testDivide() {
		//expected 3
		//actual
		//verify
		assertEquals(calc.divide(9,3), 3);
	}
	
	@Test
	@DisplayName("multiply returns product of values")
	void testMultiply() {
		//expected 6
		//actual
		//verify
		assertEquals(calc.multiply(2,3), 6);
	}
	
	@Test
	@DisplayName("circumference returns circumference from radius")
	void testCircumference() {
		//expected 12.56
		//actual calc.circumference(2.0)
		//verify
		assertEquals(calc.circumference(2.0), 12.56);
	}
	
	
	

}
