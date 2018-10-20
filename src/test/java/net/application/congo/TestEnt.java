package net.application.congo;

import static org.junit.Assert.assertTrue;

import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestEnt {
	
	
	
	@Test
	public void test() {
		
		try {
			
		ClassPathXmlApplicationContext app = new ClassPathXmlApplicationContext(new String
			[] {"applicationContext.xml"});
		assertTrue (true);
		
		}
		
		catch (Exception e){
			assertTrue(e.getMessage(), false);
			
		}
	
	}

}
