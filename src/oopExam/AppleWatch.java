package oopExam;

/*
* Abstract class is a super class. Abstract class name starts with Upper CamelCase and also snake_case features.
* Abstract class can have abstract and non abstract methods.
* Abstract class can have both a declared method and implemented method. we should declared at least one abstract method.
* In an Abstract Class we must write abstract in the abstract method We can Write a Constructor in Abstract class. 
* However, an Abstract class can't be instantiated.
* There are two keywords used for the inheritance in an Abstract class, which are "extends" and "implements" in Java.
*  An Abstract class can inherit one abstract class or one regular class by extends keyword. However, an Abstract class
* can't inherit an Interface by extends keyword. We use "implements" keyword to inherit an Interface. We can inherit
* more than one Interface with "implements" keyword. But, we can't we "implements" keyword to
* inherit a regular class nor an Abstract class.
* In an Abstract Class we must write abstract in the abstract method
* We can make a relation of AppleWatch with Watch and DigitalWatch which are Interface by "implements" keyword. 
* We can make a relation of AppleWatch with AppleWatchSeries which is a regular class by "extends" keyword.
*/

public abstract class AppleWatch extends AppleWatchSeries5 implements Watch, DigitalWatch {

	public int watchCost = 329;

	public AppleWatch() {
		System.out.println("This constructor is from Abstract class AppleWatch");
		/*
		 * AppleWatch appleWatch = new AppleWatch() { };
		 */
		/*
		 * Yes, we can create a variable and constructor inside Abstract Class. No, an
		 * Abstract class can't be instantiated.
		 */
	}

	// Non-abstract method implemented here.
	public void abstractClassInfo() {
		System.out.println("The Abstract class can have both declared and implemented method ");
		System.out.println("Interface can have declared method only ");
		System.out.println("The regular class have only implemented method only ");

	}

	// Abstract method declared here.
	public abstract void applewatchInfo();

}
