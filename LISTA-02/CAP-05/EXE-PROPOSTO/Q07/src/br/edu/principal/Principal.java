package br.edu.principal;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int contMaisDe50 = 0;
        int contAltura10a20 = 0;
        double somaAlturas10a20 = 0.0;
        int contPesoMenor40 = 0;

        for (int i = 1; i <= 5; i++) {
            System.out.println("Pessoa " + i + ":");

            System.out.print("Digite a idade: ");
            int idade = sc.nextInt();

            System.out.print("Digite a altura (em metros): ");
            double altura = sc.nextDouble();

            System.out.print("Digite o peso (em kg): ");
            double peso = sc.nextDouble();

            if (idade > 50) {
                contMaisDe50++;
            }

            if (idade >= 10 && idade <= 20) {
                somaAlturas10a20 += altura;
                contAltura10a20++;
            }

            if (peso < 40) {
                contPesoMenor40++;
            }

            System.out.println();
        }

        double mediaAltura10a20 = (contAltura10a20 > 0) ? somaAlturas10a20 / contAltura10a20 : 0.0;
        double porcentagemPesoMenor40 = (contPesoMenor40 * 100.0) / 5;

        System.out.println("Quantidade de pessoas com idade superior a 50 anos: " + contMaisDe50);
        System.out.printf("Média das alturas (idade entre 10 e 20 anos): %.2f m\n", mediaAltura10a20);
        System.out.printf("Porcentagem com peso inferior a 40 kg: %.2f%%\n", porcentagemPesoMenor40);

        sc.close();
    }
}