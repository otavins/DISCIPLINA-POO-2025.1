package br.edu.principal;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        
        double salarioMinimo = 450.00;

       
        for (int cont = 1; cont <= 10; cont++) {
            
            System.out.println("Digite os dados do funcionário " + cont);
            System.out.println("Código: ");
            int codigo = scanner.nextInt();
            System.out.println("Número de horas trabalhadas: ");
            double nht = scanner.nextDouble();
            System.out.println("Turno (M - matutino, V - vespertino, N - noturno): ");
            char turno = scanner.next().charAt(0);
            System.out.println("Categoria (G - gerente, O - operário): ");
            char categoria = scanner.next().charAt(0);

           
            while (turno != 'M' && turno != 'V' && turno != 'N') {
                System.out.println("Turno inválido. Digite novamente (M, V ou N): ");
                turno = scanner.next().charAt(0);
            }

           
            while (categoria != 'G' && categoria != 'O') {
                System.out.println("Categoria inválida. Digite novamente (G ou O): ");
                categoria = scanner.next().charAt(0);
            }

          
            double valorHora = 0.0;
            if (categoria == 'G') {
                if (turno == 'N') {
                    valorHora = salarioMinimo * 18 / 100;
                } else {
                    valorHora = salarioMinimo * 15 / 100;
                }
            } else if (categoria == 'O') {
                if (turno == 'N') {
                    valorHora = salarioMinimo * 13 / 100;
                } else {
                    valorHora = salarioMinimo * 10 / 100;
                }
            }

           
            double salarioInicial = nht * valorHora;

           
            double auxilioAlimentacao = 0.0;
            if (salarioInicial <= 300) {
                auxilioAlimentacao = salarioInicial * 20 / 100;
            } else if (salarioInicial < 600) {
                auxilioAlimentacao = salarioInicial * 15 / 100;
            } else {
                auxilioAlimentacao = salarioInicial * 5 / 100;
            }

           
            double salarioFinal = salarioInicial + auxilioAlimentacao;

            
            System.out.println("\nResumo do Funcionário:");
            System.out.println("Código: " + codigo);
            System.out.println("Número de horas trabalhadas: " + nht);
            System.out.println("Valor da hora trabalhada: R$ " + String.format("%.2f", valorHora));
            System.out.println("Salário inicial: R$ " + String.format("%.2f", salarioInicial));
            System.out.println("Auxílio alimentação: R$ " + String.format("%.2f", auxilioAlimentacao));
            System.out.println("Salário final: R$ " + String.format("%.2f", salarioFinal));
            System.out.println("-------------------------------------\n");
        }

        
        scanner.close();
    }
}