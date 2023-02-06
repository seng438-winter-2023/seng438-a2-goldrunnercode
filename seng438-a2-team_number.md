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
(20 test cases) - Jack/Abdullah
We will be using a weak ECT strategy for blackbox testing on both the Range and the DataUtilitites class. From the Range class the methods that will be tested are getLowerBound, getUpperBound, getLength, getCentralValue and toString as the only input paramaters are the objects upper and lower bound values. Using this for each of these methods we can design test cases that will use two numbers a and  b where b > a that we test each combination of two of these as lowerbound,upperbound a,a a,b b,a and b,b all of which should work except for b,a where the program should throw an error. As there are only two partitions which is numbers that work that are when the upperbound is larger than the lower bound which is tested by a,a a,b and b,b and the numbers that dont work which are when the lowerbound is larger than the upper bound which is tested by b,a.
(10 test cases) - Evan 
For the DataUtilities methods we are going to test the both the calculateColumnTotal and the calculateRowTotal methods by first testing a correct input for both giving a data object with some numbers in it and a positive column number that is within the number of columns inputted and see the correct result, then we can pass in a incorrect object as the data and we expect a InvalidParameterException will be thrown, then we can do a test at the boundaries inputting a column/row number that is lower than the available columns or rows like -1, which should throw an error. We can also input a higher value than the number of columns or rows which should also throw an error. Another test that we will be doing is throwing a null value into the column or row that is being tested which should make the output 0. 
(6) Max
We are going to test the createNumberArray by first testing a correct input which is a double array that is populated. Then we can use an incorrect object as input which should throw a InvalidParameterException. Then we can test for when one of the values in the double array is null which should also throw an error. 
And we are going to test createNumberArray2D in the same way except we will be replacing the double array with a 2D array.
(4) Max
How we are going to test the getCumulativePercentages class is first we are going to input a correct KeyedValues object and test for the output. Then we are going to test for a null value in the KeyedValues which should throw an error. Then we are going to test using an incorrect object which should throw a InvalidParameterException. We can also test for what happens when you throw a empty KeyedValues Object in which should also throw an error. 





# 3 Test cases developed

Text…

// write down the name of the test methods and classes. Organize the based on
the source code method // they test. identify which tests cover which partitions
you have explained in the test strategy section //above

# 4 How the team work/effort was divided and managed

Text…

# 5 Difficulties encountered, challenges overcome, and lessons learned

Text…

# 6 Comments/feedback on the lab itself

Text…
