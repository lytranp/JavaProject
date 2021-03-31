import java.util.Arrays;

public class Airplane {
	private String make;
	private int model;
	private int range;
	private int speed;
	private int capacity;
	private static int aircraftCount = 0;
	private final static String[] aircraftType = {"B737","B747","B757","B767","B787","A320","A340","A380","E145","E175","E190"};
	private final static int[] aircraftModel = {737,747,757,767,787,320,340,380,145,175,190};
	private final static int[] aircraftRange = {3000,6089,4488,6473,9200,3542,7900,8000,1784,2531,2819};
	private final static int[] aircraftSpeed = {564,614,610,533,593,562,568,643,518,563,541};
	private final static int[] aircraftCapacity = {215,660,295,375,335,179,475,555,50,72,98};
	
	public Airplane() {
		this.make = " ".toUpperCase();
		aircraftCount++;
	}
	
	public Airplane(String makeIn, int modelIn) {
		String typeString = makeIn.substring(0, 1).toUpperCase();
		typeString = typeString + String.valueOf(modelIn);
		
		int aircraftIndex = 0;
		aircraftIndex = indexOf(aircraftType, typeString);
		
		this.make = makeIn.toUpperCase();
		this.model = aircraftModel[aircraftIndex];
		this.range = aircraftRange[aircraftIndex];
		this.speed = aircraftSpeed[aircraftIndex];
		this.capacity = aircraftCapacity[aircraftIndex];
		aircraftCount++;
	}
	
	public String getMake() {
		return this.make;
	}
	
	public int getModel() {
		return this.model;
	}
	
	public int getRange() {
		return this.range;
	}
	
	public int getSpeed() {
		return this.speed;
	}
	
	public int getCapacity() {
		return this.capacity;
	}
	
	public static int getAircraftCount() {
		return aircraftCount;
	}
	
	private static int indexOf(String[] strArray, String type) {
		int index = Arrays.asList(strArray).indexOf(type);
		return index;
	}
	
	public void setMake(String m) {
		this.make = m.toUpperCase();
	}
	
	public void setModel(int m) {
		this.model = m;
	}
	
	public void setRange(int r) {
		this.range = r;
	}
	
	public void setSpeed(int s) {
		this.speed = s;
	}
	
	public void setCapacity(int c) {
		this.capacity = c;
	}
	
	public String toString(){
        return "\nAircraft Make: " + this.make + "\nAircraft Model: " + this.model + "\nMax Range: " + 
        		this.range + "\nMax Speed: " + this.speed + "\nMax Passenger Capacity: " + this.capacity + "\n";
    }
	

}
