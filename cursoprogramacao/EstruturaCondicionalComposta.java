package cursoprogramacao;

import java.util.Scanner;

public class EstruturaCondicionalComposta {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Quantas Horas?");
		int x = sc.nextInt();
		
		if(x<12) {
			System.out.println("Bom Dia");
		}else if (x>=12&& x<18) {
			System.out.println("Boa tarde");
		}else {
			System.out.println("Bom Noite");
		}
		

		sc.close();

		
	}

}
