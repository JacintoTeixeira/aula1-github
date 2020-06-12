package exercicios.a34;

import java.util.Scanner;

public class E04 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Indique a hora de inicio");
		int startHour= input.nextInt();
		System.out.println("indique a hora de fim");
		int endHour= input.nextInt();
		int gameTime;
		
		if (startHour>=endHour) {
			gameTime = 24-startHour+endHour;
		} else {
			gameTime = endHour-startHour;
		}
		
		System.out.println("O jogo durou "+ gameTime+" horas.");
		
		input.close();

	}

}
