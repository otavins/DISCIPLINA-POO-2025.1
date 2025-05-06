
package br.edu.principal;

import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {
        double x[] = new double[10], y[] = new double[10], u[] = new double[20], d[] = new double[10], s[] = new double[10], p[] = new double[10], it[] = new double[10];
        int cont_u = 0, cont_d = 0, cont_i = 0;

        Scanner sc = new Scanner(System.in);
        
        for (int i = 0; i < 10; i++) {
            System.out.println("Digite um número para X:");
            x[i] = sc.nextDouble();
            System.out.println("Digite um número para Y:");
            y[i] = sc.nextDouble();
        }
        for (int i = 0; i < 10; i++) {
            int j = 0;
            while (j < cont_u && x[i] != u[j]) {
                j++;
            }
            if (j >= cont_u) {
                u[cont_u] = x[i];
                cont_u++;
            }
        }
        for (int i = 0; i < 10; i++) {
            int j = 0;
            while (j < cont_u && y[i] != u[j]) {
                j++;
            }
            if (j >= cont_u) {
                u[cont_u] = y[i];
                cont_u++;
            }
        }
        for (int i = 0; i < cont_u; i++) {
            System.out.println(u[i]);
        }
        for (int i = 0; i < 10; i++) {
            int j = 0;
            while (j < 10 && x[i] != y[j]) {
                j++;
            }
            if (j >= 10) {
                int k = 0;
                while (k < cont_d && x[i] != d[k]) {
                    k++;
                }
                if (k >= cont_d) {
                    d[cont_d] = x[i];
                    cont_d++;
                }
            }
        }
        for (int i = 0; i < cont_d; i++) {
            System.out.println(d[i]);
        }
        for (int i = 0; i < 10; i++) {
            s[i] = x[i] + y[i];
            System.out.println(s[i]);
        }
        for (int i = 0; i < 10; i++) {
            p[i] = x[i] * y[i];
            System.out.println(p[i]);
        }
        for (int i = 0; i < 10; i++) {
            int j = 0;
            while (j < 10 && x[i] != y[j]) {
                j++;
            }
            if (j < 10) {
                int k = 0;
                while (k < cont_i && it[k] != x[i]) {
                    k++;
                }
                if (k >= cont_i) {
                    it[cont_i] = x[i];
                    cont_i++;
                }
            }
        }
        for (int i = 0; i < cont_i; i++) {
            System.out.println(it[i]);
        }
    }
}