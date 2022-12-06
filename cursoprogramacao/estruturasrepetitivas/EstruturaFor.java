package cursoprogramacao.estruturasrepetitivas;

import java.util.Scanner;

public class EstruturaFor {
	public static void main(String[] args) {
		
		Scanner sc =new Scanner(System.in);
		
		//quantas vezes queremos repetir
		int N=sc.nextInt();
		int soma=0;
		
		for (int i = 0; i < N; i++) {
			//ler um numero x e repete n vezes
			int x=sc.nextInt();
			soma=soma+x;
			
		}
		
		System.out.println(soma);
		
		
		sc.close();
		
	}

}
