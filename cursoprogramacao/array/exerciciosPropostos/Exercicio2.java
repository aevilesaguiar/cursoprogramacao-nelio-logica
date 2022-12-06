package cursoprogramacao.array.exerciciosPropostos;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio2 {
public static void main(String[] args) {
	
	Locale.setDefault(Locale.US);
	Scanner sc = new Scanner(System.in);
	
	int quantidade=sc.nextInt();
	
	int[]numeros=new int[quantidade];
	
	for (int i = 0; i < numeros.length; i++) {
		
		numeros[i]=sc.nextInt();
	}
	

	int count=0;
	for (int i = 0; i < numeros.length; i++) {
		if(numeros[i]%2==0) {
			 System.out.print(numeros[i]+" ");
			 count=count+1;
		}
	}
	
	System.out.println();
	System.out.println("Quantidade de pares:"+count);
	
	
	sc.close();
}
}
