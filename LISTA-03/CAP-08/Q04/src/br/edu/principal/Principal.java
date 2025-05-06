package br.edu.principal;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

       
        int cod, numVeiculos, numAcidentes;
        int maior = 0, menor = Integer.MAX_VALUE;
        int cidMaior = 0, cidMenor = 0;
        int somaVeiculos = 0;
        int somaAcidentes = 0;
        int contAcidentes = 0;

       
        for (int cont = 1; cont <= 5; cont++) {
          
            System.out.println("Digite o código da cidade: ");
            cod = scanner.nextInt();
            System.out.println("Digite o número de veículos de passeio: ");
            numVeiculos = scanner.nextInt();
            System.out.println("Digite o número de acidentes com vítimas: ");
            numAcidentes = scanner.nextInt();

    
            if (cont == 1) {
                maior = numAcidentes;
                cidMaior = cod;
                menor = numAcidentes;
                cidMenor = cod;
            } else {
                if (numAcidentes > maior) {
                    maior = numAcidentes;
                    cidMaior = cod;
                }
                if (numAcidentes < menor) {
                    menor = numAcidentes;
                    cidMenor = cod;
                }
            }

            
            somaVeiculos += numVeiculos;

           
            if (numVeiculos < 2000) {
                somaAcidentes += numAcidentes;
                contAcidentes++;
            }
        }

      
        System.out.println("Maior índice de acidentes: " + maior + " na cidade de " + cidMaior);
        System.out.println("Menor índice de acidentes: " + menor + " na cidade de " + cidMenor);

        
        double mediaVeiculos = (double) somaVeiculos / 5;
        System.out.println("Média de veículos nas 5 cidades: " + mediaVeiculos);

        
        if (contAcidentes == 0) {
            System.out.println("Não foi digitada nenhuma cidade com menos de 2000 veículos.");
        } else {
            double mediaAcidentes = (double) somaAcidentes / contAcidentes;
            System.out.println("Média de acidentes nas cidades com menos de 2000 veículos: " + mediaAcidentes);
        }

        
        scanner.close();
    }
}