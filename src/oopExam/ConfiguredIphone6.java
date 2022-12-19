package oopExam;

public class ConfiguredIphone6 extends Iphone6 {

	@Override
	public void compass() {
		System.out.println("This method is from regular class Iphone6.");
	}

	@Override
	public int iPhone6(int ramPrice, int cameraPrice) {
		int total = ramPrice + cameraPrice * 2;
		System.out.println("Total price: " + total);
		return total;
	}

	@Override
	public int iPhone6(int ramPrice, int cameraPrice, String processorPrice) {
		int total1 = ramPrice / 2 + cameraPrice + Integer.parseInt(processorPrice) + 30;
		System.out.println("Total price: " + total1);
		return total1;
	}

	@Override
	public void iPhone6(int ramPrice, int cameraPrice, String processorPrice, int memoryPrice) {
		int total2 = ramPrice * 2 + cameraPrice + 20 + Integer.parseInt(processorPrice) + memoryPrice - 25;
		System.out.println("Total price: " + total2);
		return;
	}

	/*
	 * @Override
	 * 
	 * public static int iPhone6(int ramPrice, int cameraPrice, String
	 * processorPrice, int memoryPrice, int chargerPrice) { int total3 = ramPrice +
	 * cameraPrice + Integer.parseInt(processorPrice) + memoryPrice + chargerPrice;
	 * System.out.println("Total price: " + total3); return total3; }
	 */

	/*
	 * @Override public static int iPhone6(int ramPrice, int cameraPrice, int
	 * memoryPrice, int chargerPrice, String processorPrice) { int total4 = ramPrice
	 * + cameraPrice + memoryPrice + chargerPrice +
	 * Integer.parseInt(processorPrice); System.out.println("Total price: " +
	 * total4); return total4; }
	 */

}
