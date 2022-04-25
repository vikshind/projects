package com.vth.pattern.creational.singleton;

//Java program to demonstrate the example
//of using Enum as Singleton

enum SingletonEnum {
	INSTANCE;
	int value;

	public int getValue() {
		return value;
	}

	public void setValue(int value) {
		this.value = value;
	}
}
class Main {

	public static void main(String[] args) {
		SingletonEnum singleton = SingletonEnum.INSTANCE;

		System.out.println(singleton.getValue());
		singleton.setValue(2);
		System.out.println(singleton.getValue());
	}
}
