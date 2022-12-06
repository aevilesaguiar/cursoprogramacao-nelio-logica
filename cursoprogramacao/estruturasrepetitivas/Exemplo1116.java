
package cursoprogramacao.estruturasrepetitivas;

import java.util.Locale;
import java.util.Scanner;

public class Exemplo1116 {
	
	public static void main(String[] args) {
		

		Scanner sc = new Scanner(System.in);
		
		int N=sc.nextInt();
		
			for (int i = 0; i < N; i++) {
			
				double num1=sc.nextDouble();
				double num2=sc.nextDouble();
				
				double divisao = num1/num2;
				
				if(num2==0) {
					System.out.println("divisao impossivel");
				}else {
					System.out.println(divisao);
				}
			

			}

		
		sc.close();
	}

}
