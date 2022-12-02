package cursoprogramacao;

import java.util.Locale;
import java.util.Scanner;

public class Exemplo6 {
	public static void main(String[] args) {

		Locale.setDefault(Locale.US);

		Scanner sc = new Scanner(System.in);// desse jeito eu associo o meu objeto Scnner ao teclado no modo console

		int x;
		String s1, s2, s3;
		x=sc.nextInt();
		sc.nextLine();
		s1 = sc.nextLine();
		s2 = sc.nextLine();//ler o texto até a quebra de linha
		s3 = sc.nextLine();

		System.out.println("Dados Digitados");
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);

		sc.close();// encerrar recurso
		
		//quebra de linha pendente
		

	}

}
