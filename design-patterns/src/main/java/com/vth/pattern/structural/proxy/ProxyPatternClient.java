package com.vth.pattern.structural.proxy;

/**
 * Proxy Client
 * 
 * @author vikshind
 *
 */
public class ProxyPatternClient {
	public static void main(String[] args) {
		IInternetAccess access = new ProxyInternetAccess("Vikram Shinde");
		access.grantInternetAccess();
	}
}
