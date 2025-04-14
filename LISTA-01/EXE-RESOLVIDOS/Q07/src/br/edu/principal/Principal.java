package br.edu.principal;
import java.util.Scanner;
public class Principal {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		double sal, salreceber, imp;
		
		System.out.println("Digite o seu salário");
		
		sal = sc.nextFloat();
		
		imp = (double) (sal * 0.1);
		
		salreceber = (double) (sal + 50 - imp);
		
		System.out.println("Seu salário vai ser: " + salreceber);

		sc.close();
	}

}
