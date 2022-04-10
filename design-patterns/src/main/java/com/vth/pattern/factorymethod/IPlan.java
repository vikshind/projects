package com.vth.pattern.factorymethod;
/**
 * Electricity Bill Plan and Calculation Interface
 * @author vikshind
 *
 */
public interface IPlan {

	/**
	 * This is abstract method and SubClasses will decide on Rates
	 * @return
	 */
	public double getRate();
	
	/**
	 * Interface method to calculate Electricity Bill
	 * @param units
	 * @return
	 */
	public double calculateBill( int units );
	
}
