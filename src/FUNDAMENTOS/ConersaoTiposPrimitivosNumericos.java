package FUNDAMENTOS;

public class ConersaoTiposPrimitivosNumericos {

	public static void main(String[] args) {
		
		double a = 1; // conversão implícita
		System.out.println(a);
		
		// conversão de forma explícita (CAST)
		float b = (float) 1.0; // poderia por a letra F, no final do numero 1.0
		System.out.println(b);
		
		int c = 4; // por mais que o 4 caiba em byte, mesmo assim tera problemas pois o java nao análisa valores e sim tipos
		byte d = (byte) c ; // conversão explícita (CAST)
		System.out.println(d);
		
		double e = 1.999999; // houve perca de informação, pois o java ignoras as partes quebradas
		int f = (int) e; // conversão explícita (CAST)
		System.out.println(e);
		
		
				
	}
}
