package SpiderTester;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import Feeder.Spider;
import Feeder.spiderCalculations;

public class TestSpiderCalculations {
	
	Spider diego = new Spider("Diego", 3.5, 18);
	spiderCalculations spiderCalc = new spiderCalculations();

	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void testIsDue() {
		System.out.println("from testIsDue(): ");
		boolean isDue = spiderCalc.isDueForSnac(diego);
		assertTrue(isDue);
		
	}
	@Test
	public void testMessage() {
		System.out.println("from testMessage(): ");
		String message = spiderCalc.webMessage(diego);
		assertNotNull(message);

	}

}
