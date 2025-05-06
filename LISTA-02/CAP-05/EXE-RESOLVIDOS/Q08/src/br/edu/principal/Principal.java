package br.edu.principal;
import java.util.Scanner;
public class Principal {
    public static void main(String[] args) {
        Scanner dado = new Scanner(System.in);

        double x, y, z;

        System.out.print("Digite o valor de x: ");
        x = dado.nextDouble();

        System.out.print("Digite o valor de y: ");
        y = dado.nextDouble();

        System.out.print("Digite o valor de z: ");
        z = dado.nextDouble();

        if (x < y + z && y < x + z && z < x + y) {
            if (x == y && y == z) {
                System.out.println("Triângulo Equilátero");
            } else if (x == y || x == z || y == z) {
                System.out.println("Triângulo Isósceles");
            } else {
                System.out.println("Triângulo Escaleno");
            }
        } else {
            System.out.println("Essas medidas não formam um triângulo");
        }

        dado.close();
    }
}
