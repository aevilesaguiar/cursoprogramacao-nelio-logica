package cursoprogramacao.array.exerciciosPropostos;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio6 {
public static void main(String[] args) {
	
	Locale.setDefault(Locale.US);
	Scanner sc = new Scanner(System.in);

	int quantidade=sc.nextInt();
	
	String[] nomes=new String[quantidade];
	int[]idade=new int[quantidade];
	

	for (int i = 0; i < idade.length; i++) {
		nomes[i]=sc.nextLine();
		idade[i]=sc.nextInt();
	}
	
	int maiorIdade=idade[0];
	int posicaoMaiorIdade=0;
	
	
	for (int i = 0; i < idade.length; i++) {
		if(idade[i]>maiorIdade) {
			maiorIdade=idade[i];
			posicaoMaiorIdade=i;
			
		}
	}
	
	
	
	
	
	
	sc.close();
}
}
