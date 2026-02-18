package service;

import java.util.Scanner;

public class Exercise_05a {

	static double[] coinFlip(int N) {
		double roll = 0;
		double heads = 0;
		double tails = 0;
		double[] array = new double[3];
		
		for(int i = 0; i < N; i++) {
			roll = Math.random();
				if(roll < 0.5) {
					tails++;
				}
				else {
					heads++;
				}
		}
		array[0] = heads;
		array[1] = tails;
		array[2] = heads/tails;

		return array;
	}

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.println("Lūdzu ievadiet plānoto metienu skaitu kā veselu skaitli:");
		int N = input.nextInt();
		input.close();

		
		double[] stats = coinFlip(N);
		System.out.println("Cipars izkrita " + stats[0] + " reizes.");
		System.out.println("Ģērbonis izkrita " + stats[1] + " reizes.");
		System.out.println("Cipara un gerbona skaita attieciba: " + stats[2]);



	}

}
