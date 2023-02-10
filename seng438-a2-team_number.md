**SENG 438 - Software Testing, Reliability, and Quality**

**Lab. Report \#2 – Requirements-Based Test Generation**

| Group \#: 29      |     |
| -------------- | --- |
| Student Names: |     |
| Evan                |   
| Abdullah            |   
| Jack                |   
| Max                 |  

# 1 Introduction

We understand that testing code is needed as there is a very low possiblity that code will be 100% reliable doing the job that you want it to do. That is why in this lab we will be creating test cases for the JFreeChart library to practice our skills using one of the testing frameworks to develop a strategy for testing.

# 2 Detailed description of unit test strategy
Partition 1
We will be using a weak ECT strategy for blackbox testing on both the Range and the DataUtilitites class. From the Range class the methods that will be tested are getLowerBound, getUpperBound, getLength, getCentralValue and toString as the only input paramaters are the objects upper and lower bound values. Using this for each of these methods we can design test cases that will use two numbers a and  b where b > a that we test each combination of two of these as lowerbound,upperbound a,a a,b b,a and b,b all of which should work except for b,a where the program should throw an error. As there are only two partitions which is numbers that work that are when the upperbound is larger than the lower bound which is tested by a,a a,b and b,b and the numbers that dont work which are when the lowerbound is larger than the upper bound which is tested by b,a.
Partition 2
For the DataUtilities methods we are going to test the both the calculateColumnTotal and the calculateRowTotal methods by first testing a correct input for both giving a data object with some numbers in it and a positive column number that is within the number of columns inputted and see the correct result, then we can pass in a incorrect object as the data and we expect a InvalidParameterException will be thrown, then we can do a test at the boundaries inputting a column/row number that is lower than the available columns or rows like -1, which should throw an error. We can also input a higher value than the number of columns or rows which should also throw an error. Another test that we will be doing is throwing a null value into the column or row that is being tested which should make the output 0. 
Partition 3
We are going to test the createNumberArray by first testing a correct input which is a double array that is populated. Then we can use an incorrect object as input which should throw a InvalidParameterException. Then we can test for when one of the values in the double array is null which should also throw an error. 
And we are going to test createNumberArray2D in the same way except we will be replacing the double array with a 2D array.
Partition 4
How we are going to test the getCumulativePercentages class is first we are going to input a correct KeyedValues object and test for the output. Then we are going to test for a null value in the KeyedValues which should throw an error. Then we are going to test using an incorrect object which should throw a InvalidParameterException. We can also test for what happens when you throw a empty KeyedValues Object in which should also throw an error. 





# 3 Test cases developed
RangeClass
Testing getLowerBound - tests outlined in partition 1

getLowerBoundUnequalTest() -  ensures that when 2 numbers are not equal, the correct value is returned

getLowerBoundEqualTest() -  this test checks if the functions returns the correct value when the bounds are equal

getLowerBoundNegativeTest() - The negative test has a lower bound that is negative and ensures the value returned is the same negative value

DataUtilites
calculateColumnTotal and calculateRowTotal the following tests were made that cover the following partitions
testInvalidParameter(): here we test for the partition of an invalid data object which should return a InvalidParameterException
testNegativeColumn(): this tests the partition of calling a column/row that doesn't exist in the negative direction
testInvalidColumn(): this tests the partition of calling a column/row that doesn't exist in the positive direction
testIncorrectValue(): this tests the partition where a value in the data object is an invalid value
testShouldWork(): this is to test a data object with the correct values
For the rest of the DataUtilities methods these are the tests
Testing createNumberArray() – Tests outlined in Partition 3

createNumberArrayCorrectNumberValues(): This test checks if the function correctly creates a number array from double array input. 

createNumberArrayCorrectNumberLength(): This test checks if the function creates a number array with the correct length.

createNumberArrayNullArray(): This test checks that function throws an InvalidParameterException when given a null argument.

createNumberArrayNullValuesinArray(): This test checks that the function throws an InvalidParameterException when given an empty double array.


Testing createNumberArray2D – Tests outlined in Partition 3 
createNumberArray2DCorrectNumberValues(): This test checks if the function correctly creates a 2D number array from 2D double array input.

createNumberArray2DCorrectNumberLength(): This test checks that the function creates a 2D number array of the correct length.

createNumberArray2DNullArray(): This test checks that throws an InvalidParameterException when given a null argument.

createNumberArrayNullValuesinArray2D(): This test checks that the function throws an InvalidParameterException when given an empty double 2D array.

# 4 How the team work/effort was divided and managed
We divided the methods of each class based on how many test cases we thought we were going to have in our orignal plan, we thought there were going to be 20 test cases for the 5 methods we chose from the Range class, these test cases were about half of the work so we decided two of our team members would take this on Abdullah and Jack. Then for the data utilites class we thought that the first two methods would take 10 test cases so we decided one person Evan would work on those and the last three classes required 10 test cases so we decided one person would work on those Max.

# 5 Difficulties encountered, challenges overcome, and lessons learned

There were difficulties encountered as some of tests threw errors and we didn't know whether or not we should be finding errors in the code but everyone in our group found some sort of error so we decided that was normal for this lab. We had troubles with code throwing the wrong exception causing the test to actually error out, we decided we would leave those tests as is because the code should be throwing a specific exception but it was not.

# 6 Comments/feedback on the lab itself

Lab was really well constructed, maybe more clarification on the exact type of black box testing that we are supposed to go with, because there wasn't any clarification we went with weak ECT hopefully that is what was wanted.
