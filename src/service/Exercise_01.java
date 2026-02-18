package service;

public class Exercise_01 {

	static final double GRAVITY = -9.81;
	private static double positionCalc(double initialVelocity, double initialPosition, double fallingTime) throws Exception {
		
		if(initialVelocity >= 0 && initialPosition >= 0 && fallingTime >= 0) {
			double finalPosition = 0.5 * GRAVITY * Math.pow(fallingTime,2) + initialVelocity * fallingTime + initialPosition;
			return finalPosition;			
		}
		else {
			System.out.println("Kads no ievades datiem nav pareiza vertiba");
			throw new Exception("Nevar aprekinat, jo kads no ievades datiem nav pareiza vertiba");
		}
	}
	
	public static void main(String[] args) {

		try {
		System.out.println("Bumbinas pozicija: " + positionCalc(30, 5, 20) + " m");
		}
		catch(Exception e) {
			System.out.println(e.getMessage());
		}
	}
}
