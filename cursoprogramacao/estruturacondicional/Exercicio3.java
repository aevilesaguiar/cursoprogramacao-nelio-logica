package cursoprogramacao.estruturacondicional;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio3 {
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		
		Scanner sc = new Scanner(System.in);
		
		//delta não pode ser negativo
		//'a' não pode ser zero
		
		
		double a=sc.nextDouble();
		double b=sc.nextDouble();
		double c=sc.nextDouble();
		
		double delta = b*b-4.0*a*c;
		
		
		if(a==0 ||delta<0 ) {
			System.out.println("Impossível Calcular");
		}else {
			double raiz1 = (-b+Math.sqrt(delta))/(2.0*a);
			double raiz2 = (-b-Math.sqrt(delta))/(2.0*a);
			
			System.out.printf("R1 = %.5f%n",raiz1);
			System.out.printf("R2 = %.5f%n",raiz2);
		}
		
			
		sc.close();
		
	}

}
