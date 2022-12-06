package cursoprogramacao.array;

import java.util.Locale;
import java.util.Scanner;

public class Foreach1 {
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int quant=sc.nextInt();
		String[] nome = new String[quant];
		
		for (int i = 0; i < quant; i++) {
			nome[i]=sc.next();
		}
		System.out.println("Nomes lidos: ");
		
		//para cada (foreach)
		
		for (String string : nome) {
			
			System.out.println(string);
		}
		
		sc.close();
	}

}
