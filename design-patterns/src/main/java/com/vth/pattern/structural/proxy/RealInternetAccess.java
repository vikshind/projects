package com.vth.pattern.structural.proxy;

/**
 * Real Class to access Internet
 * 
 * @author vikshind
 *
 */
public class RealInternetAccess implements IInternetAccess {
	private String employeeName;

	public RealInternetAccess(String empName) {
		this.employeeName = empName;
	}

	@Override
	public void grantInternetAccess() {
		System.out.println("Internet Access granted for employee: " + employeeName);
	}
}
