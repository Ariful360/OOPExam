package oopExam;

public class Iphone2 extends Iphone1 {

	public char userOfIphone2 = 'M';

	// default constructor
	public Iphone2() {
		super();
		super.regularClassInfo();
		System.out.println("This is a default constructor from Iphone2 Regular Class");
	}

	// parameterized constructor
	public Iphone2(char userOfIphone2) {
		super(549, "Apple", 'M', false);
		super.yearmade = 2000;
		super.regularClassInfo();
		System.out.println("The release year  of Iphone1 is: " + yearmade);
		this.userOfIphone2 = userOfIphone2;
	}

	public void iPhone2Info() {
		super.yearmade = 2000;
		super.regularClassInfo();
		System.out.println("The release year  of Iphone1 is: " + yearmade);
		System.out.println("This is a method from Iphone2 Regular Class");

	}

	// void type parameterized constructor
	public void iPhone2Info(char userOfIphone2) {
		super.yearmade = 2000;
		super.regularClassInfo();
		this.userOfIphone2 = userOfIphone2;
		System.out.println("The release year  of Iphone1 is: " + yearmade);
	}

	public void dropbox() {
		System.out.println("this method is from Iphone2 regular class.");

	}

}
