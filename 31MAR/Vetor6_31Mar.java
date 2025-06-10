package atividadeLOPAL;

import java.util.Scanner;

public class Vetor6_31Mar {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int[] numeros = new int[6];

		System.out.print("Digite os números: ");
		for (int i = 0; i < numeros.length; i++) {
			numeros[i] = sc.nextInt();
		}
		
		System.out.println("Valor normal: "+ numeros[0]+ numeros[1]+ numeros[2]+ numeros[3]+ numeros[4]+ numeros[5]);
		System.out.printf("\nVetor invertido: "+ numeros[5]+ numeros[4]+ numeros[3]+ numeros[2]+ numeros[1]+ numeros[0]);

		sc.close();
	}
}
