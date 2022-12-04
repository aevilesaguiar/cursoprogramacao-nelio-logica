package cursoprogramacao.programasjudge;


import java.util.Scanner;

public class Exercicio1042 {
	public static void main(String[] args) {

		//Sort Simples
		Scanner sc = new Scanner(System.in);
		int num1=sc.nextInt();
		int num2=sc.nextInt();
		int num3=sc.nextInt();
		
		
		if(num1<num2&& num1<num3) {
			System.out.println(num1);
			if(num2<num3) {
				System.out.println(num2);
				System.out.println(num3);
			}else {
				System.out.println(num3);
				System.out.println(num2);
			}
		}else if(num2<num3) {
			System.out.println(num2);
			if(num1<num3) {
				System.out.println(num1);
				System.out.println(num3);
			}else {
				System.out.println(num3);
				System.out.println(num2);
			}
		}else{
			System.out.println(num3);
			if(num1<num2) {
				System.out.println(num1);
				System.out.println(num2);
			}else {
				System.out.println(num2);
				System.out.println(num1);
			}
		}
		
		System.out.println("");
		System.out.println(num1);
		System.out.println(num2);
		System.out.println(num3);
	
		sc.close();
		

	}

}
