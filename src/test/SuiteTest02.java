package test;

import static org.junit.Assert.assertEquals;
import main.MessageUtil;

import org.junit.Ignore;
import org.junit.Test;

//@Ignore
public class SuiteTest02 {

	String message = "Robert";
	MessageUtil messageUtil = new MessageUtil(message);

	//@Ignore
	@Test
	public void testSalutationMessage() {
		System.out.println("Inside testSalutationMessage()");
		message = "Hi!" + "Robert";
		assertEquals(message, messageUtil.salutationMessage());
	}
	
	@Test(expected = ArithmeticException.class) 
	public void testDivideByZero() {
		System.out.println("Inisde divideByZero()");
		messageUtil.divideByZero();
	}
}
