package FUNDAMENTOS;

public class ConversaoNumeroString {
	
	public static void main(String[] args) {
		Integer num1 = 10000;
		System.out.println(num1.toString().length());
		
		int num2 = 100000; // valor primitivo
		System.out.println(Integer.toString(num2)); // foi usado o Integer.toString direto
		
		System.out.println(("" + num2).length());
		
		
	}

}
