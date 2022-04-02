package com.vth.pattern.singleton;

public class Singleton {

	private static Singleton mySingleton = null;

	private Singleton() {
	}

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

	public static void log(String str) {
		System.out.println(str);
	}
}
