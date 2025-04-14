package br.edu.principal;
import java.util.Scanner;
public class Principal {

	public static void main(String[] args) {
		Scanner dado = new Scanner(System.in);
		 int peso1, peso2, peso3;
		 
		 System.out.println("Digite a nota: ");
		 float nota1, nota2, nota3, media;
		 float soma1, soma2, soma3, total;
		 
		 
		 System.out.println("Digite três notas e deois digite o peso de cada uma: ");
		 
		 nota1 = dado.nextFloat();
		 nota2 = dado.nextFloat();
		 nota3 = dado.nextFloat();
		 peso1 = dado.nextInt();
		 peso2 = dado.nextInt();
		 peso3 = dado.nextInt();
		 
		 soma1 = nota1 * peso1;
		 soma2 = nota2 * peso2;
		 soma3 = nota3 * peso3;
		 total = peso1 + peso2 + peso3;
		 media = (soma1 + soma2 + soma3)/total;
		 
		 System.out.println("O resultado da média é: " + media);
		 
		 dado.close();
	}

}
