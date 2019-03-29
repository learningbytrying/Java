# Java8 New Features

1) Lambda Expressions
2) Functional Interfaces  --> used to call lambda expressions
Functional interface is not new in java , i think Runnable is already functional interface but this is used more now

3) Define default methods in interfaces , earlier interfaces only allowed public static abstract methods and only public static final variables
4) Define static methods also inside interfaces
5) Predefined functional interfaces - a) Predicate b) Function c) Consumer 
6) :: operator for method reference and constructor reference
7) streams api
8) Date and Time Api by joda.org also known as JODA API


We write Lambda expressions in Java to utilize benefits of functional programming .....

What is functional programming ?????

You can write parallel code to make best of multi core processors to enhance application performance

Lambda Expressions:
1) To enable functional programming in Java , we can send procedure as an argument , we can send behavior as an argument
2) enables writing more readable , maintanable and more concise code
3) To enable parallel processing 


Lambda expression is an anonymous function i.e. a function not having any name , no modifiers and no return types , no return types doesn't mean lambda cannot return any values , lambdas can return the only difference is that method signature doesn't have a name , modifier and return type 

()->{
sysout("Kapil") ; 
}


To cal/invoke lambda expression we need functional interface

Functional interface is not new to java - JAva already has Runnable / Callable / ActionListener

Functional interface -- interface containing only one abstract method
Runnable / Callable /ActionListener interfaces have only 1 abstract method

Runnable --> run ()
Callable --> call()
ActionListener --> actionPerformed()

Also Comparable --> this is also Functional interface, it contains only one method compareTo()

So to summarise Functional Interface is an interface containing Single Abstract Method ( SAM)

However a functional interface can include any number of default methods and any number of static methods however the only clause is that we should have only one Abstract Method

this is an equivalent lambda function for the method
public void m1(){
sysout("Kapil");
}

So to write a lambda simply from the method's signature remove the modifier / return type/ name and insert -> between () and {} 
Also note that if the body of the method has only stmt {} is optional

{} and () and the types are optional
() is optional if there is only 1 argument
return keyword is also optional
{} are optional if there is only one statement

so a method 

public void length(String s){
return s.length ;
}
can be translated as s -> s.length();




@FunctionalInterface , this interface is used to denote to the compiler that the interface is functional , this annotation is not mandatory 
This annotation is introduced in version 1.8


Inheritance in functional interfaces:

scenario1: 
parent interface is marked @functionalinterface functional inheritance with single abstract method
child interface is marked @functionalinterface with no abstract methods 

so will the compiler complain or not ? The answer is that the compiler will not complain

Scenario2:
parent interface is marked @functional interface with a abstract method m1
child interface is also marked @functional interface with a abstract method m1
will the compiler complain or not ? this answer is that the compiler will not complain because we are simply overriding the same method

scenario3:
parents interface is marked @functional interface with a abstract method m1
child interface extending parent interface also marked as @functionalinterface with a method m2

will the compiler compiler ? The answer is YES the compiler complains , at any time the number of abstract methods should be only 1 


Default functional interfaces in Java8 are :
1) predicate  -- is a boolean valued function
2) consumer
3) supplier
4) function

predicate -- it is a functional interface part of java1.8 and present in java.util.function package
predicate contains only one abstract method test()
