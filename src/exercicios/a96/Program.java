package exercicios.a96;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter the number of lines/columns");
		int n = input.nextInt();
		
		int [][] numbers = new int [n][n];
		
		for (int i=0; i<n; i++) {
			for (int j=0; j<n; j++) {
				numbers [i][j]=input.nextInt();
				}
			}
		
		
		System.out.println("Main diagonal:");
		for (int i=0; i<n; i++) {
			System.out.println(numbers[i][i]);
			
		}
		
		int count=0;
		System.out.println("Negative numbers");
		for (int i=0; i<n; i++) {
			for (int j=0; j<n; j++) {
				if (numbers [i][j] <0) {
					System.out.println(numbers[i][j]);
					count++;
				}
			}
		}
		
		System.out.println("This Array have "+count+ " negative numbers");
		
		input.close();
		

	}

}
