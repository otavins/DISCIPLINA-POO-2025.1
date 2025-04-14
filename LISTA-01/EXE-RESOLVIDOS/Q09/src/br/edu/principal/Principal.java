package br.edu.principal;
import java.util.Scanner;
public class Principal {

	public static void main(String[] args) {
		
		Scanner dado = new Scanner(System.in);
		double base, altura, area;
		
		System.out.println("Digite a base: ");
		base = dado.nextDouble();
		
		System.out.println("Digite a altura: ");
		altura = dado.nextDouble();
		
		area = (double) (base * altura)/2;
		
		System.out.println("A área do triangulo é: "+ area);
		
		dado.close();

	}

}
