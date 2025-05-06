package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		int qtd[] = new int[11], preco[] = new int[11], i, ind;
		double tot_geral, tot_vend, comissao, maio;
		Scanner sc = new Scanner(System.in);
		tot_geral = 0;
		for(i = 1; i <= 10; i++) {
			System.out.println("Digite a quantidade do " + i + " Produto: ");
			qtd[i] = sc.nextInt();
			System.out.println("Digite o valor do " + i + " Produto: ");
			preco[i] = sc.nextInt();
		}
		
		for(i = 1; i <= 10; i++) {
			tot_vend = qtd[i] * preco[i];
			System.out.println(qtd[i]+ "Quantidade do" + i + " Produto");
			System.out.println(preco[i]+ "Valor do " + i + "Produto");
			System.out.println(tot_vend + "Valor da venda" );
			tot_geral = tot_geral + tot_vend;
		}
		comissao = tot_geral * 5/100;
		System.out.println(tot_geral + "Total das vendas");
		System.out.println(comissao + "Comissão");
		maio = qtd[1];
		ind = 1;
		for(i = 2 ; i <= 10; i++) {
			if (qtd[i] > maio) {
				maio = qtd[i];
				ind = i;
			}
		}
		System.out.println(preco[ind]);
		System.out.println(ind);
		
		
	}
}