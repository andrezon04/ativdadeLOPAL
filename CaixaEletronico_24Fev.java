package andrep_lopal;

import java.util.Scanner;

public class CaixaEletronico_24Fev {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		double saq, deposito, dinheiro;
		int opcao;
		dinheiro = 0;
		System.out.println("Bem Vindo Ao Banco Brasileiro! ");

		do {
			System.out.println("[1] Ver saldo. ");
			System.out.println("[2] Depositar. ");
			System.out.println("[3] Sacar. ");
			System.out.println("[4] Sair. ");
			System.out.print("Escolha uma opção: ");

			opcao = sc.nextInt();

			if (opcao == 1) {
				System.out.println("O seu saldo é: " + dinheiro);
			} else if (opcao == 2) {
				System.out.print("Quanto quer depositar: ");
				deposito = sc.nextDouble();
				dinheiro += deposito;
			} else if (opcao == 3) {
				System.out.print("Quanto quer sacar: ");
				saq = sc.nextDouble();
				if (saq > dinheiro) {
					System.out.println("Você não tem dinheiro suficiente. ");
				} else {
					dinheiro -= saq;
				}
			}

		} while (opcao != 4);

		sc.close();
	}

}
