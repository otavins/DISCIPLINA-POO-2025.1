package br.edu.principal;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner dado = new Scanner(System.in);

        double A, B, C;
        int I;

        System.out.print("Digite um valor para A: ");
        A = dado.nextDouble();

        System.out.print("Digite um valor para B: ");
        B = dado.nextDouble();

        System.out.print("Digite um valor para C: ");
        C = dado.nextDouble();

        System.out.print("Digite um valor para I (1, 2 ou 3): ");
        I = dado.nextInt();

        if (I == 1) {
           
            if (A < B && A < C) {
                if (B < C) {
                    System.out.println("A ordem crescente dos números é: " + A + " - " + B + " - " + C);
                } else {
                    System.out.println("A ordem crescente dos números é: " + A + " - " + C + " - " + B);
                }
            } else if (B < A && B < C) {
                if (A < C) {
                    System.out.println("A ordem crescente dos números é: " + B + " - " + A + " - " + C);
                } else {
                    System.out.println("A ordem crescente dos números é: " + B + " - " + C + " - " + A);
                }
            } else if (C < A && C < B) {
                if (A < B) {
                    System.out.println("A ordem crescente dos números é: " + C + " - " + A + " - " + B);
                } else {
                    System.out.println("A ordem crescente dos números é: " + C + " - " + B + " - " + A);
                }
            }
        } else if (I == 2) {
           
            if (A > B && A > C) {
                if (B > C) {
                    System.out.println("A ordem decrescente dos números é: " + A + " - " + B + " - " + C);
                } else {
                    System.out.println("A ordem decrescente dos números é: " + A + " - " + C + " - " + B);
                }
            } else if (B > A && B > C) {
                if (A > C) {
                    System.out.println("A ordem decrescente dos números é: " + B + " - " + A + " - " + C);
                } else {
                    System.out.println("A ordem decrescente dos números é: " + B + " - " + C + " - " + A);
                }
            } else if (C > A && C > B) {
                if (A > B) {
                    System.out.println("A ordem decrescente dos números é: " + C + " - " + A + " - " + B);
                } else {
                    System.out.println("A ordem decrescente dos números é: " + C + " - " + B + " - " + A);
                }
            }
        } else if (I == 3) {
           
            if (A > B && A > C) {
                System.out.println("A ordem desejada é: " + B + " - " + A + " - " + C);
            } else if (B > A && B > C) {
                System.out.println("A ordem desejada é: " + A + " - " + B + " - " + C);
            } else if (C > A && C > B) {
                System.out.println("A ordem desejada é: " + A + " - " + C + " - " + B);
            }
        } 
        dado.close();
    }
}
