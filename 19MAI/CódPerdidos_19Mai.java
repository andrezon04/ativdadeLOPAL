package andrep_lopal;

public class CódPerdidos_19Mai {

	public static void main(String[] args) {

		String[] codigos = { "4H", "7A", "2C" };

		String resultado = "";

		for (String codigo : codigos) {

			String numeroStr = "";
			char letra = ' ';

			for (int i = 0; i < codigo.length(); i++) {
				char c = codigo.charAt(i);
				if (Character.isDigit(c)) {
					numeroStr += c;
				} else {
					letra = c;
				}
			}

			int quantidade = Integer.parseInt(numeroStr);

			for (int i = 0; i < quantidade; i++) {
				resultado += letra;
			}
		}

		System.out.println("Código reconstruído: " + resultado);
	}

}
