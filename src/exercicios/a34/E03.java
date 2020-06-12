package exercicios.a34;

import java.util.Scanner;

public class E03 {

	public static void main(String[] args) {

		Scanner input =new Scanner(System.in);
		
		System.out.println("Indique o primeiro numero");
		int number1=input.nextInt();
		System.out.println("Indique o segundo numero");
		int number2=input.nextInt();
		
		if(number1%number2==0 || number2%number1==0) {
			System.out.println("Os numeros sao multiplos");
		} else {
			System.out.println("Os numeros nao sao multiplos");
		}
		
		input.close();

	}

}
