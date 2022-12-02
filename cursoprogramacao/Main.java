package cursoprogramacao;

import java.util.Locale;

public class Main {
	public static void main(String[] args) {
		
		//CONFIGURAR A LOCALIZAÇÃO DO PROGRAMA
		Locale.setDefault(Locale.US);
		
		
		System.out.println("Olá Mundo!");
		System.out.println("Bom dia!");
		System.out.print("oi");
		System.out.println("");
		int y=32;
		System.out.println(y);
		
		//conteudo de uma variavel de ponto flutuante
		double x=10.32562;
		System.out.println(x);
		//para formatar a quantidade de numeros após a virgula
		//eu uso printf_> f é formatado
		System.out.printf("%.2f%n",x);
		System.out.printf("%.4f%n",x);
		
		System.out.println("Resultado = "+x);
		
		//Para concatenar vários elemntos em um mesmo comando de escrita
		System.out.printf("RESULTADO = %.2f metros%n ",x);
		String nome = "Ana";
		int idade = 31;
		double renda = 4000.00;
		System.out.printf("%s tem %d anos e ganha %.2f de renda",nome,idade,renda);
	}

}
