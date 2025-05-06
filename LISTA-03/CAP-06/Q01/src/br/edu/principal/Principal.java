
package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		int num[];
		int i, j, cont;
		num = new int[10];
		Scanner sc = new Scanner(System.in);
		
		for (i = 1; i <= 9; i++) {
			num[i] = sc.nextInt();
		}
		for (i = 1; i <= 9; i++) {
			cont = 0;
			for (j = 1; j<=num[i];j++) {
				if (num[i] % j == 0) {
					cont++;
				}
			}
			if (cont <= 2) {
				System.out.println(num[i]);
				System.out.println(i);
			}
		}
		sc.close();
	}

}