package com.vth.pattern.abstractfactory;

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
