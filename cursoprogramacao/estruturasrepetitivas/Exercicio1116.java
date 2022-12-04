package cursoprogramacao.estruturasrepetitivas;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio1116 {
public static void main(String[] args) {
	Locale.setDefault(Locale.US);
	Scanner sc = new Scanner(System.in);

	double nota1 = sc.nextDouble();
	
	
	while(nota1<0.00 || nota1>10.00) {
		System.out.println("Nota Invalida");
		nota1=sc.nextDouble();
	}
	
	double nota2=sc.nextDouble();
	while(nota2<0.00 || nota2>10.00) {
		System.out.println("Nota Invalida");
		nota2=sc.nextDouble();
	}
	
	
	double media=(nota1+nota2)/2;
	
	System.out.println("media = "+media);
	
	
	sc.close();
	
}
}
