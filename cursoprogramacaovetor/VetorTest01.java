package cursoprogramacaovetor;

import java.util.Locale;
import java.util.Scanner;

public class VetorTest01 {
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc =new Scanner(System.in);
		
		int num=sc.nextInt();
		
		double[] vetor=new double[num];
		
		for (int i = 0; i < num; i++) {
			
			vetor[i]=sc.nextDouble();
		}
		
		//imprimir o vetor
		for (int i = 0; i <num; i++) {
			System.out.printf("%.2f%n",vetor[i]);
		}
		
		sc.close();
		
	}

}
