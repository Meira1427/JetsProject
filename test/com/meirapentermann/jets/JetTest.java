package com.meirapentermann.jets;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class JetTest {
	Jet j;

	@Before
	public void setUp() throws Exception {
		j = new Jet();
	}

	@After
	public void tearDown() throws Exception {
		j = null;
	}

	@Test
	public void test_get_model_not_null() {
		assertNotNull(j.getModel());
	}
	
	@Test
	public void test_get_speed_not_null() {
		assertNotNull(j.getSpeed());
	}

	@Test
	public void test_get_speed_0() {
		assertEquals(0.0, j.getSpeed(), .001);
	}
	
	@Test
	public void test_get_range_not_null() {
		assertNotNull(j.getRange());
	}
	
	@Test
	public void test_get_range_0() {
		assertEquals(0.0, j.getRange(), .001);
	}
	
	@Test
	public void test_get_capacity_not_null() {
		assertNotNull(j.getCapacity());
	}
	
	@Test
	public void test_get_capacity_0() {
		assertEquals(0, j.getCapacity());
	}
}
