package com.vth.pattern.creational.abstractfactory;

/**
 * Abstract class that needs to be implemented in order to have Factory to
 * create objects of specific Financial Services like - Bank or Loan
 * 
 * @author vikshind
 *
 */
public abstract class FinServiceAbstractFactory {

	/**
	 * Returns Bank object
	 * 
	 * @param bank
	 * @return
	 */
	public abstract Bank getBank(String bank);

	/**
	 * Returns Loan object
	 * 
	 * @param loan
	 * @return
	 */
	public abstract Loan getLoan(String loan);
}
