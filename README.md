# JavaAssignmentL2
opic 1: Java.lang package
Assignment 1:
Write a program to calculate the number of objects created at a given point using user defined
class. 

Assignment 2:
Develop a java class that has finalize method which displays “Finalize method called”. Create
another class which creates objects of the previous class and it uses the same object reference for
creating these objects. For example, if A1 is the class name, then the objects are created as
below:
A1 a = new A1();
a = new A1();
a = new A1();
When the statement Runtime.getRuntime().gc() is invoked, how many times the finalize method
is called?

Assignment 3:
Write a java program to create enum type all the days of the week and a method that prints a
String corresponding to the day value that passed in as argument.[Hint: Use Switch Case]

Assignment 4:
Write and run AssertExample program to display below pattern with Assert disabled first and
then enabled [Note : Accept number of rows from user]
 *


*
* * *
*
*
And also Run the program without assertion so that you can catch user errors through exceptions.
If a user enters a negative value, throw a MyOwnNegativeValueEnteredException, which is an
extension of ArithmeticException. The display of the error information should display the
negative number that was entered.
If a user enters zero, throw a MyOwnZeroValueEnteredException, which is an extension
of ArithmeticException.


Topic 2: Java.util package

Assignment 1:
Write a program to Write 1) Date object 2) a Double object and 3) A Long object to file and
again reading it back from file.

Assignment 2:
Create an ArrayList which will be able to store only numbers like int,float,double,etc, but not
any other data type.

Assignment 3:
Write a Java program to get year and months between two dates.
Sensitivity: Internal & Restricted

Assignment 4:
Write a java program to display list of available currencies, currency codes, and display the
currency symbol based on user currency input. For example, for USD, the symbol is "$".
[Hint : use Currency class]

Topic 3 : Java.io package

Assignment 1:
Write a program to create a sequential file that could store details about the six products. Details
include product id, cost & number of items available & are provided through the keyboard.
Perform following operations on it
a. Compute and print the total value of all six products.
b. Add new products
c. Display alternate products stored in the file.

Assignment 2:
Create a file named the Numbers and populate it with 30 random numbers in the range 1 to 30
including the end points. Place 1 number per line. Open the file and print the numbers 10 per
line Find and print the following.


Average of the numbers
Sum of the numbers


Assignment 3:
Write a program which copies the content of one file to a new file by removing unnecessarily
spaces between words.
Sensitivity: Internal & Restricted

Topic 4 : Lambda Expressions

Assignment 1:
Create an interface CharacterOccurrence with int findOccurence(String str, char c) to find
no.of occurrences of a given character within the given string. Implement findOccurence(String
str, char c) method by using Lambda expression in an implementation class
ImplClassWithLambda & invoke it to display the result on the console. [Hint: str=”How was
your day today?” & c=’a’ the no.of occurrences of ‘a’ will be 3]

Assignment 2 :
Create an interface WordCount with single abstract method int count(String str) to count no.of
words in a given string. Implement count(String str) method by using Lambda expression in an
implementation class MyClassWithLambda & invoke it to display the result on the console.

Assignment 3:
Create a java class to create a list of string objects
i. Count no.strings whose length is> 5
ii. Count no.of empty strings
iii. Find out empty strings & store them into new list by using Steam API

Assignment 4:
Write a java program to
i. Create an array list to store group of student
marks(99,98,97,100,92,84,80,89,90) in Student class
ii. Create a method calculateAvg() in Student class to calculate average marks of
students by using stream api .
