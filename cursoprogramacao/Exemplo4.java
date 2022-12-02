package cursoprogramacao;

import java.util.Locale;
import java.util.Scanner;

public class Exemplo4 {
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);

		Scanner sc= new Scanner(System.in);//desse jeito eu associo o meu objeto Scnner ao teclado no modo console
		
		/*//ler uma palavra apartir do teclado
		System.out.println("Informe uma PALAVRA: ");
		String x=sc.nextLine();
		System.out.println(x);
		
		System.out.println("Informe um digito inteiro: ");
		int y=sc.nextInt();
		System.out.println(y);
		
		
		System.out.println("Informe um double");
		double b=sc.nextDouble();//ela pega a localidade do sistema, por isso vamos incluir o Locale para configurar a localidade
		System.out.println(b);
		
		System.out.println("Informe um CHAR");
		char e=sc.next().charAt(0);
		System.out.println(e);*/
		
		
		
		
		sc.close();//encerrar recurso
		
	}

}
