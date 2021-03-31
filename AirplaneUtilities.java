/**
 * Class: AirplaneUtilities
 * Written by: David Rude
 * Description: A set of static methods to be used with
 * the TestAirplane program
 */
import java.util.Scanner;
import java.util.Random;

public class AirplaneUtilities {
	/**
	 * getMakeInput static Method
	 * Prompt user for make of aircraft. Call the validateMake method
	 * to check for a good input of aircraft make.
	 */
	public static String getMakeInput(Scanner input) {
		String inputString = "x"; //used to get the aircraft make from the user
		boolean makeValid; // set to true or false from the validateMake method
		
		System.out.print("\nEnter the make of aircraft (Boeing, Airbus, or Embraer): ");
		inputString = input.nextLine();
		makeValid = validateMake(inputString); // call the validateMake method
		
		while (!makeValid) {
			System.out.println("\nError - Invalid Input. You entered: " + inputString);
			System.out.print("Enter the make of aircraft (Boeing, Airbus, or Embraer): ");
			inputString = input.nextLine();
			makeValid = validateMake(inputString); // call the validateMake method
		}
		return inputString;
	}       
	
	/**
	 * 
	 * getModelInput static Method
	 * Prompt user for model of aircraft. Call the validateModel method
	 * to check for a good input of aircraft model.
	 * @param input
	 * @param make
	 * @return
	 */
	public static int getModelInput(Scanner input, String make) {
		int inputInt = 0; //used to get the aircraft make from the user
		boolean modelValid; // set to true or false from the validateMake method
		final String BoeingModels = "787, 767, 757, 747, 737"; // string with valid Boeing aircraft
		final String AirbusModels = "380, 340, 320"; // string with valid Airbus aircraft
		final String EmbraerModels = "190, 175, 145"; // string with valid Embraer aircraft
		String modelOutputString = ""; // holds the model strings based on the make of aircraft selected
		if(make.toLowerCase().equals("boeing")) { // set model output string for Boeing aircraft
			modelOutputString = BoeingModels;
		}
		else if(make.toLowerCase().equals("airbus")) { // set model output string for Airbus aircraft
			modelOutputString = AirbusModels;
		}
		else {
			modelOutputString = EmbraerModels; // set model output string for Embraer aircraft
		}
		
		/*
		* Ask for the model number of the aircraft and validate that 
		* the model number is correct for the make of aircraft selected.
		*/
		System.out.println("\nValid model numbers for " + make.toUpperCase() + " are " + modelOutputString);
		System.out.print("Enter the model of " + make.toUpperCase() + " aircraft: ");
		inputInt = input.nextInt();
		input.nextLine();
		modelValid = validateModel(make, inputInt); // call the validateModel method
			
		/*
		* if model number is invalid loop until you get
		* a valid model number for the aircraft make selected
		*/
		while (!modelValid) {
			System.out.println("\nError - Invalid Input. You entered: " + inputInt);
			System.out.println("Valid model numbers for " + make.toUpperCase() + "are " + modelOutputString);
			System.out.print("Enter the model of " + make.toUpperCase() + " aircraft: ");
			inputInt = input.nextInt();
			input.nextLine();
			modelValid = validateModel(make, inputInt); // call the validateModel method
		}
		return inputInt;
	}
	
	/**
	 * validateMake static method
	 * This method validates that the user has input a valid aircraft make (Boeing, Airbus, Embraer)
	 * It returns true if the aircraft make is valid, false if it is not.
	 * @param makeString
	 * @return true or false
	 */
	public static boolean validateMake(String makeString) {
		boolean makeValid = false;
		if(!(makeString.toLowerCase().equals("boeing")) && !(makeString.toLowerCase().equals("airbus")) 
					&& !(makeString.toLowerCase().equals("embraer"))) {
			makeValid = false;
		}
		else {
			makeValid = true;
		}
		return makeValid;
	} // end of validateMake method
	
	
	/**
	 * validateModel static method
	 * This method validates that the user has input a valid aircraft model 
	 * (Boeing: 787, 767, 757, 747, 737)
	 * (Airbus: 380, 340, 320)
	 * (Embraer: 190, 175, 145)
	 * It returns true if the aircraft make is valid, false if it is not.
	 * @param makeString
	 * @param modelNum
	 * @return true or false
	 */
	public static boolean validateModel(String makeString, int modelNum) {
		boolean returnBoolean = false;
		/*
		 * valid model numbers for Boeing
		 */
		if(makeString.toLowerCase().equals("boeing")) {
			if(modelNum == 787 || modelNum == 767 || modelNum == 757 || modelNum == 747 || modelNum == 737) {
				returnBoolean = true;
			}
			else {
				returnBoolean = false;
			}
		}
		/*
		 * valid model numbers for Airbus
		 */
		if(makeString.toLowerCase().equals("airbus")) {
			if(modelNum == 380 || modelNum == 340 || modelNum == 320) {
				returnBoolean = true;
			}
			else {
				returnBoolean = false;
			}
		}
		/*
		 * valid model numbers for Embraer
		 */
		if(makeString.toLowerCase().equals("embraer")) {
			if(modelNum == 190 || modelNum == 175 || modelNum == 145) {
				returnBoolean = true;
			}
			else {
				returnBoolean = false;
			}
		}
		return returnBoolean;
	} // end of validateModel method
	
	
	/**
	 * createAirplane static method
	 * Creates the Airplane object.
	 * The method passes the make and model of the aircraft and
	 * it calls the 2-Arg Airplane constructor. The method returns
	 * an Airplane object.
	 * @param vmake
	 * @param vmodel
	 */
	public static Airplane createAirplane(String vmake, int vmodel) {
		/*
		 * Adds the Airplane object to the airplaneArray
		 */
		Airplane newAirplane= new Airplane(vmake, vmodel); // call the Airplane constructor passing in the make and model values.
		System.out.println("\nAirplane Object " + Airplane.getAircraftCount() + " Created...");
		System.out.println(newAirplane);
		return newAirplane; // returns a reference to the new Airplane object that was created in memory
	} // end of the createAirplane method
	
	private static int getRandomNumber(int index) {
        int randomInt = 0;
        Random randomGenerator = new Random();
        randomInt = randomGenerator.nextInt(index-1);
        return randomInt;
    }
} // end of AirplaneUntilities Class
