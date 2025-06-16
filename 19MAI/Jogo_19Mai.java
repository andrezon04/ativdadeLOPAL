package andrep_lopal;

import java.util.Random;
import java.util.Scanner;

public class Jogo_19Mai {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Random rd = new Random();

		String[] opc = { "Pedra", "Papel", "Tesoura", "Lagarto", "Spock" };

		System.out.println("Bem-Vindo ao jogo Pedra, Papel, Tesoura e Spock! ");
		System.out.println("Escolha sua jogada: ");

		for (int i = 0; i < opc.length; i++) {

			System.out.printf("[" + i + "] - ");
			System.out.println(opc[i]);

		}
		int pc = rd.nextInt(opc.length);
		int jogador = sc.nextInt();

		if (jogador < 0 || jogador > opc.length) {
			System.out.println("Valor inválido, tente novamente.");
		} else if (jogador == pc) {
			System.out.println("Empate!");
		} else if ((jogador == 0 && (pc == 1 || pc == 3)) || (jogador == 1 && (pc == 0 || pc == 4))
				|| (jogador == 2 && (pc == 1 || pc == 3)) || (jogador == 3 && (pc == 4 || pc == 1))
				|| (jogador == 4 && (pc == 2 || pc == 0))) {
			System.out
					.println("Você escolheu " + opc[jogador] + " e a máquina " + opc[pc] + ". Parabéns, você venceu! ");
		} else {
			System.out.println("Você escolheu " + opc[jogador] + " e a máquina " + opc[pc] + ". A máquina venceu! ");
		}
		sc.close();
	}
}