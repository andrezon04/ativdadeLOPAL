package atividadeLOPAL;

import java.util.Scanner;

public class Vetor8_31Mar {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] vetorA = new int[5];
		int[] vetorB = new int[5];

		System.out.println("Digite os valores do vetor 'A': ");
		for (int i = 0; i < vetorA.length; i++) {
			vetorA[i] = sc.nextInt();
		}

		System.out.println("Digite os valores do vetor 'B': ");
		for (int j = 0; j < vetorB.length; j++) {
			vetorB[j] = sc.nextInt();

		}

		System.out.println("\nNúmeros iguais nas mesmas posições: ");
		for (int i = 0; i < vetorA.length; i++) {
			if (vetorA[i] == vetorB[i]) {
				System.out.println("Posição " + i + ": " + vetorA[i]);
				
				sc.close();

			}

		}
	}
}