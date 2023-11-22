package by.traininng.simpelestapp.main9;

import java.util.Random;

public class Main01 {

	public static void main(String[] args) {
		//Cоздать матрицу 3 x 4, заполнить ее числами 0 и 1 так, чтобы в одной строке была ровно одна единица, и вывести на экран.

		int[][] mas=new int[3][4];
		Random rand = new Random();
		for (int i = 0; i < mas.length; i++) {
			for (int j = 0; j < mas[i].length; j++) {
				mas[i][j] = rand.nextInt(1);
				if(mas[i][0]==0) {
					mas[i][0]=1;
			}
				
				}
			
	}
		for (int i = 0; i < mas.length; i++) {
			for (int j = 0; j < mas[i].length; j++) {
				System.out.printf("[%4d]", mas[i][j]);
			}
			System.out.println();
			
				
			}
			
		}
		
		
}
