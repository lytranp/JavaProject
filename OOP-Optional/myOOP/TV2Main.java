package myOOP;

public class TV2Main {

	public static void main(String[] args) {
		TV2 myTV = new TV2();
		myTV.turnOn();
		myTV.getOn();
		System.out.println(myTV.getOn());
		
		//myTV.setChannel(30);
		//myTV.setVolume(3);
		//myTV.turnOff();
		
		TV2 hisTV = new TV2(55, 3, true);
		hisTV.channelUp();
		hisTV.channelUp();
		hisTV.volumeUp();
		
		TV2 herTV = new TV2();

		
		System.out.println("myTV = " + myTV);
		System.out.println("hisTV = " + hisTV);
		System.out.println("herTV = " + herTV);

	}

}
