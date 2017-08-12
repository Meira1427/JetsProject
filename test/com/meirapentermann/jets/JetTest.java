package com.meirapentermann.jets;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class JetTest {
	Jet j1, j2, j3;

	@Before
	public void setUp() throws Exception {
		j1 = new Jet();
		j2 = new Jet("Test Jet 1", 600, 5000, 30);
		j3 = new Jet("Test Jet 2", 500, 4000, 200);
	}

	@After
	public void tearDown() throws Exception {
		j1 = null;
		j2 = null;
		j3 = null;
	}

	@Test
	public void test_get_model_not_null() {
		assertNotNull(j1.getModel());
	}
	
	@Test
	public void test_get_speed_not_null() {
		assertNotNull(j1.getSpeed());
	}

	@Test
	public void test_get_speed_0() {
		assertEquals(0.0, j1.getSpeed(), .001);
	}
	
	@Test
	public void test_get_range_not_null() {
		assertNotNull(j1.getRange());
	}
	
	@Test
	public void test_get_range_0() {
		assertEquals(0.0, j1.getRange(), .001);
	}
	
	@Test
	public void test_get_capacity_not_null() {
		assertNotNull(j1.getCapacity());
	}
	
	@Test
	public void test_get_capacity_0() {
		assertEquals(0, j1.getCapacity());
	}
	
	@Test
	public void test_compare_speed_returns_j2 () {
		assertEquals(j2,j3.compareSpeedFast(j2));
		assertEquals(j2,j2.compareSpeedFast(j3));
	}
	
	@Test
	public void test_compare_range_returns_j2 () {
		assertEquals(j2,j3.compareRangeLong(j2));
		assertEquals(j2,j2.compareRangeLong(j3));
	}
}
