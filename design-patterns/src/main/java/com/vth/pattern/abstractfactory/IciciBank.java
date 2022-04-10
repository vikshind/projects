package com.vth.pattern.abstractfactory;

/**
 * ICICI Bank - IBank implementation class
 * 
 * @author vikshind
 *
 */
public class IciciBank implements Bank{

	@Override
	public String getBankName() {
		return "ICICI Bank";
	}

}
