
package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		double vet1[] = new double[10], vet2[] = new double[10], vet3[] = new double[20];
		int i, j = 0;
		Scanner sc =  new Scanner(System.in);
		
		for(i = 0; i <= 9;i++) {
			System.out.println("Digite o número do vetor 1 na posição: "+i);
			vet1[i] = sc.nextDouble();
			vet3[j] = vet1[i];
			j++;
			
			System.out.println("Digite o número do vetor 2 na posição: "+i);
			vet2[i] = sc.nextDouble();
			vet3[j] = vet2[i];
			j++;
		}
		for(i = 0; i <= 19; i ++) {
			System.out.println(vet3[i]);
		}
	}
}