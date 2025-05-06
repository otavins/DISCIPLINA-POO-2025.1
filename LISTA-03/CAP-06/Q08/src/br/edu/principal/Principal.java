
package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		double x[] = new double[5], y[] = new double [5], r[] = new double [10];
		int i, j, z, aux;
		Scanner sc = new Scanner(System.in);
		
		
		for (i = 0; i < 5; i++) {
			System.out.println("Digite um número para a posição" + " " + i + ": de X" );
			x[i] = sc.nextDouble();
		}
		for(i = 0; i < 5; i++) {
			for (j = 0; j < 4;j++) {
				if (x[j] > x[j+1]) {
					aux = (int) x[j];
					x[j] = x[j+1];
					x[j+1] = aux;
				}
			}
		}
		for (i = 0; i < 5; i++) {
			System.out.println("Digite um número para o vetor y na posição:" + i);
			y[i] = sc.nextDouble();
		}
		for (i = 0; i < 5; i++) {
			for (j = 0; j < 4; j++) {
				if (y[j] > y[j+1]) {
					aux = (int) y[j];
					y[j] = y[j+1];
					y[j+1] = aux;
				}
			}
		}
		j = 0;
		for (i=0;i<5;i++) {
			r[j] = x[i];
			j++;
			r[j] = y[i];
			j++;
		}
		for (i=0;i<10;i++) {
			for (j=0;i<9;i++) {
				if (r[j] > r[j+1]) {
					aux = (int) r[j];
					r[j] = r[j+1];
					r[j+1] = aux;
				}
			}
		}
		for (i=0;i<5;i++) {
			System.out.println(x[i]);
		}
		for (i=0;i<5;i++) {
			System.out.println(y[i]);
		}
		for (i=0;i<5;i++) {
			System.out.println(r[i]);
		}

	}

}