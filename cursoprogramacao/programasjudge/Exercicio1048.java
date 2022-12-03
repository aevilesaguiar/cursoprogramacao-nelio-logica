package cursoprogramacao.programasjudge;



import java.util.Locale;
import java.util.Scanner;

public class Exercicio1048 {
	public static void main(String[] args) {
		

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		double salario=sc.nextDouble();
		double preajuste=0.00;
		double nsal=0.00;
		double percentual=0.0;
		
		if(salario<=400.00) {
			percentual=15;
		}else if(salario<=800.00) {
			percentual=12;
			
		}else if(salario<=1200.00) {
			percentual=10;
			
		}else if(salario<=2000.00) {
			percentual=7;
			
		}else {
			percentual=4;
		
		}
		preajuste=percentual/100*salario;
			nsal=preajuste+salario;
		System.out.printf("Novo salario: %.2f%n",nsal);
		System.out.printf("Reajuste ganho: %.2f%n",preajuste);
		System.out.printf("Em percentual: %.0f %%%n",percentual);
		
		
		
		sc.close();
		

	}

}
