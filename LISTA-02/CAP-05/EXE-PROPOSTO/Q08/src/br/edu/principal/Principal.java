package br.edu.principal;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int contIdadeMais50PesoMenos60 = 0;
        int contAlturaMenos150 = 0;
        int somaIdadesAlturaMenos150 = 0;
        int contOlhosAzuis = 0;
        int contRuivosSemOlhosAzuis = 0;

        for (int i = 1; i <= 6; i++) {
            System.out.println("Pessoa " + i + ":");

            System.out.print("Idade: ");
            int idade = sc.nextInt();

            System.out.print("Peso (kg): ");
            double peso = sc.nextDouble();

            System.out.print("Altura (m): ");
            double altura = sc.nextDouble();

            System.out.print("Cor dos olhos (A - azul, P - preto, V - verde, C - castanho): ");
            char olhos = sc.next().toUpperCase().charAt(0);

            System.out.print("Cor dos cabelos (P - preto, C - castanho, L - louro, R - ruivo): ");
            char cabelos = sc.next().toUpperCase().charAt(0);

            if (idade > 50 && peso < 60) {
                contIdadeMais50PesoMenos60++;
            }

            if (altura < 1.50) {
                somaIdadesAlturaMenos150 += idade;
                contAlturaMenos150++;
            }

            if (olhos == 'A') {
                contOlhosAzuis++;
            }

            if (cabelos == 'R' && olhos != 'A') {
                contRuivosSemOlhosAzuis++;
            }

            System.out.println();
        }

        double mediaIdadesAlturaMenos150 = (contAlturaMenos150 > 0) ? (double) somaIdadesAlturaMenos150 / contAlturaMenos150 : 0.0;
        double porcentagemOlhosAzuis = (contOlhosAzuis * 100.0) / 6;

        System.out.println("Quantidade de pessoas com idade > 50 e peso < 60 kg: " + contIdadeMais50PesoMenos60);
        System.out.printf("Média das idades das pessoas com altura < 1.50 m: %.2f anos\n", mediaIdadesAlturaMenos150);
        System.out.printf("Porcentagem de pessoas com olhos azuis: %.2f%%\n", porcentagemOlhosAzuis);
        System.out.println("Quantidade de pessoas ruivas e que não possuem olhos azuis: " + contRuivosSemOlhosAzuis);

        sc.close();
    }
}