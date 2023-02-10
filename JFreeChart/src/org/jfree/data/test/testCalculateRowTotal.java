package org.jfree.data.test;

import static org.junit.Assert.*;

import org.jfree.data.DataUtilities;
import org.jfree.data.Values2D;
import org.jmock.Expectations;
import org.jmock.Mockery;
import org.jmock.api.ExpectationError;
import org.junit.Test;
import java.security.InvalidParameterException;

public class testCalculateRowTotal extends DataUtilities {

	@Test(expected = InvalidParameterException.class) //expecting an invalid parameter exception
	public void testInvalidParameter() { 
		double result = DataUtilities.calculateRowTotal(null, 0); //input null as the data
	}
	
	@Test(expected = ExpectationError.class) //expecting out of bounds because we are testing a column that 
	public void testInvalidRow() { //does not exist
		Mockery mockingContext = new Mockery(); //create a 2D value object with 2 columns 1 row
	     final Values2D values = mockingContext.mock(Values2D.class);
	     mockingContext.checking(new Expectations() {
	         {
	             one(values).getColumnCount();
	             will(returnValue(2));
	             one(values).getValue(0, 0);
	             will(returnValue(7.5));
	             one(values).getValue(0, 1);
	             will(returnValue(2.5));
	         }
	     });
	     double result = DataUtilities.calculateRowTotal(values, 47); //addition for invalid row
	}
	
	@Test(expected = ExpectationError.class) //expecting an expectation error as a negative row is 
	public void testNegativeRow() { // not reachable
		Mockery mockingContext = new Mockery(); //create a mock of 2D value object
	     final Values2D values = mockingContext.mock(Values2D.class);
	     mockingContext.checking(new Expectations() {
	         {
	             one(values).getColumnCount();
	             will(returnValue(2));
	             one(values).getValue(0, 0);
	             will(returnValue(7.5));
	             one(values).getValue(0, 1);
	             will(returnValue(2.5));
	         }
	     });
	     double result = DataUtilities.calculateRowTotal(values, -1); //test for a negative row

	}
	@Test
	public void testIncorrectValue() { //testing if we have a null value as one of the values in 2D object
		// setup
	     Mockery mockingContext = new Mockery();// create 2D object where one of the values returned is null
	     final Values2D values = mockingContext.mock(Values2D.class);
	     mockingContext.checking(new Expectations() { 
	         {
	             one(values).getColumnCount();
	             will(returnValue(2));
	             one(values).getValue(0, 0);
	             will(returnValue(null));
	             one(values).getValue(1, 0);
	             will(returnValue(2.5));
	         }
	     });
	     double result = DataUtilities.calculateRowTotal(values, 0);// calculate for the correct row
	     assertEquals(0, result, .000000001d);//should output 0 as null is an incorrect value
	}
	@Test
	public void testShouldWork() { //this is our test for values that should work
		// setup
	     Mockery mockingContext = new Mockery();//create a 2D value object with 2 columns and 1 row
	     final Values2D values = mockingContext.mock(Values2D.class);
	     mockingContext.checking(new Expectations() {
	         {
	             one(values).getColumnCount();
	             will(returnValue(2));
	             one(values).getValue(0, 0);
	             will(returnValue(7.5));
	             one(values).getValue(0, 1);
	             will(returnValue(2.5));
	         }
	     });
	     double result = DataUtilities.calculateRowTotal(values, 0);//calculate the addition
	     // verify
	     assertEquals(10.0, result, .000000001d);// should be 10.0 as we are doing addition of 7.5 and 2.5
	     // tear-down: NONE in this test method
	}

}
