package FUNDAMENTOS;

import java.util.Scanner;

public class Console {
	
	public static void main(String[] args) {
		
		
		System.out.print("Bom");
		System.out.print(" dia!");
		
		System.out.printf("Megasena: %d %d %d %d %d %d \n", 1, 5, 13, 21, 33, 47);
		System.out.printf("Salário: %.1f%n", 1234.5678);
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Digite o seu nome:");
		String nome = entrada.nextLine();
		
		System.out.print("Digite o seu sobrenome:");
		String sobrenome = entrada.nextLine();
		
		System.out.print("Digite a sua idade:");
		int idade = entrada.nextInt();
		
		System.out.printf("%s %s tem %d anos.%n",
				nome, sobrenome, idade);
		
		entrada.close();
	}

}
