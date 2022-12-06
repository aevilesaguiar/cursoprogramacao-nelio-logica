package cursoprogramacao.array;

import java.util.Locale;
import java.util.Scanner;

public class Vetores2 {
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int quant=sc.nextInt();
		
		int[] vetor=new int[quant];
		
		//leitura vetor
		for (int i = 0; i < quant; i++) {

			vetor[i]=sc.nextInt();

		}
		
		//impressão elementos
		for (int i = 0; i < quant; i++) {
			System.out.print(vetor[i]+" ");
		}

		System.out.println();
		
		double soma=0.0;

		//soma de todos os elementos do vetor
		for (int i = 0; i < quant; i++) {
			soma=soma+vetor[i];
		}
		System.out.printf("SOMA:%.2f%n",soma);
		
		double media = soma/quant;
		System.out.printf("MEDIA: %.2f%n ",media);
		
		sc.close();
	}

}
