package br.edu.principal;
import java.util.Scanner;
public class Principal {
    public static void main(String[] args) {
        Scanner dado = new Scanner(System.in);

        int op;
        double sal, imp = 0, aum = 0, novo_sal;
        

        System.out.println("MENU DE OPÇÕES");
        System.out.println("1 – IMPOSTO");
        System.out.println("2 – NOVO SALÁRIO");
        System.out.println("3 – CLASSIFICAÇÃO");
        System.out.print("DIGITE A OPÇÃO DESEJADA: ");
        op = dado.nextInt();

        if (op == 1) {
        	 System.out.println("Digite o salario do funcionario para mostrar o imposto: ");
            sal = dado.nextDouble();
            if (sal < 500)
                imp = sal * 0.05;
            if (sal >= 500 && sal <= 850)
                imp = sal * 0.10;
            if (sal > 850)
                imp = sal * 0.15;
            System.out.println(imp);
        }

        if (op == 2) {
        	System.out.println("Digite o salario do funcionario para mostrar o novo salario: ");
            sal = dado.nextDouble();
            if (sal > 1500)
                aum = 25;
            if (sal >= 750 && sal <= 1500)
                aum = 50;
            if (sal >= 450 && sal < 750)
                aum = 75;
            if (sal < 450)
                aum = 100;
            novo_sal = (double) (sal + aum);
            System.out.println(novo_sal);
        }

        if (op == 3) {
        	System.out.println("Digite o salario do funcionario para mostrar sua classificação: ");
            sal = dado.nextDouble();
            if (sal <= 700)
                System.out.println("Mal Remunerado");
            if (sal > 700)
                System.out.println("Bem Remunerado");
        }

        if (op < 1 || op > 3) {
            System.out.println("Opção Inválida");
        }

        dado.close();
    }
}
