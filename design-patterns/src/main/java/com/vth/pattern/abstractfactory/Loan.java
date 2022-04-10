package com.vth.pattern.abstractfactory;

/**
 * Loan Interface / Abstract class
 * 
 * @author vikshind
 *
 */
public abstract class Loan {

	protected double rate;

	abstract void getInterestRate(double rate);

	public void calculateLoanPayment(double loanamount, int years) {
		/*
		 * to calculate the monthly loan payment i.e. EMI
		 * 
		 * rate=annual interest rate/12*100; n=number of monthly installments; 1year=12
		 * months. so, n=years*12;
		 * 
		 */

		double emi;
		int n;

		n = years * 12;
		rate = rate / 1200;
		emi = ((rate * Math.pow((1 + rate), n)) / ((Math.pow((1 + rate), n)) - 1)) * loanamount;

		System.out.println("Your monthly EMI is - " + emi + " for the amount - " + loanamount + " you have borrowed");
	}

}
