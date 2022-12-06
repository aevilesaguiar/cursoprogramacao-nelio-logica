package cursoprogramacao.array;

import java.util.Scanner;

public class Vetores1 {
	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		
		int quant=sc.nextInt();
		int[] vetor=new int[quant];
		
		for (int i = 0; i < quant; i++) {

			vetor[i]=sc.nextInt();
		}
		
		for (int i = 0; i < quant; i++) {
			if(vetor[i]<0) {
				System.out.println(vetor[i]);
			}
		}

		
		sc.close();
	}

}
