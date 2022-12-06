package cursoprogramacao.array.exerciciosPropostos;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio5 {
public static void main(String[] args) {
	
	Locale.setDefault(Locale.US);
	Scanner sc = new Scanner(System.in);

	int quantidade = sc.nextInt();
	
	int[] numeros=new int[quantidade];
	
	int countPares=0;
	int somaPares=0;
	
	for (int i = 0; i < numeros.length; i++) {
		numeros[i]=sc.nextInt();
		
		if(numeros[i]%2==0) {
			somaPares=somaPares+numeros[i];
			countPares=countPares+1;
		}
	}
	
	double media= somaPares/countPares;
	System.out.println("Media Aritmética Pares: "+media);
	
	sc.close();
}
}
