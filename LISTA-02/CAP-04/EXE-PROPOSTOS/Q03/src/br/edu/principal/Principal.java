package br.edu.principal;
import java.util.Scanner;
public class Principal {

public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

 
        System.out.println("Digite o primeiro número:");
        int numero1 = scanner.nextInt();

        System.out.println("Digite o segundo número:");
        int numero2 = scanner.nextInt();

        
        if (numero1 < numero2) {
            System.out.println("O menor número é: " + numero1);
        } else if (numero2 < numero1) {
            System.out.println("O menor número é: " + numero2);
        } else {
            System.out.println("Os dois números são iguais.");
        }

        
        scanner.close();
    }
}


