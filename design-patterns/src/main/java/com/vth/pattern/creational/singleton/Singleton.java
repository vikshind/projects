package com.vth.pattern.creational.singleton;

/**
 * Singleton Pattern implementation example
 * 
 * @author vikshind
 *
 */
public class Singleton implements Cloneable{

	//private static Singleton instance
	private static Singleton mySingleton = null;

	//private Constructor
	private Singleton() {
	}

	/**
	 * Singleton instance is returned by this method
	 * @return
	 */
	public static synchronized Singleton getInstance() {
		if (mySingleton == null) {
			mySingleton = new Singleton();
		}
		return mySingleton;
	}

	public static void main(String[] args) {
		Singleton instance1 = Singleton.getInstance();
		log(instance1.toString());
		
		Singleton instance2 = Singleton.getInstance();
		log(instance2.toString());

	}

	@Override
	protected Object clone() throws CloneNotSupportedException {
	    throw new CloneNotSupportedException();
	}
	
	private static void log(String str) {
		System.out.println(str);
	}
}
