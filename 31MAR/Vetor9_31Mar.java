package atividadeLOPAL;

import java.util.Scanner;

public class Vetor9_31Mar {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int[] numeros = new int[10];

		System.out.println("Digite os valores: ");
		for (int i = 0; i < numeros.length; i++) {
			numeros[i] = sc.nextInt();
		}

		System.out.print("\nNúmeros pares: ");
		for (int num : numeros) {
			if (num % 2 == 0) {
				System.out.print(num + " ");
			}
		}

		System.out.print("\nNúmeros impares: ");
		for (int num : numeros) {
			if (num % 2 != 0) {
				System.out.print(num + " ");
				
				sc.close();
			}

		}
	}
}
