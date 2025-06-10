package atividadeLOPAL;

import java.util.Scanner;

public class Vetor7_31Mar {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int[] numeros = new int[5];
		int[] multiplicado = new int[numeros.length];

		System.out.println("Digite os valores: ");
		for (int i = 0; i < numeros.length; i++) {
			numeros[i] = sc.nextInt();
		}

		System.out.print("Digite um número para multiplicar: ");
		int multi = sc.nextInt();

		System.out.print("Novo vetor: ");
		for (int j = 0; j < numeros.length; j++) {
			multiplicado[j] = numeros[j] * multi;
			System.out.print(multiplicado[j] + " ");

			sc.close();

		}

	}
}
