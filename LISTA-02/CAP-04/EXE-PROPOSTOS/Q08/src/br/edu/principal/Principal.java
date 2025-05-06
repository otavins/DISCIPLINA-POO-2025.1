package br.edu.principal;
import java.util.Scanner;
public class Principal {

	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o salário do funcionário: ");
        double salario = scanner.nextDouble();
        double salarioReajustado;

        if (salario <= 300) {
            salarioReajustado = salario * 1.35;  
        } else {
            salarioReajustado = salario * 1.15;  
        }

        System.out.printf("O salário reajustado é: R$ %.2f\n", salarioReajustado);
        
        scanner.close();
    }
}

