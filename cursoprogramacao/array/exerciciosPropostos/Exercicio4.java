package cursoprogramacao.array.exerciciosPropostos;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio4 {
public static void main(String[] args) {
	
	Locale.setDefault(Locale.US);
	Scanner sc = new Scanner(System.in);

	int quantidade=sc.nextInt();
	
	double[] numeros=new double[quantidade];
	
	for (int i = 0; i < numeros.length; i++) {
		numeros[i]=sc.nextDouble();
	}
	
	double soma = 0.0;
	
	for (int i = 0; i < numeros.length; i++) {
		soma=soma+numeros[i];
	}
	
	double media=soma/quantidade;
	
	System.out.println("Média: "+media);
	
	
	
	
	for (int i = 0; i < numeros.length; i++) {
		
		if(numeros[i]<media) {
			System.out.println(numeros[i]);
		}
		
	}
	
	
	
	
	
	
	
	sc.close();
}
}
