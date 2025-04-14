package br.edu.principal;
import java.util.Scanner;
public class Principal {

	public static void main(String[] args) {
		Scanner dado = new Scanner(System.in);
		
		float sal, novosal, aumento;
		
		System.out.println("Digite seu salário: ");
		
		sal = dado.nextFloat();
		
		aumento = (float) (sal * (25.0 /100));
		novosal = sal + aumento;
		
		System.out.println("O novo salario com desconto é: " + novosal);
		
		dado.close();
	}

}
