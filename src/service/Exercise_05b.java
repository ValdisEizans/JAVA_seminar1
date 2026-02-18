package service;

import java.util.Scanner;

public class Exercise_05b {

	static int[] rollDice(int N) {
		int roll = 0;
		int ones = 0;
		int twos = 0;
		int threes = 0;
		int fours = 0;
		int fives = 0;
		int sixs = 0;
		int[] array = new int[6];
		
		for(int i = 0; i < N; i++) {
			roll = (1 + (int)(Math.random() * ((6 - 1) + 1)));
			if(roll == 1) {
				ones++;
			}
			else if (roll == 2) {
				twos++;
			}
			else if (roll == 3) {
				threes++;
			}
			else if (roll == 4) {
				fours++;
			}
			else if (roll == 5) {
				fives++;
			}
			else {
				sixs++;
			}
		}

		array[0] = ones;
		array[1] = twos;
		array[2] = threes;
		array[3] = fours;
		array[4] = fives;
		array[5] = sixs;

		return array;
	}

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.println("Lūdzu ievadiet plānoto metienu skaitu kā veselu skaitli:");
		int N = input.nextInt();
		input.close();

		
		int[] stats = rollDice(N);
		System.out.println("Vieninieks izkrita " + stats[0] + " reizes.");
		System.out.println("Divnieks izkrita " + stats[1] + " reizes.");
		System.out.println("Trijnieks izkrita " + stats[2] + " reizes.");
		System.out.println("Četrnieks izkrita " + stats[3] + " reizes.");
		System.out.println("Piecnieks izkrita " + stats[4] + " reizes.");
		System.out.println("Sešnieks izkrita " + stats[5] + " reizes.");

	}

}
