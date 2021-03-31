import java.util.Scanner;

public class TestAirplane {

	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		
		Airplane a1, a2;
		
		String makeInput = AirplaneUtilities.getMakeInput(kb);
		int modelInput = AirplaneUtilities.getModelInput(kb, makeInput);
		a1 = AirplaneUtilities.createAirplane(makeInput, modelInput);
		
		a2 = new Airplane("Embraer", 190);
		System.out.printf("Airplane Object %d created...", Airplane.getAircraftCount());
		System.out.println(a2);
		
		a2.setMake("Airbus");
		a2.setModel(380);
		a2.setRange(8000);
		a2.setSpeed(643);
		a2.setCapacity(555);
		System.out.println("Airplane Object 2 changed...");
		System.out.println(a2);
		
		System.out.println();
		System.out.printf("Airplane Objects created: %d", Airplane.getAircraftCount());
	}
}
