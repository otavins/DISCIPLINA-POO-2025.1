package br.edu.principal;
import java.util.Scanner;
public class Principal {

	 public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        System.out.println("Digite o salário do funcionário: ");
	        double salario = scanner.nextDouble();

	        if (salario < 500) {
	            double novoSalario = salario * 1.3;
	            System.out.println("Salário reajustado: R$ " + novoSalario);
	        } else {
	            System.out.println("O funcionário não tem direito ao aumento.");
	        }

	        scanner.close();
	    }
	}