package br.edu.principal;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double totalVista = 0.0;
        double totalPrazo = 0.0;

        for (int i = 1; i <= 15; i++) {
            System.out.print("Digite o código da transação " + i + " (V para à vista, P para a prazo): ");
            String codigo = sc.next().toUpperCase();

            System.out.print("Digite o valor da transação " + i + ": ");
            double valor = sc.nextDouble();

            if (codigo.equals("V")) {
                totalVista += valor;
            } else if (codigo.equals("P")) {
                totalPrazo += valor;
            } else {
                System.out.println("Código inválido. Ignorando transação.");
                i--; 
            }
        }

        double totalCompras = totalVista + totalPrazo;
        double primeiraPrestacao = totalPrazo / 3.0;

        System.out.println("\nResumo das transações:");
        System.out.printf("Total de compras à vista: R$ %.2f\n", totalVista);
        System.out.printf("Total de compras a prazo: R$ %.2f\n", totalPrazo);
        System.out.printf("Total geral das compras: R$ %.2f\n", totalCompras);
        System.out.printf("Valor da primeira prestação das compras a prazo: R$ %.2f\n", primeiraPrestacao);

        sc.close();
    }
}