package forteste;

public class ForTeste01Piramide {
	
	public static void main(String[] args) {
		
		   int line = 6;  
	       for(int i = 1; i <= line; i++) {  
	          for(int j = line; j >= i; j--) {  
	              System.out.print("* ");  
	          }  
	           System.out.println(); //nova linha  
	       }  
		
	}

}
