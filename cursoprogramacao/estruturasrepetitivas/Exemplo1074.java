
package cursoprogramacao.estruturasrepetitivas;

import java.util.Scanner;

public class Exemplo1074 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int N=sc.nextInt();
		

			for (int i = 0; i < N; i++) {
				
				int x=sc.nextInt();
				if(x>0) {
					if(x%2==0) {
						System.out.println("EVEN POSITIVE");
				}else {
					System.out.println("ODD POSITIVE");
				}
		
				}
				
				if(x==0) {
					System.out.println("NULL");
				}
				
				if(x<0) {
					if(x%2==0) {
						System.out.println("EVEN NEGATIVE");
				}else {
					System.out.println("ODD NEGATIVE");
				}
				}
			}

		
		sc.close();
	}

}
