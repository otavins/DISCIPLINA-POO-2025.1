package br.edu.principal;
import java.util.Scanner;
public class Principal {

	public static void main(String[] args) {
		
		Scanner dado = new Scanner(System.in);
		
		int num1, num2 , sub;
		
		System.out.println("Digite um número: ");
		num1 = dado.nextInt();
		System.out.println("Digite outro número: ");
		num2 = dado.nextInt();
		
		sub = num1-num2;
		
		System.out.println("O resultado da subtração é: " + sub);
		
		dado.close();
	}

}
