package cursoprogramacao.estruturasrepetitivas;

import java.util.Locale;
import java.util.Scanner;

public class DoWhile {
	
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Digite a temperatura em Celsius: ");
		double temp =sc.nextDouble();
		
		double fare=((9*temp)/5)+32;
		System.out.println(fare);
		
		System.out.println("Deseja repetir (s/n)?");
		char resp = sc.next().charAt(0);
		
	do {
			System.out.print("Digite a temperatura em Celsius: ");
			temp =sc.nextDouble();
			fare=((9*temp)/5)+32;
			System.out.println(fare);
			System.out.println("Deseja repetir (s/n)?");
			resp = sc.next().charAt(0);
			
		}while (resp !='n') ;
	
		System.out.println(fare);
		
		
		
		sc.close();
	}

}
