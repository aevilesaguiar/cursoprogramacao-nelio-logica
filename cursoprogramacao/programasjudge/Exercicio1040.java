package cursoprogramacao.programasjudge;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio1040 {
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		float n1=sc.nextFloat();
		float n2=sc.nextFloat();
		float n3=sc.nextFloat();
		float n4=sc.nextFloat();
		float n5;
		float mediaExame;
		
		float media=(n1*2f+n2*3f+n3*4f+n4*1f)/10f;
		
		System.out.printf("MEDIA: %.1f%n",media);
		
		if(media >=5.0f && media<=6.9f) {
			System.out.println("Aluno em exame.");
			n5=sc.nextFloat();
			System.out.printf("Nota do exame: %.1f%n",n5);
			mediaExame=(media+n5)/2f;
			if(mediaExame>=5.0f) {
				System.out.println("Aluno aprovado.");
			}else {
				System.out.println("Aluno Reprovado.");
			}				
			}else if (media >=7.0f){
				System.out.println("Aluno aprovado.");
			}
			else {
			System.out.println("Aluno Reprovado.");
			}
		sc.close();
		

	}

}
