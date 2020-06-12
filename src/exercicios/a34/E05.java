package exercicios.a34;

import java.util.Scanner;

public class E05 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int product;
		int quantity;
		double price;
		
		System.out.println("Insira o cogigo do seu produto"
				+ "\n1 - Cachorro Quente - 4.00€"
				+ "\n2 - X-Salada - 4.50€"
				+ "\n3 - X-Bacon - 5.00€"
				+ "\n4 - Torrada Simples - 2.00€"
				+ "\n5 - Refrigerante - 1.50€");
		product=input.nextInt();
		System.out.println("Insira a quantidade");
		quantity=input.nextInt();
		
		if(product==1) {
			price = 4.00*quantity;
		}else if (product==2) {
			price = 4.50*quantity;
		}else if (product==3) {
			price = 5.00*quantity;
		}else if (product==4) {
			price = 2.00*quantity;
		}else {
			price = 1.50*quantity;
		}
		
		System.out.println("O total é "+price+" €.");
		input.close();
	}

}
