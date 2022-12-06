package k2apostila;

public class TestaOPeracaoesStrings {
	public static void main(String[] args) {
		
		String s = "Rafael Consentino";
		System.out.println(s.charAt(7));
		System.out.println(s.contains("Consentino"));
		
		s=s.replaceAll("Rafael","Jonas");
		System.out.println(s);
		
		System.out.println(s.substring(6));
		System.out.println(s.substring(0,5));
		
		s="            Aeviles";
		System.out.println(s.trim());
	}

}
