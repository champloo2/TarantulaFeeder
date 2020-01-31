package Feeder;

public class Spider {
	
	private String name;
	private double span;
	private int daysSinceFed;
	
	public Spider()
	
	{
		
	}
	
	public Spider(String name) 
	
	{
		super();
		this.name = name;
	
	}
	
	public Spider(String name, double span, int daysSinceFed) 
	
	{
		super();
		this.name = name;
		this.span = span;
		this.daysSinceFed = daysSinceFed;
	}


	public String getName() {
		return name;
	}


	public double getSpan() {
		return span;
	}


	public void setSpan(double span) {
		this.span = span;
	}


	public int getDaysSinceFed() {
		return daysSinceFed;
	}


	public void setDaysSinceFed(int daysSinceFed) {
		this.daysSinceFed = daysSinceFed;
	}
	
	public int calcDaysBetweenSnac()
	{
		
		int daysBetween = 0;
		double spanInches = this.span;
		if(spanInches < 0.5) daysBetween = 1;
		else if (spanInches >= 0.5 && spanInches < 1.5) daysBetween = 3;
		else if (spanInches >= 1.5 && spanInches < 2.5) daysBetween = 7;
		else if (spanInches >= 2.5 && spanInches < 4) daysBetween = 14;
		else daysBetween = 21;			
		return daysBetween;
	}
	
	
	
	

}
