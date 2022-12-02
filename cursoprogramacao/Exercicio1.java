package cursoprogramacao;

import java.util.Locale;

public class Exercicio1 {
	public static void main(String[] args) {
		
		//CONFIGURAR A LOCALIZAÇÃO DO PROGRAMA
		Locale.setDefault(Locale.US);
		
		String product1="Computer";
		String product2="Office desk";
		
		
		int age = 30;
		int code=5290;
		char gender='F';
		
		double price1=2100.00;
		double price2=650.50;
		double measure=53.234567;
		
		System.out.printf("Products: %n%s, which price is $ %.2f"
				+ "%n%s which price is %.2f"
				+"%n%nRecord: %d years old, code %d and gender: %c"
				+"%n%nNeasue with eight decimal places: %.6f"
				+"%nRouded (three decimal places): %.3f"
				+"%nUS decimal point: 53.235",product1,price1, product2,price2,age,code,gender,measure,measure);
		
		
		
				}

}
