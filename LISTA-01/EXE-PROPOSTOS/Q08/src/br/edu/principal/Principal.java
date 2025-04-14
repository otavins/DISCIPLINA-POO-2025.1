package br.edu.principal;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner dado = new Scanner(System.in);

        double pesoKg, pesoGramas;

        System.out.print("Digite seu peso em quilos: ");
        pesoKg = dado.nextDouble();

        pesoGramas = (double) (pesoKg * 1000);

        System.out.printf("Seu peso em gramas é:" + pesoGramas);

        dado.close();
    }
}

