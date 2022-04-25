package com.vth.pattern.creational.factorymethod;

/**
 * Abstract class to calculate bill amount.
 * getRate() is the abstract method and its implementation is provided by sub-classes.
 * 
 * @author vikshind
 *
 */
public abstract class AbstractPlan implements IPlan {

	/**
	 * Calculates bill as per rate provided by specific plan
	 */
	public double calculateBill( int units) {
		System.out.println("Applicable rate is: " + getRate());
		return getRate() * units;
	}
}
