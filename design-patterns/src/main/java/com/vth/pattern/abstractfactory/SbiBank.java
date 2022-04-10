package com.vth.pattern.abstractfactory;

/**
 * SBI Bank - IBank implementation class
 * 
 * @author vikshind
 *
 */
public class SbiBank implements Bank{

	@Override
	public String getBankName() {
		return "SBI Bank";
	}

}
