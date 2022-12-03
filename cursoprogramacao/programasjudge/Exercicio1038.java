package cursoprogramacao.programasjudge;


import java.util.Scanner;

public class Exercicio1038 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		int a=sc.nextInt();
		int b=sc.nextInt();
		int c=sc.nextInt();
		int d=sc.nextInt();
		
		int somacd=c+d;
		int somaab=a+b;
		int apar=a%2;

		if(b>c && d>a && somacd>somaab && c>0 && d>0 && apar==0) {
			System.out.println("Valores Aceitos");
		}else {
			System.out.println("Valores não aceitos");
		}
		
		sc.close();
		

	}

}
