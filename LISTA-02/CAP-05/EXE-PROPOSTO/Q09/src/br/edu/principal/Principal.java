package br.edu.principal;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int contPesoSuperior90AlturaInferior150 = 0;
        int contIdadesEntre10e30AlturaMaior190 = 0;
        int contAlturaMaior190 = 0;
        int somaIdades = 0;

        for (int i = 1; i <= 10; i++) {
            System.out.println("Pessoa " + i + ":");

            System.out.print("Digite a idade: ");
            int idade = sc.nextInt();

            System.out.print("Digite o peso (em kg): ");
            double peso = sc.nextDouble();

            System.out.print("Digite a altura (em metros): ");
            double altura = sc.nextDouble();

           
            somaIdades += idade;

            
            if (peso > 90 && altura < 1.50) {
                contPesoSuperior90AlturaInferior150++;
            }

            
            if (altura > 1.90) {
                contAlturaMaior190++;

                
                if (idade >= 10 && idade <= 30) {
                    contIdadesEntre10e30AlturaMaior190++;
                }
            }

            System.out.println();
        }

        double mediaIdades = somaIdades / 10.0;
        double porcentagemIdadesEntre10e30 = contAlturaMaior190 > 0 ? (contIdadesEntre10e30AlturaMaior190 * 100.0) / contAlturaMaior190 : 0.0;

        System.out.println("Média das idades das 10 pessoas: " + mediaIdades);
        System.out.println("Quantidade de pessoas com peso > 90 kg e altura < 1.50 m: " + contPesoSuperior90AlturaInferior150);
        System.out.printf("Porcentagem de pessoas com idade entre 10 e 30 anos e altura > 1.90 m: %.2f%%\n", porcentagemIdadesEntre10e30);

        sc.close();
    }
}