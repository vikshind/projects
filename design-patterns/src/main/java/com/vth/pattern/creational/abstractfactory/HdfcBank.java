package com.vth.pattern.creational.abstractfactory;

/**
 * HDFC Bank - IBank implementation class
 * 
 * @author vikshind
 *
 */
public class HdfcBank implements Bank{

	@Override
	public String getBankName() {
		return "HDFC Bank";
	}

}
