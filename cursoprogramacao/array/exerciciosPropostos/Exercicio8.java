package cursoprogramacao.array.exerciciosPropostos;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio8 {
public static void main(String[] args) {
	
	Locale.setDefault(Locale.US);
	Scanner sc = new Scanner(System.in);

	int quantidade=sc.nextInt();
	double[]alturas= new double[quantidade];
	char[] sexo=new char[quantidade];
	
	
	//input
	for (int i = 0; i < quantidade; i++) {
		alturas[i]=sc.nextDouble();
		sexo[i]=sc.next().charAt(0);
	}
	
	double maiorAltura=alturas[0];
	double menorAltura=alturas[0];
	
	for (int i = 0; i < quantidade; i++) {
		
		if(alturas[i]>maiorAltura) {
			maiorAltura=alturas[i];
		}	
	}
	
	for (int i = 0; i < quantidade; i++) {
		if(alturas[i]<menorAltura) {
			menorAltura=alturas[i];
		}
	}
	
	System.out.println("Menor altura =  "+menorAltura);
	System.out.println("Maior altura =  "+maiorAltura);

	double somaAlturasMulheres=0.0;
	
	int count=0;
	
	for (int i = 0; i < quantidade; i++) {
		
		if(sexo[i]=='F') {
			somaAlturasMulheres= somaAlturasMulheres+alturas[i];
			count=count+1;
		}	
	}
	System.out.printf("Media das alturas das mulheres = %.2f%n",somaAlturasMulheres/count);
	
	int countHomem=0;
	
	for (int i = 0; i < quantidade; i++) {
		if(sexo[i]=='M') {
			countHomem=countHomem+1;
		}
	}
	
	System.out.println("Numero de homens ="+countHomem);
	sc.close();
}
}
