package com.meirapentermann.jets;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class FleetTests {
	Jet j1, j2, j3;
	Fleet f1, f2;
	ArrayList<Jet> l1, l2;

	@Before
	public void setUp() throws Exception {
		j1 = new Jet();
		j2 = new Jet("Test Jet 1", 600, 3000, 30);
		j3 = new Jet("Test Jet 2", 500, 4000, 200);
		l1.add(j1);
		l1.add(j2);
		l1.add(j3);
		f1 = new Fleet(l1);
		l2.add(j2);
		l2.add(j3);
		f2 = new Fleet(l2);
	}

	@After
	public void tearDown() throws Exception {
		j1 = null;
		j2 = null;
		j3 = null;
		l1 = null;
		l2 = null;
		f1 = null;
		f2 = null;
	}

	@Test
	public void test_fastest_in_fleet_returns_j2() {
		assertEquals(j2, f1.fastestInFleet());
		assertEquals(j2, f2.fastestInFleet());
	}
	
	@Test
	public void test_longest_range_in_fleet_returns_j3() {
		assertEquals(j3, f1.longestRange());
		assertEquals(j3, f2.longestRange());
	}

}
