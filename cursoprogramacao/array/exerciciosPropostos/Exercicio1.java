package cursoprogramacao.array.exerciciosPropostos;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio1 {
public static void main(String[] args) {
	
	Locale.setDefault(Locale.US);
	Scanner sc = new Scanner(System.in);
	
	int quantidade=sc.nextInt();
	
	double[] numeros=new double[quantidade];
	
	//ENTRADA DE DADOS
	for (int i = 0; i < numeros.length; i++) {
		numeros[i]=sc.nextDouble();
	}
	
	double maiorNumero=numeros[0];
	int posicao=0;
	
	for (int i = 0; i < numeros.length; i++) {
		if(numeros[i]>maiorNumero) {
			maiorNumero=numeros[i];
			posicao=i;
			
		}
		
		
	}
	System.out.println("Numero maior: "+maiorNumero+" Posição: "+posicao);
	
	double menorNumero=numeros[0];
	int posicaoMenor=0;
	
	for (int i = 0; i < numeros.length; i++) {
		
		if(numeros[i]<menorNumero) {
			menorNumero=numeros[i];
			posicao=i;
			
		}
	}
	System.out.println("Numero menor: "+menorNumero+" Posição: "+posicaoMenor);
	
	
	sc.close();
}
}
