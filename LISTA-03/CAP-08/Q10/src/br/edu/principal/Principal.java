package br.edu.principal;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        
        int qtde = 0;  
        int tot80 = 0;  
        double media_idade, media_altura, porc;
               
        int totalJogadores = 5 * 11;
        
        double somaAltura = 0;
        
        
        for (int cont_time = 1; cont_time <= 5; cont_time++) {
            media_idade = 0;
            System.out.println("Time " + cont_time + ":");
            
          
            for (int cont_jog = 1; cont_jog <= 11; cont_jog++) {
                System.out.println("Digite a idade, peso e altura do jogador " + cont_jog + ":");
                int idade = scanner.nextInt();
                double peso = scanner.nextDouble();
                double altura = scanner.nextDouble();
                
                
                if (idade < 18) {
                    qtde++;
                }

               
                media_idade += idade;

               
                somaAltura += altura;

                
                if (peso > 80) {
                    tot80++;
                }
            }

           
            media_idade /= 11;
            System.out.println("Média de idade do time " + cont_time + ": " + media_idade);
        }

       
        media_altura = somaAltura / totalJogadores;
        System.out.println("Média das alturas dos jogadores do campeonato: " + media_altura);

        
        porc = (tot80 * 100.0) / totalJogadores;
        System.out.println("Porcentagem de jogadores com mais de 80 kg: " + porc + "%");

        
        System.out.println("Quantidade de jogadores com idade inferior a 18 anos: " + qtde);
        
        scanner.close();
    }
} 