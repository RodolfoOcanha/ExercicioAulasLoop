package atividadeLoops;

import java.util.Scanner;

public class exercicioFor {

	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);
		int contadorPar = 0;
		int contadorImpar = 0;

		for (int i = 0; i <= 9; i++) {
			System.out.println("Digite o " + (i + 1) + "°" + " número: ");
			int n1 = leia.nextInt();

			if (n1 % 2 == 0) {
				contadorPar++;
			} else {
				contadorImpar++;

			}
		}
		System.out.println("Total números Pares: " + contadorPar);
		System.out.println("Total números Ímpares: " + contadorImpar);

	}
}