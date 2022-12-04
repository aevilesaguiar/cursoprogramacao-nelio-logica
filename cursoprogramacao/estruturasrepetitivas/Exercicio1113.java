package cursoprogramacao.estruturasrepetitivas;

import java.util.Scanner;

public class Exercicio1113 {
public static void main(String[] args) {
	
	Scanner sc = new Scanner(System.in);
	
	int senha=sc.nextInt();

	
	while(senha!=2022) {
		
		System.out.println("Senha Invalida");
		senha=sc.nextInt();

	}
	System.out.println("Acesso Permitido");
	sc.close();
	
}
}
