
package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		double vet[] = new double [10], aux;
		int i, j;
		Scanner sc = new Scanner(System.in);
		
		for(i = 0; i < 10; i++ ) {
			System.out.println("Digite um número para o vetor, posição: " + " " + i);
			vet[i] = sc.nextDouble();
		}
		for (i = 0; i < 10; i++) {
			for (j=0; j < 9; j++) {
				if (vet[j] < vet[j+1]) {
					aux = vet[j];
					vet[j] = vet[j + 1];
					vet[j+1] = aux;
				}
			}
		}
		for (i = 0; i < 10; i++) {
			System.out.println(vet[i]);
		}
	}
}