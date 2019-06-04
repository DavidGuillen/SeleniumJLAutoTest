package tuto.eclipse.testCases;


import org.testng.annotations.Test;

//import org.junit.Test;

import tuto.eclipse.jal.selenium.loaders.BookingFlow;
import tuto.eclipse.jal.selenium.loaders.MyDriver;

/**
 * Test to check the booking flow until payment page
 */
public class TestBookingJAL1 extends BookingFlow{
	
	@Test
	public void testBooking1() {
		this.run(); //run default tests from the BookingFlow
		pause(10);
//		MyDriver.quitDriver();
	}
	
//	@Override
//	protected void run() {
//		
//	}
	
	static void pause(int pauseSec) {
		try {
			Thread.sleep(pauseSec * 1000);
		} catch (InterruptedException ex) {
			Thread.currentThread().interrupt();
		}
	}
}
