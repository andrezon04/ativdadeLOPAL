package atividadeLOPAL;

import java.util.Scanner;

public class Vetor4_31Mar {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int[] numeros = new int[15];
		int pares = 0;
		
		System.out.println("Digite oito numeros: ");
		for (int i = 0; i < numeros.length; i++) {
			numeros[i] = sc.nextInt();
		}


		System.out.print("Vetor: ");
		for (int numero : numeros) {
			System.out.print(numero + " ");
			if (numero % 2 == 0) {
				pares++;
			}
		}

		System.out.println("\nTotal de números pares: " + pares);
		
		sc.close();

	}

}
