package service;

import java.util.Scanner;

public class Exercise_02 {
	
	private static int factorialForLoop(int N) {
		if(N < 0) {
			return 0;
		}
		else if (N >= 0 && N < 2) {
			return 1;
		}
		else {
			int result = 1;
			for(int i = 2; i < N+1; i++) {
				result = result * i;
			}
			return result;
		}
	}
	
	private static int factorialRecursive(int N) {
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
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Lūdzu ievadiet veselu skaitli:");
		int N = input.nextInt();
		input.close();
		System.out.println("Aprēķins ar For ciklu:");
		System.out.println("-------------------------------------------");
		System.out.println("Dotā skaitļa " + N + " faktoriāls ir " + factorialForLoop(N) + ".");
		System.out.println();
		System.out.println("Aprēķins ar rekursīvo funkciju:");
		System.out.println("-------------------------------------------");
		System.out.println("Dotā skaitļa " + N + " faktoriāls ir " + factorialRecursive(N) + ".");

	}

}
