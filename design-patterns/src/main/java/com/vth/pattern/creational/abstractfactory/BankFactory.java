package com.vth.pattern.creational.abstractfactory;

/**
 * BankFactory class helps you deal with specific Bank
 * 
 * @author vikshind
 *
 */
public class BankFactory extends FinServiceAbstractFactory {

	/**
	 * Returns instance of specified Bank
	 */
	public Bank getBank(String bank) {
		if (bank == null) {
			return null;
		}
		if (bank.equalsIgnoreCase("HDFC")) {
			return new HdfcBank();
		} else if (bank.equalsIgnoreCase("ICICI")) {
			return new IciciBank();
		} else if (bank.equalsIgnoreCase("SBI")) {
			return new SbiBank();
		}
		return null;
	}

	public Loan getLoan(String loan) {
		return null;
	}

}
