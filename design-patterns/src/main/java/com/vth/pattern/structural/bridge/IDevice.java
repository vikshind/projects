package com.vth.pattern.structural.bridge;

/**
 * Device Interface 
 * 
 * @author vikshind
 *
 */
public interface IDevice {
	boolean isEnabled();

	void enable();

	void disable();

	int getVolume();

	void setVolume(int percent);

	int getChannel();

	void setChannel(int channel);

	void printStatus();
}