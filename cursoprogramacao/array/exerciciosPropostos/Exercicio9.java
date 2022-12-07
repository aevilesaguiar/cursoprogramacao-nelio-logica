package cursoprogramacao.array.exerciciosPropostos;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio9 {
public static void main(String[] args) {
	
	Locale.setDefault(Locale.US);
	Scanner sc = new Scanner(System.in);
	
	int quantidade=sc.nextInt();
	String[]nome = new String[quantidade];
	double[]precoCompra= new double[quantidade];
	double[]precoVenda= new double[quantidade];
	
	for (int i = 0; i < precoVenda.length; i++) {
		nome[i] = sc.next();
		precoCompra[i] = sc.nextDouble();
		precoVenda[i] = sc.nextDouble();
		
	}
	
	// 1: vamos encontrar a quantidade para cada faixa de lucro desejada
			int contAbaixoDe10 = 0;
			int contEntre10E20 = 0;
			int contAcimaDe20 = 0;
			for (int i=0; i<quantidade; i++) {
				
				double lucro = precoVenda[i] - precoCompra[i];

				double porcentagemDeLucro = lucro / precoCompra[i] * 100.0;

				if (porcentagemDeLucro < 10.0) {
					contAbaixoDe10++;
				}
				else if (porcentagemDeLucro <= 20.0) {
					contEntre10E20++;
				}
				else {
					contAcimaDe20++;
				}
			}
			System.out.println("Lucro abaixo de 10%: " + contAbaixoDe10);
			System.out.println("Lucro entre 10% e 20%: " + contEntre10E20);
			System.out.println("Lucro acima de 20%: " + contAcimaDe20);
			
			double precoTotalCompra=0.0;
			double precoTotalVenda=0.0;
			
			for (int i = 0; i < quantidade; i++) {
				precoTotalCompra=precoTotalCompra+precoCompra[i];
				
			}
			System.out.printf("Valor total de compra: %.2f%n",precoTotalCompra);
			
			for (int i = 0; i < quantidade; i++) {
				precoTotalVenda=precoTotalVenda+precoVenda[i];
				
			}
			System.out.printf("Valor total de venda: %.2f%n",precoTotalVenda);
			
			double lucro=0.0;
			for (int i = 0; i < quantidade; i++) {
				
				lucro=precoTotalVenda- precoTotalCompra;
			}
			
			System.out.printf("Lucro total:: %.2f%n",lucro);

	sc.close();
}
}
