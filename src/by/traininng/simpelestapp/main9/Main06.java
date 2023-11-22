package by.traininng.simpelestapp.main9;

import java.util.Random;

public class Main06 {

	public static void main(String[] args) {
		//  Дана матрица. Вывести на экран все нечетные столбцы, у которых первый элемент больше последнего
		int[][] mas = new int[7][8];
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
		 for (int z = 1; z < mas.length; z += 2) {
	            	if(mas[0][z]>mas[mas.length - 1][z]) {
	            		 for (int k = 0; k < mas.length; k++) {
	            		System.out.print(mas[k][z] + " ");
	            }
	            System.out.println(); 
	            
		
	}
	}

}}
