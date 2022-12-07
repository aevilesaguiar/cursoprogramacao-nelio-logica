package cursoprogramacao.array.exerciciosPropostos;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio7 {
public static void main(String[] args) {
	
	Locale.setDefault(Locale.US);
	Scanner sc = new Scanner(System.in);

	int quantidade=sc.nextInt();
	
	String []nomes = new String[quantidade];
	double []notas1Semestre = new double[quantidade];
	double []notas2Semestre = new double[quantidade];
	
	
	//input nomes/notas
	
	for (int i = 0; i < quantidade; i++) {
		nomes[i]=sc.next();
		notas1Semestre[i]=sc.nextDouble();
		notas2Semestre[i]=sc.nextDouble();
	}
	
	//media
	
	  
	for (int i = 0; i < quantidade; i++) {
		
		double media=(notas1Semestre[i]+notas2Semestre[i])/2.0;
		
		if(media>=6.0) {
			System.out.println(nomes[i]);
		}
	}
	
	
	
	
	
	sc.close();
}
}
