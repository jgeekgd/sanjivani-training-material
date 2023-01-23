>>>>>>>>>>>>>>>>>>>>>>>>> Java 8 Interface Changes <<<<<<<<<<<<<<<<<<<<<<<<<<<<<<
	Java 8 Interface Changes - static method, default method
	
	Java 8 interface changes include static methods and default methods in interfaces. 
	Prior to Java 8, we could have only default method declarations in the interfaces.
	But from Java 8, we can have default methods and static methods in the interfaces.
	Designing interfaces have always been a tough job because if we want to add additional methods in the interfaces, it will require change in all the implementing classes.
	
	"Java Interface Default Method":
	Default method feature will help us in extending interfaces with additional methods, all we need is to provide a default implementation.
	
	Important points about java interface default methods:
	
	1.Java interface default methods will help us in extending interfaces without having the fear of breaking implementation classes.
	2.Java interface default methods has bridge down the differences between interfaces and abstract classes.
	3.Java 8 interface default methods will help us in avoiding utility classes, such as all the Collections class method can be provided in the interfaces itself.
	4.Java interface default methods will help us in removing base implementation classes, we can provide default implementation and the implementation classes can chose which one to override.
	5.One of the major reason for introducing default methods in interfaces is to enhance the Collections API in Java 8 to support lambda expressions.
	6.If any class in the hierarchy has a method with same signature, then default methods become irrelevant. A default method cannot override a method from java.lang.Object. The reasoning is very simple, it’s because Object is the base class for all the java classes. So even if we have Object class methods defined as default methods in interfaces, it will be useless because Object class method will always be used. That’s why to avoid confusion, we can’t have default methods that are overriding Object class methods.
	7.Java interface default methods are also referred to as Defender Methods or Virtual extension methods.
	
	
	"Java Interface Static Method":
	Java interface static method is similar to default method except that we can’t override them in the implementation classes. 
	This feature helps us in avoiding undesired results incase of poor implementation in implementation classes.
	
	Important points about java interface static method:
	
	1.Java interface static method is part of interface, we can’t use it for implementation class objects.
	2.Java interface static methods are good for providing utility methods, for example null check, collection sorting etc.
	3.Java interface static method helps us in providing security by not allowing implementation classes to override them.
	4.We can’t define interface static method for Object class methods, we will get compiler error as “This static method cannot hide the instance method from Object”. 
	This is because it’s not allowed in java, since Object is the base class for all the classes and we can’t have one class level static method and another instance method with same signature.
	5.We can use java interface static methods to remove utility classes such as Collections and move all of it’s static methods to the corresponding interface, that would be easy to find and use.
	
	
	"Java Functional Interfaces":
	An interface with exactly one abstract method is known as Functional Interface. 
	A new annotation @FunctionalInterface has been introduced to mark an interface as Functional Interface. 
	@FunctionalInterface annotation is a facility to avoid accidental addition of abstract methods in the functional interfaces. 
	It’s optional but good practice to use it. 
	Functional interfaces are long awaited and much sought out feature of Java 8 because it enables us to use lambda expressions to instantiate them.
	Introduction to Java Functional SAM Interface
	Interfaces having exact one abstract method are known as functional interfaces. Also known as Single Abstract Method Interfaces (SAM Interface).
	Single Abstract Method(SAM) interface means, this interface must have one abstract method. However there can be any number of default methods.
	First of all this is not new concept of Java 8 however, new annotation @FunctionalInterface is added in java 8 features.
	Adding @FunctionalInterface annotation enforces that the interface has exact one abstract method. While adding @FunctionalInterface annotation is not mandatory.
	Functional interface annotation enforces the rule of single responsibility.

