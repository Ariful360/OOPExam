package oopExam;

/*
In 2004, Iphone6 come into the market which inherits Iphone5. Implement it. 
*/
public class Iphone6 extends Iphone5{
	
	public void compass() {
		System.out.println("This method is from regular class Iphone6.");
	}
	/*
	 * Iphone1 and Iphone6 they are both  from Phone.
	 */
	
	/*
	 * When different methods exist the same name and parameter are also same, but
	 * the syntax logic are different is called method Overridden. Method Overriding
	 * occurs during run time.
	 * When different methods exist the same name and parameter are also same, but
	 * the syntax logic are different is called method Overridden. Method Overriding
	 * occurs during run time.
	 */

	public int iPhone6(int ramPrice, int cameraPrice) {
		int total = ramPrice + cameraPrice;
		System.out.println("Total price: " + total);
		return total;
	}
	
	public int iPhone6(int ramPrice, int cameraPrice, String processorPrice) {
		int total1 = ramPrice + cameraPrice + Integer.parseInt(processorPrice) ;
		System.out.println("Total price: " + total1);
		return total1;
	}
	
	public void iPhone6(int ramPrice, int cameraPrice, String processorPrice, int memoryPrice) {
		int total2 = ramPrice + cameraPrice + Integer.parseInt(processorPrice) + memoryPrice;
		System.out.println("Total price: " + total2);
		return;
	}
	
	public static int  iPhone6(int ramPrice, int cameraPrice, String processorPrice, int memoryPrice, int chargerPrice) {
		int total3 = ramPrice + cameraPrice + Integer.parseInt(processorPrice) + memoryPrice + chargerPrice;
		System.out.println("Total price: " + total3);
		return total3;
	}
	
	public static int  iPhone6(int ramPrice, int cameraPrice, int memoryPrice, int chargerPrice, String processorPrice) {
		int total4 = ramPrice + cameraPrice + memoryPrice + chargerPrice + Integer.parseInt(processorPrice);
		System.out.println("Total price: " + total4);
		return total4;
	}
	
}
