package atividadeLOPAL;

import java.util.Scanner;

public class Vetor10_31Mar {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		double[] notas = new double[6];
		double media;
		double soma = 0;

		System.out.println("Digite as notas: ");
		for (int i = 0; i < notas.length; i++) {
			notas[i] = sc.nextDouble();
		}

		System.out.print("Notas: ");
		for (double nota : notas) {
			System.out.print(String.format("%.1f", nota) + " ");
		}

		System.out.print("\nMédia: ");
		for (double nota : notas) {
			soma += nota;
		}
		media = soma / notas.length;
		System.out.printf("%.1f", media);

		System.out.print("\nResultado: ");
		if (media >= 7) {
			System.out.print("Aprovado");
		} else {
			System.out.println("Reprovado");
			
			sc.close();

		}

	}
}
