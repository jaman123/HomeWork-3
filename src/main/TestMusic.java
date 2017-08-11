package main;

import Encapsulation.Singer;
import Polymorphism.MusicInstrumentCalculation;
import Polymorphism.MyMusicCal;
import abstraction.ModernMusic;
import inheritance.Instrument;
import inheritance.MusicHistory;
import inheritance.Pop;

public class TestMusic {

	public static void main(String[] args) {
		
		// Abstraction access
		ModernMusic modernMusic = new ModernMusic();
		modernMusic.classical();
		modernMusic.guiter();
		modernMusic.play();
		
	// Encapsulation access
		Singer singer = new Singer();
		singer.setInstrumentPrice(400.0);
		System.out.println("The price of Instrument with tax is: "+ Singer.getInstrumentPrice());
		singer.setHeight("Five feet and ten inches");
		singer.setWeight("Fatty Man");
		singer.setSingerName("Rock");
		System.out.println("Singer Name is " + singer.getSingerName());
		
		
		//Inheritance access
	    MusicHistory musicHistory = new MusicHistory();
		musicHistory.aboutMusic();
		musicHistory.sound();
		musicHistory.flute();
		
		
		Pop pop = new Pop();
		pop.aboutMusic();
		pop.song();
		pop.flute();
		
		Instrument instrument = new Instrument();
		instrument.microphone();
		instrument.sound();
		instrument.aboutMusic();
		instrument.violin();
		
		//Polymorphism access
		MusicInstrumentCalculation musicInstrumentCalculation = new MusicInstrumentCalculation();
		System.out.println(musicInstrumentCalculation.instrumentCal(2, 4));
		System.out.println(musicInstrumentCalculation.instrumentCal(2, 4,4));
		System.out.println(musicInstrumentCalculation.instrumentCal(2, 10));
		
		MyMusicCal msc =new MyMusicCal();
		System.out.println(msc.instrumentCal(10, 20));
		System.out.println(msc.instrumentCal(2, 2, 3, 3));
		System.out.println(msc.instrumentCal(2, 3, 4));
		
	}

	

}
