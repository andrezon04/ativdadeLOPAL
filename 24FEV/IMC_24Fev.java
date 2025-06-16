package andrep_lopal;

import java.util.Scanner;

public class IMC_24Fev {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		double peso, altura, imc;

		System.out.print("Digite o peso: ");
		peso = sc.nextDouble();

		System.out.print("Digite a altura: ");
		altura = sc.nextDouble();

		imc = peso / (altura * altura);

		if (imc > 25) {
			System.out.println("Está sobrepeso. ");

		} else if (imc > 18.5) {
			System.out.println("Peso ideal.");
		} else if (imc <= 18.5) {
			System.out.println("Peso abaixo do ideal. ");
		}
		sc.close();

	}

}
