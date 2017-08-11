package Polymorphism;

public class MyMusicCal extends MusicInstrumentCalculation {
	public int instrumentCal(int num1, int num2) {

		int result = num1 + num2 + 10;
		System.out.println("This is our first number  of instrument is :" + result);
		return result;
	}

	public int instrumentCal(int num1, int num2, int num3) {
		int result = num1 + num2 + num3 -3;
		System.out.println("This is our second number of instrument is :" + result);
		return result;
	}

}
