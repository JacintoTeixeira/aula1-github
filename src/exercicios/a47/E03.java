package exercicios.a47;

import java.util.Scanner;

public class E03 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		int totalCostumers = 0;
		int gasolineCostumers = 0;
		int dieselCostumers = 0;
		int alcoolCostumers = 0;
		int choice;
		do {
			System.out.println("Introduza o codigo do combitivel preferido:" + "\n 1 - Alcool." + "\n 2 - Gasonina."
					+ "\n 3 - Diesel." + "\n" + "\n 4 - Para finalizar pesquisa");
			choice = input.nextInt();
			while (choice <= 0 || choice > 4) {
				System.out.println("Introduza um codigo valido.");
				choice = input.nextInt();
				
			}
			if (choice != 4) {
				totalCostumers++;
			}

			switch (choice) {
			case 1:
				alcoolCostumers++;
				break;
			case 2:
				gasolineCostumers++;
				break;
			case 3:
				dieselCostumers++;
				break;

			}

		} while (choice != 4);

		System.out.println("Alcool: " + alcoolCostumers + "\nGasolina: " + gasolineCostumers + "\nDiesel: "
				+ dieselCostumers + "\nO numero de Clientes foi: " + totalCostumers);
		input.close();
	}

}
