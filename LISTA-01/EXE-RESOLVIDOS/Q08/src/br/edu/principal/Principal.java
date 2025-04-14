package br.edu.principal;
import java.util.Scanner;
public class Principal {

	public static void main(String[] args) {
		Scanner dado = new Scanner(System.in);
		double dep, taxa, rend, total;
		
		System.out.println("Digite o valor do deposito: ");
		dep = dado.nextDouble();
		
		System.out.println("Digite a taxa: ");
		taxa = dado.nextDouble();
		rend = (double) (dep * (taxa/100));
		total = (double) (dep + rend);
		
		System.out.println("Seu rendimento foi: " + rend);
		
		System.out.println("O valor total foi: " + total);
		
		dado.close();
	}

}
