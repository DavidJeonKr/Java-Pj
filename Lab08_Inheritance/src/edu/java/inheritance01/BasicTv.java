package edu.java.inheritance01;

public class BasicTv {

	private boolean powerOn;
	private int channel;
	private int volume;

	public boolean isPowerOn() {
		return powerOn;
	}

	public void setPowerOn(boolean powerOn) {
		this.powerOn = powerOn;
	}

	public int getChannel() {
		return channel;
	}

	public void setChannel(int channel) {
		this.channel = channel;
	}

	public int getVolume() {
		return volume;
	}

	public void setVolume(int volume) {
		this.volume = volume;
	}

	public void powerOnOff() {
		if (powerOn) {
			powerOn = false;
			System.out.println("TV OFF");
		} else {
			powerOn = true;
			System.out.println("TV ON");
		}
	}
}
