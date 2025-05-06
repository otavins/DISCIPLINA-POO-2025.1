package br.edu.principal;
import java.util.Scanner;
public class Principal {

	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        
        System.out.print("Digite o primeiro número: ");
        double num1 = scanner.nextDouble();

        System.out.print("Digite o segundo número: ");
        double num2 = scanner.nextDouble();

        
        System.out.println("Escolha a operação:");
        System.out.println("1 - Média entre os números digitados");
        System.out.println("2 - Diferença do maior pelo menor");
        System.out.println("3 - Produto entre os números digitados");
        System.out.println("4 - Divisão do primeiro pelo segundo");

        System.out.print("Digite a sua opção (1 a 4): ");
        int opcao = scanner.nextInt();

        System.out.println();

        
        switch (opcao) {
            case 1:
                double media = (num1 + num2) / 2;
                System.out.println("Média: " + media);
                break;

            case 2:
                double diferenca = Math.abs(num1 - num2);
                System.out.println("Diferença do maior pelo menor: " + diferenca);
                break;

            case 3:
                double produto = num1 * num2;
                System.out.println("Produto: " + produto);
                break;

            case 4:
                if (num2 == 0) {
                    System.out.println("Erro: divisão por zero não é permitida.");
                } else {
                    double divisao = num1 / num2;
                    System.out.println("Divisão: " + divisao);
                }
                break;

            default:
                System.out.println("Opção inválida. Encerrando o programa.");
        }

        scanner.close();
    }
}


