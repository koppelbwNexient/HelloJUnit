package test;

import static org.junit.Assert.assertEquals;
import main.MessageUtil;

import org.junit.Test;

public class SuiteTest01 {

	String message = "Robert";
	MessageUtil messageUtil = new MessageUtil(message);

	@Test
	public void testPrintMessage() {
		System.out.println("Inside testPrintMessage()");
		assertEquals(message, messageUtil.printMessage());
	}
	
	@Test(timeout=1000)
	public void testInfiniteLoop() {
		System.out.println("Inside infiniteLoop()");
		messageUtil.infiniteLoop();
	}
}
