
package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		String gabarito[] = new String[8], resposta[] = new String[8]; 
		int num, pontos, tot_ap, perc_ap, i, j;
		Scanner sc = new Scanner(System.in);
		
		for (i = 0; i < 8; i++) {
			System.out.println("Digite a resposta da questão:" + " " + i);
			gabarito[i] = sc.next();
		}
		tot_ap = 0;
		for (i = 0; i < 10; i++) {
			System.out.println("Digite o número do" + " " + i + " " + "Aluno");
			num = sc.nextInt();
			pontos = 0;
			for (j = 0; j < 8;j++) {
				System.out.println("Digite a resposta dada pelo aluno:" + num +" "+'à' + j + " " + "questão");
				resposta[j] = sc.next();
				if (resposta[j].equals(gabarito[j])) {
					pontos = pontos + 1;
				}
			}
			System.out.println("A nota do aluno: " + num + " " + "foi:" + pontos);
			if (pontos >= 6) {
				tot_ap = tot_ap + 1;
			}
		}
		perc_ap = tot_ap * 100 / 10;
		System.out.println("O percentual de alunos aprovados é:" + perc_ap);
	}

}