>>>>>>>>>>>>>>>>>>>>>>>>> What is Functional Programming, What Java did?<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<
	https://jenkov.com/tutorials/java-functional-programming/index.html
	
	The term Java functional programming refers to functional programming in Java. 
	Functional programming in Java has not been easy historically, and there were even several aspects of functional programming that were not even really possible in Java. 
	In Java 8 Oracle made an effort to make functional programming easier, and this effort did succeed to some extent. 
	In this Java functional programming tutorial I will go through the basics of functional programming, and what parts of it that are possible in Java.

	"Functional programming contains the following key concepts":
		Functions as first class objects
		Pure functions
		Higher order functions

	"Pure functional programming has a set of rules to follow too":
		No state
		No side effects
		Immutable variables
		Favours recursion over looping

	"Java Higher Order Functions":
		A higher order function is a function that either takes a function (method) as parameter, or returns a function after its execution. 
		Example:
		The Collection.sort() takes two parameters. 
		The first parameter is a List and second parameter is a lambda (function). 
		The lambda parameter is what makes Collections.sort() a higher order function.
	
	"Functional Interfaces Can Be Implemented by a Lambda Expression"
		A Java functional interface can be implemented by a Java Lambda Expression. 
		In old style you create anonymous class which implements the required interface now instead of using anonymous class we can use Lambada Expressions.

	"Lambda Expression":
		We use a lambda expression to create an anonymous function. 
		Use the lambda declaration operator -> to separate the lambda's parameter list from its body. 
		A lambda expression can be of any of the following two forms:
		Expression lambda: that has an expression as its body:
		(input-parameters) -> expression
		
		Statement lambda that has a statement block as its body:
		(input-parameters) -> { 
		<sequence-of-statements> 
		}
		
		To create a lambda expression, you specify input parameters (if any) on the left side of the lambda operator and an expression or a statement block on the other side.
		Bringing Lambdas allows to write code in a functional style. 
		Lambda expression facilitates functional programming, and simplifies the development a lot.
		For some areas (like business logic) it's a great advantage - results in a more compact and readable code.
		Lambdas remove boilerplate code and make app more comprehensive. 

		Before Java 8, we would usually create a class for every case where we needed to encapsulate a single piece of functionality. 
		This implied a lot of unnecessary boilerplate code to define something that served as a primitive function representation.
		Java 8 brought a powerful new syntactic improvement in the form of lambda expressions, for instance, we can pass it to or return it from a method.


	"Built-in Functional Interfaces in Java, java.util.function":
		We can use functional interface like any other interface in java.
		However from java 8 functional interfaces are very important, because we use functional interface for implementing Lambda expressions. 
		For writing lambda expression we mostly use functional interface. 
		Due to many functional interfaces newly added in java 8, we don’t have to write a new functional interface while writing lambda expressions.
		Java.util.function Package contains newly added functional interfaces which are commonly used.
		A new package java.util.function with bunch of functional interfaces are added to provide target types for lambda expressions and method references. 

		Java contains a set of functional interfaces designed for commonly occuring use cases, so you don't have to create your own functional interfaces for every little use case.
		"Function":
			The Java Function interface (java.util.function.Function) interface is one of the most central functional interfaces in Java. The Function interface represents a function (method) that takes a single parameter and returns a single value.
			The only method you have to implement to implement the Function interface is the apply() method. Here is a Function implementation example:
		
		"Predicate":
			The Java Predicate interface, java.util.function.Predicate, represents a simple function that takes a single value as parameter, and returns true or false.
			The Predicate interface contains more methods than the test() method, but the rest of the methods are default or static methods which you don't have to implement.
	
		"Supplier":
			The Java Supplier interface is a functional interface that represents an function that supplies a value of some sorts. 
			The Supplier interface can also be thought of as a factory interface.
			
		"Consumer":
			The Java Consumer interface is a functional interface that represents an function that consumes a value without returning any value. 
			A Java Consumer implementation could be printing out a value, or writing it to a file, or over the network etc.

>>>>>>>>>>>>>>>>>>>>>>>> Method references  <<<<<<<<<<<<<<<<<<<<
		Method references are a special type of lambda expressions. They're often used to create simple lambda expressions by referencing existing methods.
		There are four kinds of method references:
			Static methods
			Instance methods of particular objects
			Instance methods of an arbitrary object of a particular type
			Constructor					


>>>>>>>>>>>>>>>>>>>>>>>>>>> Stream API <<<<<<<<<<<<<<<<<<<<<<<<<<
https://www.benchresources.net/java-8-stream-collect-method-with-examples/
https://www.benchresources.net/java-8-stream-api-introduction/
https://stackoverflow.com/questions/27881627/java-8-stream-unique-characters-from-array








Reference  Links:
https://stacktraceguru.com/java-lambda-expression/
https://winterbe.com/posts/2014/07/31/java8-stream-tutorial-examples/
https://jenkov.com/tutorials/java-functional-programming/functional-composition.html
