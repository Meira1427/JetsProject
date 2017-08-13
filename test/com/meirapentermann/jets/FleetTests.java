package com.meirapentermann.jets;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class FleetTests {
	Jet j1, j2, j3, j4, j5;
	Fleet f1, f2;
	ArrayList<Jet> l1, l2;

	@Before
	public void setUp() throws Exception {
		j1 = new Jet();
		j2 = new Jet("Test Jet 1", 600, 3000, 30, 50.0);
		j3 = new Jet("Test Jet 2", 500, 4000, 200, 300.0);
		j4 = new Jet("Test Jet 3", 700, 6000, 200, 500.0);
		j5 = new Jet("Test Jet 4", 900, 4000, 200, 450.0);
		ArrayList<Jet> l1 = new ArrayList<Jet>();
		ArrayList<Jet> l2 = new ArrayList<Jet>();
		l1.add(j1);
		l1.add(j2);
		l1.add(j3);
		l1.add(j4);
		l1.add(j5);
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
	public void test_fastest_in_fleet_returns_fastest() {
		assertEquals(j5, f1.fastestInFleet());
		assertEquals(j2, f2.fastestInFleet());
	}
	
	@Test
	public void test_longest_range_in_fleet_returns_longest() {
		assertEquals(j4, f1.longestRange());
		assertEquals(j3, f2.longestRange());
	}

}
