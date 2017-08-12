package com.meirapentermann.jets;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class JetMenuTests {
	JetMenu menu1, menu2;
	String[] options = {"Option 1", "Option 1", "Option 3"};

	@Before
	public void setUp() throws Exception {
		menu1 = new JetMenu();
		menu2 = new JetMenu(options);
	}

	@After
	public void tearDown() throws Exception {
		menu1 = null;
		menu2 = null;
	}

	@Test
	public void test_get_numOptions_returns_3 () {
		assertEquals(0, menu1.getNumOptions());
		assertEquals(3, menu2.getNumOptions());
	}

}
