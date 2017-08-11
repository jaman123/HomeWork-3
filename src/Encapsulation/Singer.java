package Encapsulation;

public class Singer {
	private int instrumentType;
	private String singerName;
	private String height;
	private String weight;
	static double instrumentPrice;
	final double tax=8.875;
	
	public int getInstrumentType() {
		return instrumentType;
	}
	public void setInstrumentType(int instrumentType) {
		this.instrumentType = instrumentType;
	}
	public String getSingerName() {
		return singerName;
	}
	public void setSingerName(String singerName) {
		this.singerName = singerName;
	}
	public String getHeight() {
		return height;
	}
	public void setHeight(String height) {
		this.height = height;
		System.out.println("The Singer height is :" + height);
	}
	public String getWeight() {
		return weight;
	}
	public void setWeight(String weight) {
		this.weight = weight;
	}
	public static double getInstrumentPrice() {
		return instrumentPrice;
		
	}
	public void setInstrumentPrice(double instrumentPrice) {
		Singer.instrumentPrice = instrumentPrice*tax/100 +instrumentPrice;

	}
	public double getTax() {
		return tax;
	}
	

}
