package br.edu.principal;
import java.util.Scanner;
public class Principal {

	public static void main(String[] args) {
		Scanner dado = new Scanner(System.in);
		float sal, perc, aumento, novosal;
		
		System.out.println("Digite seu salario e o percentual: ");
		
		sal = dado.nextFloat();
		perc = dado.nextFloat();
		
		aumento = sal * (perc/100);
		System.out.println("O aumento foi: " + aumento);
		
		novosal = sal + aumento;
		 System.out.println("Seu novo salário é: " + novosal);
		 
		 dado.close();
	}

}
