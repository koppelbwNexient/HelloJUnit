package test;

import static org.junit.Assert.*;
import main.Money;

import org.junit.Test;

public class MoneyTest {

	
	@Test
	public void constructorTest() {
			Money money = new Money(10, "USD");
			
			assertEquals("10 = 10", 10, money.getAmount());
			assertEquals("USD = USD", "USD", money.getCurrency());
			
			money = new Money(20, "EUR");
			
			assertEquals(20, money.getAmount());
			assertEquals("EUR", money.getCurrency());
	}
}
