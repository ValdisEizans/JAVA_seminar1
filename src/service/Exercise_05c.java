package service;

public class Exercise_05c {

	static int roll2Dices() {
		int rollOne = 0;
		int rollTwo = 0;
		int counter = 0;
		
		while(rollOne != 6 && rollTwo != 6) {
			rollOne = (1 + (int)(Math.random() * ((6 - 1) + 1)));
			rollTwo = (1 + (int)(Math.random() * ((6 - 1) + 1)));
			counter++;
		}
		return counter;
	}

	public static void main(String[] args) {
		
		System.out.println("Uz abie, kauliņiem 6 uzkrita pēc " + roll2Dices() + " mēginājumiem.");


	}

}
