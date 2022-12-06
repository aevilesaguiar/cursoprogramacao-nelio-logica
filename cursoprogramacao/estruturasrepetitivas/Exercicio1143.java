package cursoprogramacao.estruturasrepetitivas;

import java.util.Scanner;

public class Exercicio1143 {
public static void main(String[] args) {
	
	Scanner sc = new Scanner(System.in);
		
	int num=sc.nextInt();
	
	for (int i = 1; i <= num; i++) {
		
		int quadrado=i*i;
		int cubo=i*i*i;
		System.out.printf("%d%d%d%n",i,quadrado,cubo);
		
		
	}
	
	sc.close();
	
}
}
