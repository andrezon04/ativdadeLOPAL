package atividadeLOPAL;

import java.util.Scanner;

public class ProblemaQuadro_10Fev {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Largura do quadro: ");
		double larg = sc.nextDouble();
		System.out.print("Altura do quadro: ");
		double alt = sc.nextDouble();


		double area = larg * alt;
		double perimetro = 2 * (larg + alt);
		double diagonal = Math.sqrt(Math.pow(larg, 2) + Math.pow(alt, 2));

		System.out.printf("A área é equivalente a: %.4f%n", area);
		System.out.printf("O perímetro é equivalente a: %.4f%n", perimetro);
		System.out.printf("A diagonal é equivalente a: %.4f%n", diagonal);

		sc.close();

	}

}