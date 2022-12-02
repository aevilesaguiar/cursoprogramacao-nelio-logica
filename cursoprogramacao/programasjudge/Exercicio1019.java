package cursoprogramacao.programasjudge;


import java.util.Locale;
import java.util.Scanner;

public class Exercicio1019 {
	public static void main(String[] args) {
		

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		String nome;
	    double totalVendas, salario,totalReceber;

	    nome=sc.next();
	    salario=sc.nextDouble();
	    totalVendas=sc.nextDouble();
	    
	    
	    totalReceber=totalVendas*0.15+ salario;

	    System.out.printf("TOTAL = R$ %.2f%n",totalReceber);
		
		sc.close();
		

	}

}
