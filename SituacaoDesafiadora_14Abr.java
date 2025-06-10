package atividadeLOPAL;

import java.util.Scanner;

public class SituacaoDesafiadora_14Abr {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		// Solicita os valores de salário, nº de dependentes, tipo de plano de saúde e se
		// utiliza VT, VA ou VR.
		System.out.print("Salário bruto: R$ ");
		double salarioBruto = sc.nextDouble();
		System.out.print("Número de dependentes: ");
		int dependentes = sc.nextInt();
		System.out.print("Tipo de plano de saúde (Nenhum, Básico, Avancado): ");
		String planoSaude = sc.next();
		System.out.print("Utiliza Vale Transporte?: ");
		boolean VT = sc.next().equalsIgnoreCase("s");
		System.out.print("Utiliza Vale Alimentação?: ");
		boolean VA = sc.next().equalsIgnoreCase("s");
		System.out.print("Utiliza Vale Refeição?: ");
		boolean VR = sc.next().equalsIgnoreCase("s");

		// Calcula os descontos do INSS, Imposto de Renda, VT, VR VA e do plano de
		// saúde.
		double descINSS = calcularINSS(salarioBruto);
		double baseIR = salarioBruto - descINSS - (dependentes * 189.59);
		double descIR = calcularIR(baseIR);
		double descVT = VT ? salarioBruto * 0.06 : 0.0;
		double descVA = VA ? 200.0 : 0.0;
		double descVR = VR ? 250.0 : 0.0;
		double descPlano = 0.0;

		// Armazena a variável do plano de saúde (básico ou avançado).
		switch (planoSaude.toLowerCase()) {
		case "basico":
			descPlano = 150.0;
			break;
		case "avancado":
			descPlano = 300.0;
			break;
		}
		sc.close();

		// Soma o total dos descontos calculados acima.
		double totDesc = descINSS + descIR + descVT + descVA + descVR + descPlano;
		// Calcula o salário líquido.
		double salLiq = salarioBruto - totDesc;
		// Calcula a porcentagem de desconto.
		double percDesc = (totDesc / salarioBruto) * 100;

		System.out.printf("Salário Líquido: R$ %.2f%n", salLiq);
		System.out.printf("Total de Descontos: R$ %.2f (%.2f%%)%n", totDesc, percDesc);
	}

	// Realiza os cálculos do desconto do INSS baseado no salário.
	private static double calcularINSS(double salario) {
		if (salario <= 1302.00)
			return salario * 0.08;
		else if (salario <= 2571.00)
			return salario * 0.09;
		else if (salario <= 3856.00)
			return salario * 0.11;
		else if (salario <= 7087.22)
			return salario * 0.14;
		else
			return 570.88;
	}

	// Realiza os cálculos do desconto do Imposto de Renda baseado no salário.
	private static double calcularIR(double base) {
		if (base <= 1903.98)
			return 0.0;
		else if (base <= 2826.65)
			return base * 0.075 - 142.80;
		else if (base <= 3751.05)
			return base * 0.15 - 354.80;
		else if (base <= 4664.68)
			return base * 0.225 - 636.13;
		else
			return base * 0.275 - 869.36;

	}
}
