package by.traininng.simpelestapp.main9;

import java.util.Random;

public class Main08 {

	public static void main(String[] args) {
		// Дан двухмерный массив n×m элементов. Определить, сколько раз встречается число 7 среди элементов массива.
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
		int t=0;
		Random rand = new Random();
		for (int i = 0; i < ar.length; i++) {
			for (int j = 0; j <ar[i].length; j++) {
				ar[i][j] = rand.nextInt(10);
		if(ar[i][j]==7) {
			t++;
		}
		
			
		}
	}
		System.out.println("число 7 встречается "+t+" раз");
}}
	