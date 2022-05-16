package com.junit.demo;


public class Calculator {
		  
		 public double multiply(double a, double b) {
		  return a * b;
		 }
		  
		 public double divide(double a, double b) { 
		  if(b == 0) {
		   throw new ArithmeticException();
		  }
		  return a / b;
		 }

		public double sum(double d, double e) {
			return d + e;
		}

		public double substract(double d, double e) {
			if(d < e) throw new ArithmeticException();
			return d - e;
		}

		public int factorial(int i) {
			if(i == 0) return 1;
			else if(i > 0) return i * factorial (i-1);
			else throw new ArithmeticException();
		} 
}
