package br.edu.principal;
import java.util.Scanner;
public class Principal {

	public static void main(String[] args) {
		Scanner dado = new Scanner (System.in);
		
		double produto, novoValor, desconto;
		
		System.out.println("Digite o valor do produto: ");
		produto = dado.nextDouble();
		
		desconto= (double) (produto * 0.10);
		novoValor = produto - desconto;
		
		System.out.println("O o novo preço do produto é: " + novoValor);
		
		dado.close();
	}

}
