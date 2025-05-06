
package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		double vet[] = new double[8];
		int i, j = 0, z, aux = 0;
		Scanner sc = new Scanner (System.in);
		i = 1;
		while (i < 8) {
			System.out.println("Digite um valor para aux: ");
			aux = sc.nextInt();
			j = 0;
			while (j < i && vet[j] < aux) {
				j++;
			}
			z = i;
			while (z >= j+1) {
				vet[z] = vet[z-1];
				z = z - 1;
			}
			vet[j] = aux;
			i++;
		}
		for (i = 0; i < 8; i++) {
			System.out.println(vet[i]);
		}
	}

}