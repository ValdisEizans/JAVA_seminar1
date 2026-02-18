package service;

import java.util.Scanner;

public class Exercise_04 {
	static double[][] generateMatrix(int N) {
		double[][] array = new double[N][N];
			for(int i = 0; i < N; i++) {
				for(int j = 0; j < N; j++) {
				array[i][j] = (double) Math.random() * 100;
				}
			}
		return array;
	}
	
	static double getProduct(double[][] matrix, int i, int j) {
		double result = 0;
		if(i <= matrix.length && j <= matrix.length) {
			for(int a = 0; a < matrix.length; a++) {
				result = result + (matrix[i-1][a] * matrix[a][j-1]);
			}
		}
		return result;
	}

	
	static void printArray(double[][] array) {
		for(int i = 0; i < array.length; i++) {
			for(int j = 0; j < array.length; j++) {
				System.out.print(array[i][j] + " ");
			}
			System.out.println(" ");
		}
	}
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.println("Lūdzu ievadiet masīva izmēru kā veselu skaitli:");
		int N = input.nextInt();
		System.out.println("Lūdzu ievadiet rindas numuru kā veselu skaitli:");
		int i = input.nextInt();
		while (i > N || i <= 0) {
			System.out.println("Nekorekti ievadīts skaitlis - lūdzu vēlreiz!");
			i = input.nextInt();
		}
		
		System.out.println("Lūdzu ievadiet kolonnas numuru kā veselu skaitli:");
		int j = input.nextInt();
		while (j > N || j <= 0) {
			System.out.println("Nekorekti ievadīts skaitlis - lūdzu vēlreiz!");
			j = input.nextInt();
		}
		input.close();

		double[][] matrix = generateMatrix(N);
		System.out.println(i + ". rindas un " + j + ". kolonnas reizinājums ir: " + getProduct(matrix, i, j));

		printArray(matrix);
	}

}
