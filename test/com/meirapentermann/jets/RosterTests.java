package com.meirapentermann.jets;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class RosterTests {
	Pilot p1, p2, p3;
	ArrayList<Pilot> pilots;
	Roster r1;
	Jet j1, j2, j3;
	Fleet f1;
	ArrayList<Jet> l1;

	@Before
	public void setUp() throws Exception {
		p1 = new Pilot("Joe", "Smith", "the Glider");
		p2 = new Pilot("New", "Pilot", "the Nickname");
		p3 = new Pilot("Tom", "Jones");
		pilots = new ArrayList<Pilot>();
		pilots.add(p1);
		pilots.add(p2);
		pilots.add(p3);
		r1 = new Roster(pilots);
		j1 = new Jet("Test Jet 1", 400, 2500, 200, 100.0);
		j2 = new Jet("Test Jet 2", 600, 3000, 30, 50.0);
		j3 = new Jet("Test Jet 3", 500, 4000, 200, 300.0);
		l1 = new ArrayList<Jet>();
		l1.add(j1);
		l1.add(j2);
		l1.add(j3);
		f1 = new Fleet(l1);
	}

	@After
	public void tearDown() throws Exception {
		p1 = null;
		p2 = null;
		p3 = null;
		pilots = null;
		j1 = null;
		j2 = null;
		j3 = null;
		f1 = null;
		l1 = null;
		r1 = null;
	}

	@Test
	public void test_assign_pilots_to_fleet() {
		try {
			r1.assignPilotsToFleet(f1);
		}
		catch (Exception e) {
			fail("Should not be exception");
		}
	}
	
	@Test
	public void test_printing_pilots() {
		for(int i = 0; i < pilots.size(); i++) {
			System.out.println(pilots.get(i));
		}
	}

}
