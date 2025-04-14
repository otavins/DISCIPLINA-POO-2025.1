package br.edu.principal;
import java.util.Scanner;
public class Principal {

	public static void main(String[] args) {
		Scanner dado = new Scanner(System.in);
		
		float sal, salreceber, grat, imp;
		
		System.out.println("Digite seu salário: ");
		sal = dado.nextFloat();
		
		grat = (float) (sal * (5.0/100));
		imp = (float) (sal * (7.0/100));
		
		salreceber = sal + grat - imp;
		
		System.out.println("o salário que você vai receber é: " + salreceber);
		
		dado.close();

	}

}
