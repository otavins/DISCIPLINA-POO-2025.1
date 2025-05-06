package br.edu.principal;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        
        double nota1, nota2, nota3, nota4, media;

     
        System.out.println("Digite a primeira nota:");
        nota1 = scanner.nextDouble();
        
        System.out.println("Digite a segunda nota:");
        nota2 = scanner.nextDouble();
        
        System.out.println("Digite a terceira nota:");
        nota3 = scanner.nextDouble();
        
        System.out.println("Digite a quarta nota:");
        nota4 = scanner.nextDouble();
        
       
        media = (nota1 + nota2 + nota3 + nota4) / 4;

       
        System.out.println("Média do aluno: " + media);


        if (media >= 7) {
            System.out.println("Aprovado!");
        } else {
            System.out.println("Reprovado!");
        }

        scanner.close();
    }
}