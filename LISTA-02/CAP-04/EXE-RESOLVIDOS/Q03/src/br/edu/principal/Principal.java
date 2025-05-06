package br.edu.principal;
import java.util.Scanner;
public class Principal {

	public static void main(String[] args) {
		Scanner dado = new Scanner(System.in);
		
		double num1, num2;
		System.out.println("Digite o primeiro numero: ");
		num1 = dado.nextDouble();
		System.out.println("Digite o segundo numero: ");
		num2 = dado.nextDouble();
		dado.close();
		
		if (num1 > num2) {
			System.out.println("O maior numero é: "+ num1);
			
		}
		else if (num2 > num1) {
			System.out.println("O maior numero é: " + num2);
			
		}
		else {
			System.out.println("Os numeros são iguais");
		}
	}

}
