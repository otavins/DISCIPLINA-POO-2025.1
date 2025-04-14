package br.edu.principal;
import java.util.Scanner;
public class Principal {

	public static void main(String[] args) {
		Scanner dado = new Scanner(System.in);
		float nota1, nota2, nota3, media;
		
		System.out.println("Digite três notas: ");
		nota1 = dado.nextFloat();
		nota2 = dado.nextFloat();
		nota3 = dado.nextFloat();
		
		media = (nota1 + nota2 + nota3) /3;
		
		System.out.println("A média é: " + media);
		
		dado.close();
	}

}
