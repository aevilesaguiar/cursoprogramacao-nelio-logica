package cursoprogramacao;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio2 {
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Informe a largura e Comprimento");
		
		double largura=sc.nextDouble();
		sc.nextLine();
		double comprimento=sc.nextDouble();
		sc.nextLine();
		double valorPorMetroQuadrado=sc.nextDouble();
		sc.nextLine();		
		
		
		double area= largura*comprimento;
		
		double valorTerreno=valorPorMetroQuadrado*area;
		
		
		System.out.printf("AREA= %.2f%n",area);
		System.out.printf("PREÇO= %.2f",valorTerreno);
		
		
		
		sc.close();
		
	}

}
