package com.vth.pattern.creational.factorymethod;
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
    double getRate();
	
	/**
	 * Interface method to calculate Electricity Bill
	 * @param units
	 * @return
	 */
    double calculateBill( int units );
	
}
