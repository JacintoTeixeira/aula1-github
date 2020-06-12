package exercicios.a34;

import java.util.Scanner;

public class E01 {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		
		System.out.println("Escolha um numero positivo ou negativo");
		int number=input.nextInt();
		
		if (number < 0) {
			System.out.println("O numero é negativo");
		} else if(number == 0) {
			System.out.println("O numero é zero");
		} else {
			System.out.println("O numero é positivo");
		}
		
		input.close();
	}

}
