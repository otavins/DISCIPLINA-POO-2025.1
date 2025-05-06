package br.edu.principal;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner dado = new Scanner(System.in);

        double pre, venda, novo_pre;

        System.out.print("Digite o preço do produto: ");
        pre = dado.nextDouble();

        System.out.print("Digite a quantidade vendida: ");
        venda = dado.nextDouble();
        
        if (venda < 500 || pre < 30) {
        	novo_pre = (double) (pre + (0.1 * pre));
        	 System.out.println(novo_pre);
        }
        else if ((venda >= 500 && venda < 1200) || (pre >= 30 && pre< 80)) {
        	novo_pre = (double) (pre + (0.15 *pre));
        	 System.out.println(novo_pre);
        	
        }
        else if (venda >= 1200 || pre >= 80) {
            novo_pre = pre - (0.20 * pre);
            System.out.println(novo_pre);
        }
       
        
        dado.close();
	}

}
