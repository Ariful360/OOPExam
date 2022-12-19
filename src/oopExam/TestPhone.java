package oopExam;

public class TestPhone {

	public static void main(String[] args) {
		System.out.println("\n.....................Regular class Iphone1...................");
		Iphone1 iphone1 = new Iphone1();
		iphone1.setPrice(549);
		iphone1.setInfo("Apple");
		iphone1.setUser('M');
		iphone1.setMadeInUSA(false);
		System.out.print("The price is: " + iphone1.getPrice() + "$" + ", Brand of this phone is: " + iphone1.getInfo()
				+ ", user's sex: " + iphone1.getUser() + ", Made in USA: " + iphone1.isMadeInUSA());

		iphone1.regularClassInfo();
		Iphone1.youtube();
		iphone1.wakitoki();
		iphone1.watch();
		iphone1.data();
		iphone1.digitalWatch();
		iphone1.interfaceInfo();
		iphone1.call();
		iphone1.message();
		iphone1.camera();
		iphone1.appleWatchSeriesInfo();
		iphone1.abstractClassInfo();

		System.out.println("\n....................Abstract Class AppleWatch..............");
		AppleWatch appleWatch = new Iphone1();
		appleWatch.abstractClassInfo();
		appleWatch.applewatchInfo();
		appleWatch.appleWatchSeriesInfo();
		appleWatch.watch();
		appleWatch.digitalWatch();

		System.out.println("\n....................Interface class Phone...................");
		Phone phone = new Iphone1();
		phone.interfaceInfo();
		phone.call();
		phone.data();
		phone.message();
		phone.camera();
		Phone.battery();
		phone.wakitoki();

		System.out.println("\n----------Iphone2----------\n");

		System.out.println("----Default constructor initialized from Iphone2 class----");
		Iphone2 iphone2 = new Iphone2();
		System.out.println("\n----Parameterized constructor initialized from Iphone2 class----");
		Iphone2 iphone3 = new Iphone2('F');
		System.out.println("\n---- void type method initialized from Iphone2 class----");
		Iphone2 iphone4 = new Iphone2();
		System.out.println("\n----Parametherized method initialized from Iphone2 class----");
		Iphone2 iphone5 = new Iphone2('F');
		System.out.println("\n----Default constructor initialized from Iphone1 class----");
		Iphone1 iphone01 = new Iphone1();
		System.out.println("\n----Parameterized constructor initialized from Iphone1 class----");
		Iphone1 iphone02 = new Iphone1(549, "Apple", 'M', false);
		System.out.println("\n----void type method initialized from Iphone1 class----");
		Iphone1 iphone03 = new Iphone1();

		System.out.println("\n........Iphone6 instantiated and call all possible methods.........");
		Iphone6 iphone6 = new Iphone6();
		iphone6.setInfo(null);
		iphone6.setMadeInUSA(false);
		iphone6.setPrice(0);
		iphone6.setUser('0');
		iphone6.getPrice();
		iphone6.getInfo();
		iphone6.isMadeInUSA();
		iphone6.regularClassInfo();
		Iphone6.youtube();
		iphone6.wakitoki();
		iphone6.data();
		iphone6.watch();
		iphone6.digitalWatch();
		iphone6.interfaceInfo();
		iphone6.call();
		iphone6.message();
		iphone6.camera();
		iphone6.appleWatchSeriesInfo();
		iphone6.abstractClassInfo();
		iphone6.iPhone2Info();
		iphone6.photos();
		iphone6.email();
		iphone6.getUser();
		iphone6.dropbox();
		iphone6.compass();
		iphone6.appleWatchSeriesInfo();
		iphone6.iPhone2Info('M');
		iphone6.iPhone6(300, 350);
		iphone6.iPhone6(300, 350, "350");
		iphone6.iPhone6(300, 350, "350", 200);
		Iphone6.iPhone6(300, 350, "350", 200, 50);

		System.out.println("\n----Regular Class ConfiguredIphone6----\n");

		ConfiguredIphone6 conIphone6 = new ConfiguredIphone6();
		conIphone6.compass();
		conIphone6.email();
		conIphone6.photos();
		conIphone6.iPhone2Info();
		conIphone6.iPhone2Info('M');
		conIphone6.dropbox();
		conIphone6.regularClassInfo();
		conIphone6.wakitoki();
		conIphone6.watch();
		ConfiguredIphone6.youtube();
		conIphone6.interfaceInfo();
		conIphone6.call();
		conIphone6.data();
		conIphone6.message();
		conIphone6.camera();
		conIphone6.abstractClassInfo();
		conIphone6.appleWatchSeriesInfo();
		conIphone6.digitalWatch();
		conIphone6.appleWatchSeriesInfo();
		conIphone6.iPhone6(300, 350);
		conIphone6.iPhone6(300, 350, "350");
		conIphone6.iPhone6(300, 250, "350", 200);
		Iphone6.iPhone6(300, 350, "350", 200, 50);

		/*
		 * The relationship between Iphone1, Iphone2, Iphone3, Iphone4, Iphone5 and
		 * Iphone6 is an example of multi-level inheritance. The relationship between
		 * Iphone1, Iphone2, Iphone3 is an example of hierarchical inheritance. Like
		 * both Iphone2 and Iphone3 are derived from the parent class Iphone1. The
		 * relation between Iphone1 and Iphone2 is an example of single inheritance.
		 */

	}

}
