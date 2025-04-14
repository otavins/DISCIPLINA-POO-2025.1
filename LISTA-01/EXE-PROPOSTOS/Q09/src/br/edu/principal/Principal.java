package br.edu.principal;
import java.util.Scanner;
public class Principal {
    public static void main(String[] args) {
        Scanner dado = new Scanner(System.in);

        double baseMaior, baseMenor, altura, area;

        System.out.print("Digite a base maior do trapézio: ");
        baseMaior = dado.nextDouble();

        System.out.print("Digite a base menor do trapézio: ");
        baseMenor = dado.nextDouble();

        System.out.print("Digite a altura do trapézio: ");
        altura = dado.nextDouble();

        area = (double) ((baseMaior + baseMenor) * altura) / 2;

        System.out.printf("A área do trapézio é:"+ area);

        dado.close();
    }
}
