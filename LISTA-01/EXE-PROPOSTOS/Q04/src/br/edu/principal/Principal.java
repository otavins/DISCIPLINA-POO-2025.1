package br.edu.principal;
import java.util.Scanner;
public class Principal {

	public static void main(String[] args) {
		
		Scanner dado = new Scanner(System.in);
		
		double nota1, nota2 , media;
		
		System.out.println("Digite uma nota: ");
		nota1 = dado.nextDouble();
		System.out.println("Digite sua outra nota: ");
		nota2 = dado.nextDouble();
		
		media = (double) ((nota1 *2) + (nota2 *3))/5;
		
		System.out.println("O resultado da divisão é: " + media);
		
		dado.close();
	}

}