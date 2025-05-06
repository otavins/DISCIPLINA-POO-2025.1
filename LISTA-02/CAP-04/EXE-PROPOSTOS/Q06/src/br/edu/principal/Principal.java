package br.edu.principal;
import java.util.Scanner;
public class Principal {

	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o primeiro número: ");
        double num1 = scanner.nextDouble();

        System.out.print("Digite o segundo número: ");
        double num2 = scanner.nextDouble();

        System.out.println("\nEscolha a operação desejada:");
        System.out.println("a) O primeiro número elevado ao segundo número");
        System.out.println("b) Raiz quadrada de cada um dos números");
        System.out.println("c) Raiz cúbica de cada um dos números");

        System.out.print("Digite a letra correspondente à opção: ");
        String opcao = scanner.next().toLowerCase();

        switch (opcao) {
            case "a":
                double potencia = Math.pow(num1, num2);
                System.out.println("\nResultado: " + num1 + " elevado a " + num2 + " é " + potencia);
                break;

            case "b":
                if (num1 >= 0 && num2 >= 0) {
                    double raiz1 = Math.sqrt(num1);
                    double raiz2 = Math.sqrt(num2);
                    System.out.println("\nRaiz quadrada de " + num1 + " é " + raiz1);
                    System.out.println("Raiz quadrada de " + num2 + " é " + raiz2);
                } else {
                    System.out.println("\nErro: Não é possível calcular a raiz quadrada de número negativo.");
                }
                break;

            case "c":
                double raizCubica1 = Math.cbrt(num1);
                double raizCubica2 = Math.cbrt(num2);
                System.out.println("\nRaiz cúbica de " + num1 + " é " + raizCubica1);
                System.out.println("Raiz cúbica de " + num2 + " é " + raizCubica2);
                break;

            default:
                System.out.println("\nOpção inválida! O programa será encerrado.");
                break;
        }

        scanner.close();
    }
}


