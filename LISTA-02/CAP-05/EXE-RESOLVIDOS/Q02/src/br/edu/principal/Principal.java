package br.edu.principal;
import java.util.Scanner;
public class Principal {

	public static void main(String[] args) {
		Scanner dado = new Scanner(System.in);
		double salario, aumento, novo_sal, cargo;
		
		System.out.println("Digite o cargo do funcionario (1,2,3,4 ou 5): ");
		cargo = dado.nextDouble();
		System.out.println("Digite o valor do salario: ");
		salario = dado.nextDouble();
		
		if (cargo == 1) {
			System.out.println("O cargo é Escriturário");
			aumento = (double)  ((salario * 50) / 100);
			System.out.println("O valor do aumento é: "+ aumento);
			novo_sal = (double) (salario + aumento);
			System.out.println("O novo salário é: "+ novo_sal);
			
		}
		else if (cargo == 2) {
			System.out.println("O cargo é Secretário");
			aumento = (double)  ((salario * 35) / 100);
			System.out.println("O valor do aumento é: "+ aumento);
			novo_sal = (double) (salario + aumento);
			System.out.println("O novo salário é: "+ novo_sal);
		}
		else if (cargo == 3) {
			System.out.println("O cargo é Caixa");
			aumento = (double)  ((salario * 20) / 100);
			System.out.println("O valor do aumento é: "+ aumento);
			novo_sal = (double) (salario + aumento);
			System.out.println("O novo salário é: "+ novo_sal);
		}
		else if (cargo == 4) {
			System.out.println("O cargo é Gerente");
			aumento = (double)  ((salario * 10) / 100);
			System.out.println("O valor do aumento é: "+ aumento);
			novo_sal = (double) (salario + aumento);
			System.out.println("O novo salário é: "+ novo_sal);
		}
		else if (cargo == 5) {
			System.out.println("O cargo é Diretor");
			aumento = (double)  ((salario * 0) / 100);
			System.out.println("O valor do aumento é: "+ aumento);
			novo_sal = (double) (salario + aumento);
			System.out.println("O novo salário é: "+ novo_sal);
		}
		else {
			System.out.println("cargo inexistente!");
		}
		dado.close();
	}

}
