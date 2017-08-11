package abstraction;

public class ModernMusic extends ElectricMusic implements Music {
	public void classical(){
		System.out.println("Some people like classical Music");
	}

	@Override
	public void electricMusic() {
		System.out.println("Electric music is nice");
	}

	@Override
	public void play() {
		System.out.println("Play song");	
	}

	
	public void stop() {
		System.out.println("There is stop feature");
		
	}

}
