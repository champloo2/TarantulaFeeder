package Feeder;

public class spiderCalculations {
	
	public boolean isDueForSnac (Spider spider)
	{
		/*set to 'false' by default because in most cases, 
		 * it is better to underfeed than overfeed.
		 */
		boolean isDue = false;
		int daysUntilNextSnac = spider.calcDaysBetweenSnac() - spider.getDaysSinceFed();
		if (daysUntilNextSnac <= 0) isDue = true;
		return isDue;
	}
	
	public String webMessage(Spider spider)
	{
		String webMessage = spider.getName() + "has a lot of legs";
		return webMessage;
	}
	
	

}
