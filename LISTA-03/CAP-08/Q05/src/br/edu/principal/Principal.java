package br.edu.principal;

import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
       
        System.out.println("Digite o número de termos da série: ");
        int numTermos = scanner.nextInt();
        System.out.println("Digite o valor de X: ");
        double x = scanner.nextDouble();
        
        
        double s = 0; 
        int denominador = 1;
        
        
        for (int i = 1; i <= numTermos; i++) {
            int expoente = i + 1;
            double fat = 1;
            
            
            for (int j = 1; j <= expoente; j++) {
                fat *= j;
            }
            
            
            if (expoente % 2 == 0) {
                s -= Math.pow(x, expoente) / fat; 
            } else {
                s += Math.pow(x, expoente) / fat; 
            }

            
            if (denominador == 4) {
                denominador = -1;
            } else if (denominador == 1) {
                denominador = 1;
            }

           
            if (denominador == 1) {
                denominador = 2;
            } else {
                denominador = 3;
            }
        }

        System.out.println("O valor da série é: " + s);
        
        scanner.close();
    }
}