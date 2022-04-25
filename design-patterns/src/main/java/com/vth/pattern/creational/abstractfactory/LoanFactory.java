package com.vth.pattern.creational.abstractfactory;

/**
 * LoanFactory class helps you deal with specific Bank
 * 
 * @author vikshind
 *
 */
public class LoanFactory extends FinServiceAbstractFactory {
	
	public Bank getBank(String bank) {
		return null;
	}

	public Loan getLoan(String loan) {
		if (loan == null) {
			return null;
		}
		if (loan.equalsIgnoreCase("Home")) {
			return new HomeLoan();
		} else if (loan.equalsIgnoreCase("Business")) {
			return new BusinessLoan();
		} else if (loan.equalsIgnoreCase("Education")) {
			return new EducationLoan();
		}
		return null;
	}
}
