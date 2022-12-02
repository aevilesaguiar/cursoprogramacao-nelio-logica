package cursoprogramacao.programasjudge;


import java.util.Locale;
import java.util.Scanner;

public class Exercicio1017 {
	public static void main(String[] args) {
		

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int cod1,npec1,cod2,npec2;
		 double preco1, preco2, total;
		
		cod1=sc.nextInt();
		npec1=sc.nextInt();
		preco1=sc.nextDouble();
		
		cod2=sc.nextInt();
		npec2=sc.nextInt();
		preco2=sc.nextDouble();
		
		total=npec1*preco1+npec2*preco2;
		
		System.out.printf("VALOR A PAGAR: R$ %.2f",total);
		
		
		
		sc.close();
		
		
	}

}
