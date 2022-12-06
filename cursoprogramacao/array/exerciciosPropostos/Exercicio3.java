package cursoprogramacao.array.exerciciosPropostos;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio3 {
public static void main(String[] args) {
	
	Locale.setDefault(Locale.US);
	Scanner sc = new Scanner(System.in);
	System.out.println("Quantidade de elementos: ");
	int quantidade=sc.nextInt();
	
	int[] vetorA=new int[quantidade];
	int[] vetorB=new int[quantidade];
	
	
	System.out.println("Elementos vetor A: ");
	for (int i = 0; i < quantidade; i++) {
		vetorA[i]=sc.nextInt();
	}
	System.out.println("Elementos vetor B: ");	
	for (int i = 0; i < quantidade; i++) {
		vetorB[i]=sc.nextInt();

	}
	//vetor C
	int[] vetorC=new int[quantidade];

	for (int i = 0; i < quantidade; i++) {
		
		vetorC[i]=vetorA[i]+vetorB[i];
	}
	
	for (int i = 0; i < vetorC.length; i++) {
		System.out.print(vetorC[i] +" ");
	}
	
	
	sc.close();
}
}
