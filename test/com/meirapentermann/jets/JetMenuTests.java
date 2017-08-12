package com.meirapentermann.jets;

import static org.junit.Assert.*;
import java.util.ArrayList;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class JetMenuTests {
	JetMenu menu1, menu2, menu3;
	ArrayList<String> options = new ArrayList<String>();
	ArrayList<String> faulty  = new ArrayList<String>();
	
	
	
	@Before
	public void setUp() throws Exception {
	options.add("Option 1");
	options.add("Option 2");
	options.add("Option 3");
	faulty.add("Option 1");
	faulty.add(null);
	faulty.add("Option 2");
	menu1 = new JetMenu();
	menu2 = new JetMenu(options);	
	menu3 = new JetMenu(faulty);
	}

	@After
	public void tearDown() throws Exception {
		menu1 = null;
		menu2 = null;
		menu3 = null;
		options = null;
		faulty = null;
	}

	@Test
	public void test_get_numOptions_returns_3 () {
		assertEquals(0, menu1.getNumOptions());
		assertEquals(3, menu2.getNumOptions());
		assertEquals(2, menu3.getNumOptions());
		
	}
	
	@Test
	public void test_no_runtime_exceptions_during_print () {
		try {
			menu1.printMenu();
			menu2.printMenu();
			menu3.printMenu();
		}
		catch (Exception e){
			fail("Should not have thrown an error");
		}
	
	}

}
