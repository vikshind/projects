package com.vth.pattern.creational.abstractfactory;

/**
 * BusinessLoan class implementation
 * 
 * @author vikshind
 *
 */
public class BusinessLoan extends Loan {

	@Override
	void getInterestRate(double rate) {
		this.rate = rate;
	}

}
