
package cursoprogramacao.estruturasrepetitivas;

import java.util.Scanner;

public class Exemplo1078 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int num=sc.nextInt();
		
		for (int i = 0; i <10; i++) {
			System.out.println((i+1)+" x "+num+ " = "+(num*(i+1)));
			
		}
		
		
		
		sc.close();
	}

}
