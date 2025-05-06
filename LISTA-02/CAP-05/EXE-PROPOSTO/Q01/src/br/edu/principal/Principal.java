package br.edu.principal;

import java.util.Scanner;
import java.util.Arrays;

public class Principal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        for (int grupo = 1; grupo <= 5; grupo++) {
            int[] valores = new int[4];
            
            System.out.println("Grupo " + grupo + ":");
            for (int i = 0; i < 4; i++) {
                System.out.print("Digite o valor " + (char)('A' + i) + ": ");
                valores[i] = sc.nextInt();
            }
            
            System.out.print("Ordem lida: ");
            for (int v : valores) {
                System.out.print(v + " ");
            }
            System.out.println();

            int[] crescente = Arrays.copyOf(valores, valores.length);
            Arrays.sort(crescente);
            System.out.print("Ordem crescente: ");
            for (int v : crescente) {
                System.out.print(v + " ");
            }
            System.out.println();

            System.out.print("Ordem decrescente: ");
            for (int i = crescente.length - 1; i >= 0; i--) {
                System.out.print(crescente[i] + " ");
            }
            System.out.println();
        }

        sc.close();
    }
}