package atividadeLoops;

import java.util.Scanner;

public class exercicioWhile {

	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);
		int idade = 0 , maiorDe21 = 0 , maiorDe50  = 0;

		while (idade >= 0) {
			System.out.println("Digite uma idade:");
			idade = leia.nextInt();

			if (idade > 50) {
				maiorDe50++;
			} else if (idade < 21 && idade > 0) {
				maiorDe21++;
			}

		}
		System.out.println("Total de pessoas maiores de 21 anos:" + maiorDe21 + "\nTotal de pessoas maiores de 50 anos:"
				+ maiorDe50);
	}
}
	