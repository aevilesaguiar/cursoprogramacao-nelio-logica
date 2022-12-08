package cursoprogramacao.matriz;

import java.util.Scanner;

public class MatrizTest1 {

	public static void main(String[] args) {

		Scanner sc= new Scanner(System.in);
		
		int linhasM=sc.nextInt();
		int colunasN=sc.nextInt();
		
		int[][] matriz=new int[linhasM][colunasN];
		
		for (int i = 0; i < linhasM; i++) {
			for (int j = 0; j < colunasN; j++) {
				matriz[i][j]=sc.nextInt();
			}

		}
		
		for (int i = 0; i < linhasM; i++) {
			for (int j = 0; j < colunasN; j++) {
				System.out.print(matriz[i][j]+" ");
			}
			System.out.println();
		}
			
		
		
		sc.close();

	}

}
