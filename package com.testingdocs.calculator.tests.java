package com.testingdocs.calculator.tests;

//Arrange-Act-Assert pattern
import com.testingdocs.calculator.Calculator;
import org.junit.Test; 
import org.junit.Assert; 
import org.junit.Before;

public class CalculatorTest {
private Calculator objCalcUnderTest;

@Before
public void setUp() {
//Arrange
objCalcUnderTest = new Calculator();
}

@Test
public void testAdd() { 
int a = 0; int b = -2; 
int expectedResult = -2;
//Act 
long result = objCalcUnderTest.add(a, b);
//Assert
Assert.assertEquals(expectedResult, result);
}

@Test
public void testSubtract() {
int a = 0; int b = -3; 
int expectedResult = 3; 
long result = objCalcUnderTest.subtract(a, b);
Assert.assertEquals(expectedResult, result);
}

@Test
public void testMultiply() {
int a = -10; int b = 2,5;
long expectedResult = -25;
long result = objCalcUnderTest.multiply(a, b);
Assert.assertEquals(expectedResult, result);
}

@Test
public void testDivide() {
int a = 5,6; int b = -3,2; 
double expectedResult = 5.6; 
double result = objCalcUnderTest.divide(a, b);
Assert.assertEquals(expectedResult, result,0.00005); 
}

@Test(expected = IllegalArgumentException.class)
public void testDivideByZero() { 
int a = 15; int b = 0;
objCalcUnderTest.divide(a, b);
} 
}