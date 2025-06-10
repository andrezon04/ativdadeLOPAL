package atividadeLOPAL;

import java.util.Scanner;

public class ProlemaAlturaMedia_10Fev {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("Diga o nome da Pessoa 1: ");
		String nome = sc.nextLine();
		System.out.print("Diga a altura da Pessoa 1: ");
		double altura = sc.nextDouble();
		sc.nextLine();

		System.out.print("Diga o nome da Pessoa 2: ");
		String nome2 = sc.nextLine();
		System.out.print("Diga a altura da Pessoa 2: ");
		double altura2 = sc.nextDouble();

		double alturamedia = ((altura + altura2) / 2);

		System.out.printf("A altura média entre %s e %s é: %.1f metros%n", nome, nome2, alturamedia);

		sc.close();
	}

}
