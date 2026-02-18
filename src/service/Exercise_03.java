package service;

import java.util.Scanner;

public class Exercise_03 {
	static double[] generateArray(int N, double lower, double upper) {
		double[] array = new double[N];
		if(upper > lower) {
			for(int i = 0; i < array.length; i++) {
				array[i] = (lower + (double)(Math.random() * ((upper - lower) + 1)));
				}
		}
		return array;
	}
	
	static double getMean(double[] array) {
		double sum = 0;
		for (double el : array) {
			sum = sum + el;
		}
		double mean = sum/array.length;
		return mean;
	}
	static double getMin(double[] array) {
		double min = array[0];
		for (double el : array) {
			if(el < min) {
				min = el;
			}
		}
		return min;		
	}
	static double getMax(double[] array) {
		double max = 0;
		for (double el : array) {
			if(el > max) {
				max = el;
			}
		}
		return max;			
	}
	static double[] arraySort(double[] array) {
		for (int i = 0; i < array.length - 1; i++) {
			for (int j = 0; j < array.length - i - 1; j++) {
				if(array[j] > array[j + 1]) {
					double temp = array[j];
					array[j] = array[j+1];
					array[j+1] = temp;
				}
			}
		}
		return array;

	}
	
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.println("Lūdzu ievadiet masīva izmēru kā veselu skaitli:");
		int N = input.nextInt();
		System.out.println("Lūdzu ievadiet randomizācijas mazāko vērtību:");
		double lower = input.nextDouble();
		System.out.println("Lūdzu ievadiet randomizācijas lielāko vērtību:");
		double upper = input.nextDouble();	
		input.close();

		double[] array = generateArray(N, lower, upper);

		for(int i = 0; i < array.length; i++) {
			System.out.println(array[i]);
		}
		
		System.out.println("Masīva vidējā vērtība: " + getMean(array) + '\n');
		System.out.println("Masīva mazākā vērtība: " + getMin(array)+ '\n');
		System.out.println("Masīva lielākā vērtība: " + getMax(array) + '\n');
		System.out.println("Sakārtots masīvs: ");
		arraySort(array);
		for(int i = 0; i < array.length; i++) {
			System.out.println(array[i]);
		}
		
	}

}
