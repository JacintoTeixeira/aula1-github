package exercicios.a34;

import java.util.Scanner;

public class E02 {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		
		System.out.println("Coloque um numero:");
		int number=input.nextInt();
		
		if (number%2==0) {
			System.out.println("Numero par");
		}else {
			System.out.println("Numero impar");
		}
		
		input.close();

	}

}
