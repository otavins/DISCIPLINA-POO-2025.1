package br.edu.principal;
import java.util.Scanner;
public class Principal {

	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o saldo médio do cliente: ");
        double saldoMedio = scanner.nextDouble();
        double credito;

        if (saldoMedio > 400) {
            credito = saldoMedio * 0.30;
        } else if (saldoMedio >= 300) {
            credito = saldoMedio * 0.25;
        } else if (saldoMedio >= 200) {
            credito = saldoMedio * 0.20;
        } else {
            credito = saldoMedio * 0.10;
        }

        System.out.println("Saldo médio:"+ saldoMedio);
        System.out.println("Valor do crédito:"+ credito);
        
        scanner.close();
    }
}




