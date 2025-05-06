package br.edu.principal;
import java.util.Scanner;
public class Principal {

	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        

	        double nota1, nota2, media;

	        
	        System.out.println("Digite a primeira nota:");
	        nota1 = scanner.nextDouble();
	        
	        System.out.println("Digite a segunda nota:");
	        nota2 = scanner.nextDouble();
	        
	        
	        media = (nota1 + nota2) / 2;

	        
	        System.out.println("Média do aluno: " + media);

	        
	        if (media >= 0 && media < 3) {
	            System.out.println("Reprovado");
	        } else if (media >= 3 && media < 7) {
	            System.out.println("Exame");
	        } else if (media >= 7 && media <= 10) {
	            System.out.println("Aprovado");
	        } else {
	            System.out.println("Nota inválida. As notas devem estar entre 0 e 10.");
	        }

	        scanner.close();
	    }
	}