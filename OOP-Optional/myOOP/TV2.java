package myOOP;

public class TV2 {
	private int channel = 1;
	private int volumeLevel = 1;
	private boolean on = false;
	
	public TV2() {
		
	}
	
	public TV2 (int ch, int vol, boolean power) {
		this.channel = ch;
		this.volumeLevel = vol;
		if (power == true)
			turnOn();
		else
			turnOff();
	}
	
	public void turnOn() {
		this.on = true;
	}
	
	public void turnOff() {
		this.on = false;
	}
	
	public int getChannel() {
		return this.channel;
	}
	
	public int getVolumeLevel() {
		return this.volumeLevel;
	}
	
	public boolean getOn() {
		return this.on;
	}
	
	public void setChannel(int newChannel) {
		if (on && this.channel >= 1 && newChannel <= 120)
			this.channel = newChannel;
	}
	
	public void setVolume(int newVolumeLevel) {
		if (on && newVolumeLevel >= 1 && newVolumeLevel < 7)
			this.volumeLevel = newVolumeLevel;
	}
	
	public void channelUp() {
		if (on && this.channel < 120)
			this.channel++;
	}
	
	public void channelDown() {
		if (on && this.channel > 1)
			this.channel--;
	}
	
	public void volumeUp() {
		if (on && this.volumeLevel < 7)
			this.volumeLevel++;
	}
	
	public void volumeDown() {
		if (on && this.volumeLevel > 1)
			this.volumeLevel--;
	}
	
	public String toString() {
		String power = "";
		if (this.on == true)
			power = "On";
		else 
			power = "Off";
		return "TV is: " + power + "; Channel is set to: " + this.channel + 
				"; Volume is set to: " + this.volumeLevel;
	}
}
