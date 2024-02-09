package atividadeLoops;

import java.util.Scanner;

public class exercicioDoWhile {
	public static void main(String[] args) {

		int numero , resultado = 0;
		Scanner leia = new Scanner(System.in);

		do {
			System.out.println("Digite um número:");
			numero = leia.nextInt();

			if (numero > 0) {
				resultado = numero + resultado;
			}
		} while (numero != 0);
		System.out.println("A soma dos positivos é:" + resultado);

	}
}
