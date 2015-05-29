package test;

import static org.junit.Assert.*;
import main.MessageUtil;

import org.junit.Test;

public class MessageUtilTest {

	
	   String message = "Hello World";	
	   MessageUtil messageUtil = new MessageUtil(message);

	   @Test
	   public void testPrintMessage() {
	      assertEquals(message,messageUtil.printMessage());
	   }
}
