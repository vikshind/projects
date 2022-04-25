package com.vth.pattern.structural.adapter;

/**
 * MP4 Player Class
 * 
 * @author vikshind
 *
 */
public class Mp4Player implements IAdvancedMediaPlayer {

	@Override
	public void playVlc(String fileName) {
		// do nothing
	}

	@Override
	public void playMp4(String fileName) {
		System.out.println("Playing mp4 file. Name: " + fileName);
	}
}
