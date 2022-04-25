package com.vth.pattern.creational.abstractfactory;

/**
 * Financial Service Factory Creator Class is responsible to return Factory class
 * for specified Financial Service.
 * 
 * @author vikshind
 *
 */
public class FinServiceFactoryCreator {
	
	/**
	 * Returns Factory class for specified Financial Service.
	 * 
	 * @param choice
	 * @return
	 */
	public static FinServiceAbstractFactory getFactory(String choice) {
		if (choice.equalsIgnoreCase("Bank")) {
			return new BankFactory();
		} else if (choice.equalsIgnoreCase("Loan")) {
			return new LoanFactory();
		}
		return null;
	}
}
