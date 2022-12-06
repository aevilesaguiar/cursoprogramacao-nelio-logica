package cursoprogramacao.array;

import java.util.Locale;
import java.util.Scanner;

public class Vetores3 {
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int quant=sc.nextInt();
		String[] nome = new String[quant];
		int[] idade=new int[quant];
		double [] altura=new double[quant];
		
		for (int i = 0; i < quant; i++) {
			nome[i]=sc.next();
			idade[i]=sc.nextInt();
			altura[i]=sc.nextDouble();
			
		}
		
		for (int i = 0; i < quant; i++) {
			System.out.print("["+nome[i]+" "+idade[i]+" "+altura[i]+"]");
		}
		System.out.println();
		
		double soma=0.0;
		
		for (int i = 0; i < quant; i++) {
			soma=soma+altura[i];
		}
		
		double media=soma/quant;
		
		System.out.printf("Altura média: %.2f%n",media);
		
		//pessoas com altura abaixo de 1.67
		
		int cont=0;
		
		for (int i = 0; i < quant; i++) {
			if(idade[i]<16) {
				cont=cont+1;
				//cont++
				
			}
			
		}
		//regra de tres
		double perc=cont*(100/quant);
		
		System.out.printf("Pessoas com menos de 16 anos: %.1f%%%n",perc);
		
		
		sc.close();
	}

}
