package br.edu.principal;

public class Principal {
    public static void main(String[] args) {
        for (int numero = 1; numero <= 10; numero++) {
            System.out.println("Tabuada do " + numero + ":");
            for (int i = 0; i <= 10; i++) {
                System.out.println(numero + " × " + i + " = " + (numero * i));
            }
            System.out.println(); 
        }
    }
}