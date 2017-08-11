package Polymorphism;

public class MusicInstrumentCalculation {
	
	public int instrumentCal(int num1, int num2){
		
		int result = num1 + num2;
		System.out.println("The first number  of instrument is :" + result);
		return result;
	}
	public int instrumentCal(int num1, int num2, int num3){
		int result = num1 + num2 + num3 ;
		System.out.println("The second number of instrument is :" + result);
		return result;
	}
	
	public int instrumentCal(int num1, int num2, int num3,int num4){
		int result = num1 + num2 + num3 + num4 ;
		System.out.println("The third number of instrument is :" + result);
		return result;
	}
	

}
