package FUNDAMENTOS;

import java.lang.invoke.StringConcatException;
import java.security.DigestOutputStream;

public class Nota��oponto {
	
	public static void main(String[] args) {
		
		String s = "Bom dia X";
		s = s.replace("X", "Senhora");
	    s = s.toUpperCase();
	    s = s.concat("!!!");
	    
		System.out.println(s);
		
		System.out.println("Leo" .toUpperCase());
		
		String y = "Bom dia X"
				.replace("X", "Gui")
				.toUpperCase()
				.concat("!!!");
		System.out.println(y);
		
		// Tipos primitivos n�o tem o operador "."
		int a = 3;
		System.out.println(a);
	    
	}

}