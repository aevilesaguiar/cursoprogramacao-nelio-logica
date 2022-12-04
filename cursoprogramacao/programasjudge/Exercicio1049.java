package cursoprogramacao.programasjudge;



import java.util.Scanner;

public class Exercicio1049 {
	public static void main(String[] args) {
		

		Scanner sc = new Scanner(System.in);
		
		String word1=sc.nextLine();
		String word2=sc.nextLine();
		String word3=sc.nextLine();
		

		if(word1.equals("vertebrado") && word2.equals("ave"))
		{
			if(word3.equals("carnivo")) {
			System.out.println("aguia");	
			}else{
				System.out.println("pomba");
			}
			
		}else if(word1.equals("vertebrado") && word2.equals("mamifero")) {
			if(word3.equals("carnivoro")) {
				System.out.println("homem");	
				}else{
					System.out.println("vaca");
				}
		}else if(word1.equals("invertebrado") && word2.equals("inseto")) {
			if(word3.equals("hematofago")) {
				System.out.println("sanguesuga");	
				}else{
					System.out.println("minhoca");
				}
		}
		
		
		sc.close();
		

	}

}
