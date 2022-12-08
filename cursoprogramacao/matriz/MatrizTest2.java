package cursoprogramacao.matriz;

import java.util.Scanner;

public class MatrizTest2 {

	public static void main(String[] args) {

		Scanner sc= new Scanner(System.in);
		
		int quantidade=sc.nextInt();
		
		int[][] matriz=new int[quantidade][quantidade];
		
		for (int i = 0; i <quantidade; i++) {
			
			for (int j = 0; j <quantidade; j++) {
				
				matriz[i][j]=sc.nextInt();
			}
			System.out.println();
		}
		
		for (int i = 0; i < quantidade; i++) {
			for (int j = 0; j < matriz.length; j++) {
				System.out.print(matriz[i][j]+" ");
			}
			System.out.println();
			
		}
		
		System.out.println("Diagonal Prinicpal: ");
		
		
		for (int i = 0; i < quantidade; i++) {
		
				
				System.out.printf(matriz[i][i]+" ");
			}
			System.out.println();


			int count=0;
			
			
			for (int i = 0; i < quantidade; i++) {
				for (int j = 0; j < quantidade; j++) {
					if(matriz[i][j]<0) {
						
						count=count+1;
					}
				}
				
			}
			
			System.out.println("Quantidade de negativos = "+count);
		
		sc.close();

	}

}
