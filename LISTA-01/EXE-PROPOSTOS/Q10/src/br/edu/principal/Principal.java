package br.edu.principal;
import java.util.Scanner;
public class Principal {
    public static void main(String[] args) {
        Scanner dado = new Scanner(System.in);

        double lado, area;

        System.out.print("Digite o valor do lado do quadrado: ");
        lado = dado.nextDouble();

        area = (double) ( lado * lado);

        System.out.printf("A área do quadrado é: " + area);

        dado.close();
    }
}

