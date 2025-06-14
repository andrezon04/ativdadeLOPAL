package atividadeLOPAL;

import java.util.Scanner;

public class Vetor3_31Mar {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int[] numeros = new int[8];

		System.out.println("Digite oito numeros: ");
		for (int i = 0; i < 8; i++) {
			numeros[i] = sc.nextInt();
		}

		int maior = 0;
		int menor = 10;

		System.out.print("Vetor: ");
		for (int numero : numeros) {
			System.out.print(numero + " ");
			if (numero > maior) {
				maior = numero;
			}
			if (numero < menor) {
				menor = numero;
			}
		}

		System.out.println("\nO menor numero é: " + menor);
		System.out.println("O maior numero é: " + maior);

		sc.close();

	}

}
