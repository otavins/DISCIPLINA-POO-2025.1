package br.edu.principal;
import java.util.Scanner;
public class Principal {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o valor do lado do quadrado: ");
        double lado = scanner.nextDouble();

        double area = lado * lado;

        System.out.printf("A área do quadrado é: %.2f\n", area);

        scanner.close();
    }
}


