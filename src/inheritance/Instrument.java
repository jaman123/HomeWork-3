package inheritance;

public class Instrument extends MusicHistory{
	double cost = 400.0;
	public void violin(){
		System.out.println("Music are more powerfull");
	}
	public void microphone(){
		System.out.println("Sound system are added");
	}
	public void recorder(){
		System.out.println("The record player  system cost :$ " + cost);
	}

}
