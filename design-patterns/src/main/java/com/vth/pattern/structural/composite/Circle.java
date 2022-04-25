package com.vth.pattern.structural.composite;

public class Circle implements IShape {

	@Override
	public void draw(String fillColor) {
		System.out.println("Drawing Circle with color " + fillColor);
	}

}
