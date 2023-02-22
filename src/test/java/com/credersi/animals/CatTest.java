package com.credersi.animals;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue; //same as expect to on jest
import org.junit.Test;

public class CatTest {
	@Test //defines as an automated test. Must be put before each part of test. 
	public void testInitialState() {
		Cat cat = new Cat();
		assertTrue(cat.isAlive());
		assertEquals(cat.howHungry(), 50);
	}
	@Test
	public void testIfMoreHungry() {
		Cat cat = new Cat();
		assertTrue(cat.isAlive());
		assertEquals(cat.howHungry(), 50);
	}
	@Test
	public void testCatCanRun() {
		Cat cat= new Cat();
		cat.runs();
		assertEquals(cat.howHungry(), 80);
	}
	@Test
	public void testCatCanFeed() {
		Cat cat= new Cat();
		cat.feeds();
		assertEquals(cat.howHungry(), 30);
	}
	@Test
	public void testCatIsFull() {
		Cat cat= new Cat();
		cat.feeds();
		cat.feeds();
		cat.feeds();
		assertEquals(cat.howHungry(), 0);
		}
	@Test
	public void testZombieCat() {
		Cat cat= new Cat();
		cat.runs();
		cat.runs();
		cat.runs();
		
		assertEquals(cat.howHungry(), 80);
		assertTrue(cat.isAlive());
		}
	@Test
	public void CatDies() {
		Cat cat= new Cat();
		cat.runs();
		cat.runs();
		cat.runs();
		cat.runs();
		cat.runs();
		cat.runs();
		cat.runs();
		cat.runs();
		cat.runs();
		cat.runs();
		cat.runs();
		cat.runs();
		cat.runs();
		cat.runs();
		cat.runs();
		cat.runs();
		cat.runs();
		cat.runs();
		cat.runs();
		cat.runs();
		cat.runs();
		cat.runs();
		cat.runs();
		cat.runs();
		cat.runs();
		cat.runs();
		cat.runs();
		cat.runs();
		cat.runs();
		cat.runs();
		
		assertTrue(!cat.isAlive());
	}
	@Test
	public void CatRunsLoop() {
		Cat cat= new Cat();
		for(int i=0; i< 8;i++) {
			cat.runs();
			cat.runs();
			cat.runs();
			cat.runs();
}
		assertTrue(!cat.isAlive());
	}
}
	

	
	

