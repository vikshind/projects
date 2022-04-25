package com.vth.pattern.creational.abstractfactory;

/**
 * HomeLoan class implementation
 * 
 * @author vikshind
 *
 */
public class HomeLoan extends Loan {

	@Override
	void getInterestRate(double rate) {
		this.rate = rate;
	}

}
