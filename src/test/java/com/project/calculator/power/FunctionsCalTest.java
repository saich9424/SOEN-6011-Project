package com.project.calculator.power;

import static org.junit.Assert.*;

import org.junit.Test;

/**
 * The class has all the test cases for the given code.
 * @author saich9424
 *
 */
public class FunctionsCalTest {
	/**
	 * The class tests the power function for positive integer to positive integer.
	 * 
	 */
	@SuppressWarnings("deprecation")
	@Test
	   public void testXPosIntegerToYPosInteger() {	
	      System.out.println("Testing positive integer to positive integer");    
	      assertEquals(Math.round(Math.pow(55,22)), Math.round(FunctionsCal.power(55,22)),0.001);   
	   }
	
	/**
	 * The class tests the power function for Negative integer to positive integer.
	 */
	@Test
	   public void testXNegIntegerToYPosInteger() {	
	      System.out.println("Testing Negative integer to positive integer");  
	      assertEquals(Math.round(Math.pow(-53,22)), Math.round(FunctionsCal.power(-53,22)),0.001);   
	   }
	/**
	 * The class tests the power function for positive real to positive real.
	 */
	@Test
	   public void testXPosRealToYPosReal() {	
	      System.out.println("Testing positive real to positive real");  
	      assertEquals(Math.round(Math.pow(91.3,34.5)), Math.round(FunctionsCal.power(91.3,34.5)),0.001);   
	   }
	/**
	 * The class tests the power function for positive real to negative real.
	 */
	@Test
	   public void testXPosRealToYNegReal() {	
	      System.out.println("Testing positive real to negative real");  
	      assertEquals(Math.pow(151.5,-34.5),1/FunctionsCal.calLn(151.5,-34.5),0.001);   
	   }
	/**
	 * The class tests the power function for positive real to negative real.
	 */
	@Test
	   public void testXPosRealToYNegReal2() {	
	      System.out.println("Testing positive real to negative real");  
	      assertEquals(Math.pow(124.5,-21.5),1/FunctionsCal.calLn(124.5,-21.5),0.001);   
	   }
	
	
}
