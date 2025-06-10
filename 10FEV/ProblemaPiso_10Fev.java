package atividadeLOPAL;

import java.util.Scanner;

public class ProblemaPiso_10Fev {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("Diga a largura do cômodo: ");
		double larg = sc.nextDouble();
		System.out.print("Diga o comprimento do cômodo: ");
		double comp = sc.nextDouble();
		System.out.print("Diga o valor do metro quadrado do piso: ");
		double valor = sc.nextDouble();

		double area = larg * comp;
		double custo = area * valor;

		System.out.printf("Área total do cômodo: %.2f m²%n", area);
		System.out.printf("Custo total para cobrir o piso: R$ %.2f%n", custo);

		sc.close();
	}
}
