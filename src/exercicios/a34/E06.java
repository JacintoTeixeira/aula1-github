package exercicios.a34;

import java.util.Scanner;

public class E06 {

	public static void main(String[] args) {

		Scanner input =new Scanner(System.in);
		
		System.out.println("Insira um valor inteiro ou decimal: ");
		double number=input.nextDouble();
		
		if (number>=0 && number<=25) {
			System.out.println("O valor está no intervalo entre 0 e 25");
		}else if (number>25 && number<=50) {
			System.out.println("O valor está no intervalo entre25 e 50");
		}else if (number>50 && number<=75) {
			System.out.println("O valor está no intervalo entre 25 e 75");
		}else if (number>75 && number<=100) {
			System.out.println("O valor está no intervalo entre 75 e 100");
		}else {
			System.out.println("O valor está fora de intervalo");
		}
		
		input.close();
	}

}
