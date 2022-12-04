package cursoprogramacao.estruturasrepetitivas;

import java.util.Scanner;

public class Exercicio1134 {
public static void main(String[] args) {
	
	Scanner sc = new Scanner(System.in);
	
	int idade=sc.nextInt();
	int soma=0;
	int count=0;
	double media=0.0;
	
	while(idade>=0) {
		
		soma=soma+idade;
		count+=1;
		idade=sc.nextInt();
		
	}
	
	media=(double)soma/count;
	System.out.printf("%.2f%n",media);
	
	sc.close();
	
}
}
