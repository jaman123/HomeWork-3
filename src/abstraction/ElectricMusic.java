package abstraction;

public abstract class ElectricMusic {
	int item=3;
	
	public void guiter(){
		System.out.println("Guitter is modern instrumet");
		
	}
	public void instrument(){
		System.out.println("There is a Instrument number: " + item);
	}
	public abstract void electricMusic();
	public void sound(){
		System.out.println("Soud System is good");
	}

}
