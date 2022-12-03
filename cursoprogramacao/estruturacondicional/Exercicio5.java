package cursoprogramacao.estruturacondicional;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio5 {
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		
		Scanner sc = new Scanner(System.in);
		
		int dia = sc.nextInt();

		switch (dia) {
		case 1:
			System.out.println("Dia da Semana: Domingo");
			break;

		case 2:
			System.out.println("Dia da Semana: Segunda");
			break;

		case 3:
			System.out.println("Dia da Semana: Terça");
			break;

		case 4:
			System.out.println("Dia da Semana: Quarta");
			break;

		case 5:
			System.out.println("Dia da Semana: Quinta");
			break;

		case 6:
			System.out.println("Dia da Semana: Sexta");
			break;

		default:
			System.out.println("Dia da Semana: Inválido");
			break;
		}
		sc.close();

	}

}
