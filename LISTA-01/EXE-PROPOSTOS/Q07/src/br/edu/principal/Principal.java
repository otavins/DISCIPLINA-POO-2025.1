package br.edu.principal;
import java.util.Scanner;
public class Principal {

	public static void main(String[] args) {
		Scanner dado = new Scanner(System.in);
		
		double peso, pesoEng, pesoMag;
		
		System.out.println("Digite seu peso: ");
		peso = dado.nextDouble();
		
		pesoEng = (double) (peso +(peso * 0.15));
		pesoMag = (double) (peso -(peso * 0.20));
		
		System.out.println("Se engordar 15%, seu peso será: " + pesoEng);
		System.out.println("Se emagrecer 20%, seu peso será: " + pesoMag);
		
		dado.close();
	}

}
