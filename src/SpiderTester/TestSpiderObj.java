package SpiderTester;

import Feeder.*;


import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class TestSpiderObj {
	
	Spider dolo = new Spider();
	//spiderCalculations spiderCalc = new spiderCalculations();
	
	

	@Before
	public void setUp() throws Exception {
	}


	@Test
	public void testDaysBetween() {
		System.out.println("from testDaysBetween(): ");
		dolo.setSpan(4.5);
		double between = dolo.calcDaysBetweenSnac();
		assertEquals(21, between, 0.0);
	}
	
	public void testDaysBetween2() {
		System.out.println("from testDaysBetween(): ");
		dolo.setSpan(2.5);
		double between = dolo.calcDaysBetweenSnac();
		assertEquals(14, between, 0.0);
	}
	public void testDaysBetween3() {
		System.out.println("from testDaysBetween(): ");
		dolo.setSpan(.25);
		double between = dolo.calcDaysBetweenSnac();
		assertEquals(1, between, 0.0);
	}
	


}
