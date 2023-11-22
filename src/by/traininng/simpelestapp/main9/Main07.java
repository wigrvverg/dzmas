package by.traininng.simpelestapp.main9;

import java.util.Random;

public class Main07 {

	public static void main(String[] args) {
		// дан двухмерный массив 5×5. Найти сумму модулей отрицательных нечетных
		// элементов.
		int[][] mas = new int[5][5];
		init(mas);
		
		for (int i = 0; i < mas.length; i++) {
			for (int j = 0; j < mas[i].length; j++) {
				System.out.printf("[%4d]", mas[i][j]);

			}
			System.out.println();
		}
		

	}
	public static void init(int[][]ar) {
		int sum=0;
		Random rand = new Random();
		for (int i = 0; i < ar.length; i++) {
			for (int j = 0; j <ar[i].length; j++) {
				ar[i][j] = rand.nextInt(-100, 100);
		if(ar[i][j]<0) {
			sum=sum-ar[i][j];
		}
		
			
		}
	}
		System.out.println("сумма модулей отрицательных значений равна "+sum);
}}
