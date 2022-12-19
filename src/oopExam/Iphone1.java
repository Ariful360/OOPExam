package oopExam;

/*
 * Yes, we can make a relation  of Iphone1 with Iphone1 with AppleWatch which Abstract Class by "extends" Keyword,
 *  and Phone which is Interface by "implements" keyword. 
*/

public class Iphone1 extends AppleWatch implements Phone {

	// variables which are private declared here.
	// We can use setter and getter concept to get the out come.
	private int price;
	private String info;
	private char user;
	private boolean madeInUSA;
	public int yearmade;

	public Iphone1() {

	}

	public Iphone1(int price, String info, char user, boolean madeInUSA) {
		super();
		this.price = price;
		this.info = info;
		this.user = user;
		this.madeInUSA = madeInUSA;
		System.out.println("Iphone price: " + price + ", Iphone Brand: " + info + ", Iphone user: " + user
				+ "Iphone made in Usa: " + madeInUSA);

	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public String getInfo() {
		return info;
	}

	public void setInfo(String info) {
		this.info = info;
	}

	public char getUser() {
		return user;
	}

	public void setUser(char user) {
		this.user = user;
	}

	public boolean isMadeInUSA() {
		return madeInUSA;
	}

	public void setMadeInUSA(boolean madeInUSA) {
		this.madeInUSA = madeInUSA;
	}

	public void regularClassInfo() {
		System.out.println("\nRegularClassInfo method is from Iphone1 Regular Class."
				+ "\nA regular class can be instantiatedn. " + "\nAbstract class & Interface cannot be instantiated. "
				+ "\nmethod can be only implemented in a regual class. "
				+ "\nContains only abstract methods in Interface. "
				+ "\nmethods in Abstract class  can be both implemented and declared. "
				+ "\nextends and implements keywords are used for inheritance");
	}

	public static void youtube() {
		System.out.println("youtube is a static method of Iphone1 class. ");
	}

	@Override
	public void data() {
		// TODO Auto-generated method stub

	}

	@Override
	public void wakitoki() {
		// TODO Auto-generated method stub

	}

	@Override
	public void interfaceInfo() {
		// TODO Auto-generated method stub

	}

	@Override
	public void call() {
		// TODO Auto-generated method stub

	}

	@Override
	public void message() {
		// TODO Auto-generated method stub

	}

	@Override
	public void camera() {
		// TODO Auto-generated method stub

	}

	@Override
	public void applewatchInfo() {
		// TODO Auto-generated method stub

	}

	@Override
	public void watch() {
		// TODO Auto-generated method stub

	}

	@Override
	public void digitalWatch() {
		// TODO Auto-generated method stub

	}

}
