package cursoprogramacao.programasjudge;


import java.util.Locale;
import java.util.Scanner;

public class Exercicio1009 {
	public static void main(String[] args) {
		

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
	    int N,horas,minutos,segundos,resto;
	   
		
		N = sc.nextInt();
		
		horas = N / 3600;
		resto = N % 3600;
		
		System.out.println(resto);
		
		minutos = resto / 60;
		segundos = resto % 60;
		System.out.println(horas + ":" + minutos + ":" + segundos);
	    
	  
		sc.close();
		

	}

}
