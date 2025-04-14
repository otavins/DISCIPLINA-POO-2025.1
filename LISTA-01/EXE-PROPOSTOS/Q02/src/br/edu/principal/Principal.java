package br.edu.principal;
import java.util.Scanner;
public class Principal {

	public static void main(String[] args) {
		
		Scanner dado = new Scanner(System.in);
		
		int num1, num2, num3, multi;
		
		System.out.println("DIgite um número: ");
		num1 = dado.nextInt();
		
		System.out.println("DIgite um número: ");
		num2 = dado.nextInt();
		
		System.out.println("DIgite um número: ");
		num3 = dado.nextInt();
		
		multi = num1 * num2 * num3;
		
		System.out.println("O resultado da amuiltiplicação é: " + multi);
		
		dado.close();
	}

}
