package by.traininng.simpelestapp.main9;

import java.util.Random;

public class Main05 {

	public static void main(String[] args) {
		// дана матрица. Вывести на экран все четные строки, то есть с четными номерами

		int[][] mas = new int[5][6];
		Random rand = new Random();
		for (int i = 0; i < mas.length; i++) {
			for (int j = 0; j < mas[i].length; j++) {
				mas[i][j] = rand.nextInt(100);
				
			}

			
		}

		for (int i = 0; i < mas.length; i++) {
			for (int j = 0; j < mas[i].length; j++) {
				System.out.printf("[%4d]", mas[i][j]);
				
			}
		
			System.out.println();
			
		}
		 for (int z = 0; z < mas.length; z += 2) {
	            for (int k = 0; k < mas[z].length; k++) {
	                System.out.print(mas[z][k] + " ");
	            }
	            System.out.println(); 
		

	}
}}
