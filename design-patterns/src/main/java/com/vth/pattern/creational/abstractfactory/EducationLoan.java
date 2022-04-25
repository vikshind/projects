package com.vth.pattern.creational.abstractfactory;

/**
 * EducationLoan class implementation
 * 
 * @author vikshind
 *
 */
public class EducationLoan extends Loan {

	@Override
	void getInterestRate(double rate) {
		this.rate = rate;
	}

}
