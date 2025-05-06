package br.edu.principal;
import java.util.Scanner;
public class Principal {

	public static void main(String[] args) {
		 Scanner dado = new Scanner(System.in);

	        double sal, novo_sal, boni, aux;
	        System.out.println("Digite seu salario: ");
	        sal = dado.nextDouble();

	        if (sal <= 500) {
	            boni = (double)  (sal * 0.05);
	        } 
	        
	        else if (sal <= 1200) {
	            boni = (double) (sal * 0.12);
	        } 
	        
	        else {
	            boni = 0;
	        }

	        if (sal <= 600) {
	            aux = 150;
	        } 
	        
	        else {
	            aux = 100;
	        }

	        novo_sal = (double) (sal + boni + aux);
	        System.out.println(novo_sal);

	        dado.close();
	    }
	}
