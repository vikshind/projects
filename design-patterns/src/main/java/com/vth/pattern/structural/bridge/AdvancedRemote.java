package com.vth.pattern.structural.bridge;

public class AdvancedRemote extends BasicRemote {

	public AdvancedRemote(IDevice device) {
		super.device = device;
	}

	public void mute() {
		System.out.println("Remote: mute");
		device.setVolume(0);
	}
}
