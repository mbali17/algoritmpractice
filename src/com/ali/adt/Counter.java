/**
 * 
 */
package com.ali.adt;

/**
 * @author Ali
 *This is a counter abstract class.
 */
public class Counter {
	private int counter;
	private String counterName;
	
	public Counter(String counterName) {
		this.counterName =  counterName;
	}
	/**
	 * This method increments the current counter value by 1.
	 */
	public void increment() {
		this.counter += 1;
	}
	/**
	 * 
	 * @return the current value of the counter.
	 */
	public int getCurrentValue() {
		return this.counter;
	}
	
	@Override
	public String toString() {

		return this.counterName + " " + this.counter;
	}
}
