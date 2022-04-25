package com.vth.pattern.structural.adapter;

/**
 * Vlc Player Class
 * 
 * @author vikshind
 *
 */
public class VlcPlayer implements IAdvancedMediaPlayer{
	   @Override
	   public void playVlc(String fileName) {
	      System.out.println("Playing vlc file. Name: "+ fileName);		
	   }

	   @Override
	   public void playMp4(String fileName) {
	      //do nothing
	   }
	}
