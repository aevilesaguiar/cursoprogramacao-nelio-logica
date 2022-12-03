package cursoprogramacao.programasjudge;



import java.util.Scanner;

public class Exercicio1046 {
	public static void main(String[] args) {
		


		Scanner sc = new Scanner(System.in);
		
		int a=sc.nextInt();
		int b=sc.nextInt();
		
		int multiplo= a/b;
		
		
		if(a%b==0 || b%a==0) {
			System.out.println("Sao Multiplos");
		}else {
			System.out.println("Nao sao Multiplos");
		}
		
		sc.close();
		

	}

}
