package cursoprogramacao.estruturacondicional;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio1 {
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		
		Scanner sc = new Scanner(System.in);
		
		double nota1 = sc.nextDouble();
		double nota2 = sc.nextDouble();
		
		double nfinal =(nota1+nota2);
		
		
		
		if(nfinal<60) {
			
			System.out.printf("NOTA FINAL = %.2f%n",nfinal);
			System.out.println("REPROVADO");
			
		}else {
			System.out.printf("NOTA FINAL = %.2f",nfinal);
		}
		

		
		sc.close();
		
	}

}
