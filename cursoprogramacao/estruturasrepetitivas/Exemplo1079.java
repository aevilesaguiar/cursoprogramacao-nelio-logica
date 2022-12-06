
package cursoprogramacao.estruturasrepetitivas;

import java.util.Locale;
import java.util.Scanner;

public class Exemplo1079 {
	
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int N=sc.nextInt();
		
			for (int i = 0; i < N; i++) {
			
				double num1=sc.nextDouble();
				double num2=sc.nextDouble();
				double num3=sc.nextDouble();
				
				double media = ((num1*2.0)+(num2*3.0)+(num3*5.0))/10.0;
				System.out.printf("%.1f%n",media);

			}

		
		sc.close();
	}

}
