package andrep_lopal;

import java.util.Scanner;

public class CofrinhoInteligente_19Mai {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		double[] moedas = { 0.01, 0.05, 0.10, 0.25, 0.50, 1 };
		double total = 0;

		for (int i = 0; i < moedas.length; i++) {

			System.out.print("Digite a quantidades de moedas de R$ " + moedas[i] + " você deseja depositar: ");
			double quant = sc.nextDouble();

			total += quant * moedas[i];

			System.out.printf("Total: R$ %.2f ", total);
			System.out.println();

		}

		double conta = 100 - total;
		if (total >= 100) {
			System.out.println("Você já atingiu R$ 100! ");

		} else {
			System.out.println("Faltam R$ " + conta + " para atingir os R$ 100,00. ");

		}

		sc.close();

	}

}
