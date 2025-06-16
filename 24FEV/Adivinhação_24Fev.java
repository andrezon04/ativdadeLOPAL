package andrep_lopal;

import java.util.Random;
import java.util.Scanner;

public class Adivinhação_24Fev {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		Random rm = new Random();

		int a, b;

		a = rm.nextInt(1, 10);
		System.out.print("Adivinhe o Número: ");

		b = sc.nextInt();
		if (a == b) {
			System.out.println("Acertou! ");

		} else {
			System.out.println("Errou, o número era: " + a);
		}
		sc.close();

	}

}
