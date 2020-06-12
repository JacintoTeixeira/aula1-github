package exercicios.a89;

import java.util.Scanner;

public class Aplication {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		Rent[] rents = new Rent[10];
		
		
		System.out.println("Welcome to Rummos Hotel");
		System.out.println("How many rooms will be rented?");
		int n = input.nextInt();
		
		for (int i=1; i<=n; i++) {
			System.out.println("");
			System.out.println("Rent #" + i);
			System.out.println("Name: ");
			input.nextLine();
			String name=input.nextLine();
			System.out.println("Email: ");
			String email=input.nextLine();
			System.out.println("Room #: ");
			int room=input.nextInt();
			
			rents[room]= new Rent(name, email);
			
		}
		System.out.println("Busy Rooms :");
		for (int i=0; i<10; i++){
			if (rents[i] != null) {
				System.out.println(" - Room " + i + " " + rents[i].toString());
			}
		}
		
		
		input.close();
	}

}
