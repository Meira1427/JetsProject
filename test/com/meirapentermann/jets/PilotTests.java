package com.meirapentermann.jets;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class PilotTests {
	Pilot p1, p2, p3;

	@Before
	public void setUp() throws Exception {
		p1 = new Pilot("Joe", "Smith", "the Glider");
		p2 = new Pilot("New", "Pilot", "the Nickname");
		p3 = new Pilot("Tom", "Jones");
	}

	@After
	public void tearDown() throws Exception {
		p1 = null;
		p2 = null;
		p3 = null;
	}

	@Test
	public void test_return_full_name() {
		assertEquals("Joe 'the Glider' Smith", p1.returnFullName());
		assertEquals("New 'the Nickname' Pilot", p2.returnFullName());
		assertEquals("Tom Jones", p3.returnFullName());
	}

	@Test
	public void test_return_full_name_in_to_String() {
		assertEquals("Joe Smith", p1.toString());
		assertEquals("New Pilot", p2.toString());
		assertEquals("Tom Jones", p3.toString());
	}
}
