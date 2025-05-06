package br.edu.principal;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] faixas = new int[5];
        int totalPessoas = 8;

        for (int i = 1; i <= totalPessoas; i++) {
            System.out.print("Digite a idade da pessoa " + i + ": ");
            int idade = sc.nextInt();

            if (idade <= 15) {
                faixas[0]++;
            } else if (idade <= 30) {
                faixas[1]++;
            } else if (idade <= 45) {
                faixas[2]++;
            } else if (idade <= 60) {
                faixas[3]++;
            } else {
                faixas[4]++;
            }
        }

        System.out.println("\nQuantidade de pessoas por faixa etária:");
        System.out.println("1ª faixa (até 15 anos): " + faixas[0]);
        System.out.println("2ª faixa (16 a 30 anos): " + faixas[1]);
        System.out.println("3ª faixa (31 a 45 anos): " + faixas[2]);
        System.out.println("4ª faixa (46 a 60 anos): " + faixas[3]);
        System.out.println("5ª faixa (acima de 60 anos): " + faixas[4]);

        double porcentagem1a = (faixas[0] * 100.0) / totalPessoas;
        double porcentagem5a = (faixas[4] * 100.0) / totalPessoas;

        System.out.printf("\nPorcentagem de pessoas na 1ª faixa: %.2f%%\n", porcentagem1a);
        System.out.printf("Porcentagem de pessoas na 5ª faixa: %.2f%%\n", porcentagem5a);

        sc.close();
    }
}