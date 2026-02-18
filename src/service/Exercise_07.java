package service;

import java.util.Scanner;

public class Exercise_07 {

	static double factorialRecursive(int N) {
		if(N < 0) {
			return 0;
		}
		else if (N == 0 || N == 1) {
			return 1;
		}
		else {
			return N * factorialRecursive(N - 1);
		}		
	}
	
	static String pascalsTriangle(int level) {
		String text = "[";
		double element = 0;
		
		for(int i = 0; i < (level + 1); i++) {
			element = (factorialRecursive(level))/(factorialRecursive(i) * factorialRecursive(level-i));
			if(i == level) {
				text = text + (int)element;
			}
			else {
				text = text + (int)element + ", ";
			}
		}
		text = text + "]";

		return text;
	}
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Lūdzu ievadiet Paskāla trijstūra rindas numuru kā veselu skaitli:");
		int level = input.nextInt();
		input.close();
		
		
		System.out.println("Paskāla trijstūra " + level + ". rindas elementi ir: " + pascalsTriangle(level));

		
	}

}
