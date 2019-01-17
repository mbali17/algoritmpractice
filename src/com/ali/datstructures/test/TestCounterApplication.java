package com.ali.datstructures.test;

import com.ali.datstructures.adt.Counter;
/**
 * This class tests the counter class.
 * @author Ali
 *
 */
public class TestCounterApplication {

	public static void main(String[] args) {
		Counter firstCounter = new Counter("Personal Counter");
		for(int i=0;i<10;i++) {
			firstCounter.increment();
		}
		System.out.println("the counter value is "+firstCounter.toString());
	}

}
