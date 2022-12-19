package oopExam;

/*
 * Interface is a Blueprint of Class. 
 * It starts with UpperCase.
 * Interface cannot be instantiated. Method can be declared in Interface.
 * However, static and default method can be implemented in an Interface. 
 * One keyword is used for the inheritance in Interface which is "extends".
 * Interface can inherit only an Interface but cannot inherit a Regular or Abstract Class
 * Interface can inherit more than one Interface. Implements keyword can't be used for inheritance inside Interface 
 * In Interface, variables are final.  
 */

public interface Phone extends Pager, Wakitoki {

	public static final String info = "Comunicating Device";

	/*
	 * public Phone() {} In Interface, a Constructor cannot be created.
	 */

	public void interfaceInfo();

	public void call();

	public void message();

	public void camera();

	public static void battery() {
		System.out.println("battery is a static method from Phone Interface");
	}

	public default void wireless() {
		System.out.println("battery is a default method from Phone Interface");
	}
}
