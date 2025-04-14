package br.edu.principal;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner dado = new Scanner(System.in);
        
        double area, raio;
        
        System.out.print("Digite o raio do círculo: ");
        raio = dado.nextDouble();
        
      
        area =  3.1415 * Math.pow(raio, 2);
        
       
        System.out.printf("A área do círculo é: "+ area);
        
        dado.close();
    }
}
