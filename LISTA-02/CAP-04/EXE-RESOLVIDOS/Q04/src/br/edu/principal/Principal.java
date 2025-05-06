package br.edu.principal;
import java.util.Scanner;
public class Principal {

	public static void main(String[] args) {
		Scanner dado = new Scanner(System.in);
		double num1,num2,num3;
		System.out.println("Digite o primeiro numero: ");
		num1 = dado.nextDouble();
		
		System.out.println("Digite o segundo numero: ");
		num2 = dado.nextDouble();
		
		System.out.println("Digite o terceiro numero: ");
		num3 = dado.nextDouble();
		 if (num1 < num2 && num1 < num3) {
	            if (num2 < num3) {
	                System.out.println("A ordem crescente é: " + num1 + " - " + num2 + " - " + num3);
	            } else {
	                System.out.println("A ordem crescente é: " + num1 + " - " + num3 + " - " + num2);
	            }
	        }

	        if (num2 < num1 && num2 < num3) {
	            if (num1 < num3) {
	                System.out.println("A ordem crescente é: " + num2 + " - " + num1 + " - " + num3);
	            } else {
	                System.out.println("A ordem crescente é: " + num2 + " - " + num3 + " - " + num1);
	            }
	        }

	        if (num3 < num1 && num3 < num2) {
	            if (num1 < num2) {
	                System.out.println("A ordem crescente é: " + num3 + " - " + num1 + " - " + num2);
	            } else {
	                System.out.println("A ordem crescente é: " + num3 + " - " + num2 + " - " + num1);
	            }
	        }

	        dado.close();
	    }
	}