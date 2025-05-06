package br.edu.principal;
import java.util.Scanner;
public class Principal {

	public static void main(String[] args) {
		Scanner dado = new Scanner(System.in);
		int d1,m1,a1,d2,m2,a2;
		
		System.out.println("Digite a primeira data");
		System.out.println("Dia (dd): ");
		d1 = dado.nextInt();
		System.out.println("Mês (mm): ");
		m1 = dado.nextInt();
		System.out.println("Ano (aaaa): ");
		a1 = dado.nextInt();
		
		System.out.println("Digite a segunda data");
		System.out.println("Dia (dd): ");
		d2 = dado.nextInt();
		System.out.println("Mês (mm): ");
		m2 = dado.nextInt();
		System.out.println("Ano (aaaa): ");
		a2 = dado.nextInt();
		
		if (a1>a2) {
			System.out.println("A maior data é: "+d1+ "-"+m1+"-"+a1);
			
		}
		else if (a2>a1) {
			System.out.println("A maior data é: "+d2+ "-"+m2+"-"+a2);
		}
		else if (m1>m2) {
			System.out.println("A maior data é: "+d1+ "-"+m1+"-"+a1);
		}
		else if (m2>m1) {
			System.out.println("A maior data é: "+d2+ "-"+m2+"-"+a2);
		}
		else if (d1>d2) {
			System.out.println("A maior data é: "+d1+ "-"+m1+"-"+a1);
		}
		else if (d2>d1) {
			System.out.println("A maior data é: "+d2+ "-"+m2+"-"+a2);
		}
		else {
			System.out.println("As datas são iguais!");
		}
		dado.close();
	}

}
