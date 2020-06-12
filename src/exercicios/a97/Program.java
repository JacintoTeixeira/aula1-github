package exercicios.a97;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		
		Scanner input=new Scanner(System.in);
		
		
		System.out.println("Enter number of columnes: ");
		int x=input.nextInt();
		System.out.println("Enter number of lines: ");
		int y=input.nextInt();
		
		int [][] numbers = new int [x][y];
		
		for (int i=0; i<numbers.length; i++) {
			int s=1;
			for (int j=0; j<numbers[i].length; j++) {
				System.out.println("Enter the number " + s +" of line "+ (i+1) +" :");
				numbers[i][j]=input.nextInt();
				s++;
				}
		}
		
		System.out.println("Enter the number you want to find :");
		int n=input.nextInt();
		
		for (int i=0; i<numbers.length; i++) {
			for (int j=0; j<numbers[i].length; j++) {
				if (numbers[i][j]==n) {
					System.out.println("Position is "+i+", "+j);
					if (i>0) {
						System.out.println("Up: " + numbers[i-1][j]);
					}
					if (i<numbers[i].length) {
						System.out.println("Down: " + numbers[i+1][j]);
					}
					if (j>0) {
						System.out.println("Left: " + numbers[i][j-1]);
					}
					if (j<numbers.length) {
						System.out.println("Rigth: "+ numbers[i][j+1]);
					}
				}
			}
		}
		
		input.close();
		
	}

}
