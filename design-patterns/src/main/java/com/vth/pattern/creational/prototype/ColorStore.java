package com.vth.pattern.creational.prototype;

import java.util.HashMap;
import java.util.Map;

public class ColorStore {
	private static final Map<String, Color> colorMap = new HashMap<String, Color>();

	static {
		colorMap.put("blue", new BlueColor());
		colorMap.put("black", new BlackColor());
	}

	public static Color getColor(String colorName) {
		return (Color) colorMap.get(colorName).clone();
	}
}
