package andrep_lopal;

import java.util.Scanner;

public class Mascote_19Mai {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		String mascote1 = "Gato";
		String mascote2 = "Capivara";
		String mascote3 = "Chinchila";

		int votos1 = 0;
		int votos2 = 0;
		int votos3 = 0;

		System.out.println("Votação para o Mascote da Turma");
		System.out.println("\nDigite o mascote preferido para votar ou 'fim' para encerrar: ");
		System.out.println("Opções: " + mascote1 + ", " + mascote2 + ", " + mascote3);

		while (true) {
			System.out.print("\nSeu voto (ou 'fim' para encerrar): ");
			String voto = sc.nextLine();

			if (voto.equalsIgnoreCase("fim")) {
				break;
			} else if (voto.equalsIgnoreCase(mascote1)) {
				votos1++;
			} else if (voto.equalsIgnoreCase(mascote2)) {
				votos2++;
			} else if (voto.equalsIgnoreCase(mascote3)) {
				votos3++;
			} else {
				System.out.println("Mascote inválido. Tente novamente. ");
			}
		}
		int total = votos1 + votos2 + votos3;

		System.out.println("Resultado da Votação: ");
		if (total == 0) {
			System.out.println("\nNenhum voto foi registrado.");
		} else {
			System.out.println("\n" + mascote1 + ": " + votos1 + " Voto(s) - (" + (votos1 * 100 / total) + "%)");
			System.out.println(mascote2 + ": " + votos2 + " Voto(s) - (" + (votos2 * 100 / total) + "%)");
			System.out.println(mascote3 + ": " + votos3 + " Votos(s) - (" + (votos3 * 100 / total) + "%)");
		}
		sc.close();
	}

}
