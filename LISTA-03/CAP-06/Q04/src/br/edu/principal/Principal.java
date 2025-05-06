
package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		double num[] = new double[8], neg[] = new double[8], pos[] = new double[8];
		int cont, cont_n, cont_p;
		int i;
		Scanner sc = new Scanner(System.in);
		cont_n = 0;
		cont_p = 0;
		
		for (i = 0; i < 8; i++) {
			System.out.println("Digite um número para a posição " + i + "Para o vetor num.");
			num[i] = sc.nextDouble();
			if (num[i] >= 0) {
				pos[cont_p] = num[i];
				cont_p++;
			}
			else {
				neg[cont_n] = num[i];
				cont_n = cont_n + 1;
			}
		}
		if (cont_n == 0) {
			System.out.println("Vetor de negativos vazio");
		}
		else {
			for(i = 0; i <= cont_n - 1; i++) {
				System.out.println(neg[i]);
			}
		}
		if (cont_p == 0) {
			System.out.println("Vetor de positivos vazio");
		}
		else {
			for(i = 0;i <= cont_p - 1; i++) {
				System.out.println(pos[i]);
			}
		}

	}

}