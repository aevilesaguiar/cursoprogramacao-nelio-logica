
package cursoprogramacao.estruturasrepetitivas;

import java.util.Locale;
import java.util.Scanner;

public class Exemplo1132 {
	
	public static void main(String[] args) {
		

		Scanner sc = new Scanner(System.in);
		
		int num1=sc.nextInt();
		int num2=sc.nextInt();
		
		int min , max, soma=0;
		
		if(num1>num2) {
			max=num1;
			min=num2;
			
		}else {
			max=num2;
			min=num1;
		}

			for (int i = min; i <=max; i++) {
			
				if(i%13!=0) {
					soma=soma+i;

				}
			}
				System.out.println(soma);
		
		sc.close();
	}

}
