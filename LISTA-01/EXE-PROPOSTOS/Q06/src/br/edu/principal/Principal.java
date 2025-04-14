package br.edu.principal;
import java.util.Scanner;
public class Principal {

	public static void main(String[] args) {
		Scanner dado = new Scanner(System.in);
		
		double sal, venda, comissao,salFinal;
		
		System.out.println("Digite seu salário: ");
		sal = dado.nextDouble();
		
		System.out.println("Digite o valor da sua venda: ");
		venda = dado.nextDouble();
		
		comissao = (double) (venda * 0.04);
		salFinal = (double) (sal + comissao);
		
		
		System.out.println("A comissão é: " + comissao);
		System.out.println("Salario final foi: " + salFinal);
		
		dado.close();

	}

}
