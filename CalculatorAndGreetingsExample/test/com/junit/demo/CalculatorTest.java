package com.junit.demo;

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
 
public class CalculatorTest {
 
 private Calculator calc;
  
 @Before
 public void setUp() throws Exception {
  calc = new Calculator();
 }
 
 @After
 public void tearDown() throws Exception {
  calc = null;
 }
 
 @Test
 public void testMultiply() {
  double result = calc.multiply(2.5, 100);
  assertEquals(250, result, 0);
 }
 
 @Test
 public void testDivide() {
  double result = calc.divide(100, 10);
  assertEquals(10, result, 0);
   
 }
 
 @Test
 public void testDivideWithTolerance() {
  double result = calc.divide(345, 100);
  assertEquals(3.4, result, 0.1);
   
 }
  
 @Test(expected = ArithmeticException.class)
 public void testDivideByZero() {
  calc.divide(100.5, 0);
 }
 
 @Test
 public void testTwoValuesSum() {
	 double result = calc.sum(100.4,4.0);
	 assertEquals(104.4, result, 0);
 }
 
 @Test
 public void testTwoValuesSubstract() {
	 double result = calc.substract(100.4, 0.4);
	 assertEquals(100, result, 0);
 }
 @Test(expected = ArithmeticException.class)
 public void testSubstractSecondValueBigger() {
	calc.substract(0.4, 100.4);
 }
 
 @Test
 public void testFactorial() {
	 int result = calc.factorial(0);
	 assertEquals(1, result, 0);
 }
 @Test
 public void testFactorialDiferentdezero() {
	 int result = calc.factorial(5);
	 assertEquals(120,result,0);
 }
 
 @Test(expected = ArithmeticException.class)
 public void testFactorialNegative() {
	calc.factorial(-2);
 }
}
