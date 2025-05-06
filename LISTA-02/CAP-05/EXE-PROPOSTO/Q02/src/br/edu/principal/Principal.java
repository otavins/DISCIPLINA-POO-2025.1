package br.edu.principal;

public class Principal {
    public static void main(String[] args) {
        double preco = 5.0;
        int ingressosIniciais = 120;
        int aumentoPorDesconto = 26;
        double despesaFixa = 200.0;

        double lucroMaximo = Double.NEGATIVE_INFINITY;
        double precoLucroMaximo = 0.0;
        int ingressosLucroMaximo = 0;

        System.out.printf("%-10s %-20s %-10s\n", "Preço", "Ingressos Vendidos", "Lucro");
        System.out.println("--------------------------------------------------");

        for (int i = 0; i <= 8; i++) {
            double precoAtual = 5.0 - (i * 0.5);
            int ingressosVendidos = ingressosIniciais + (i * aumentoPorDesconto);
            double receita = precoAtual * ingressosVendidos;
            double lucro = receita - despesaFixa;

            System.out.printf("R$ %-8.2f %-20d R$ %-10.2f\n", precoAtual, ingressosVendidos, lucro);

            if (lucro > lucroMaximo) {
                lucroMaximo = lucro;
                precoLucroMaximo = precoAtual;
                ingressosLucroMaximo = ingressosVendidos;
            }
        }

        System.out.println("\nLucro máximo esperado:");
        System.out.printf("Lucro: R$ %.2f\n", lucroMaximo);
        System.out.printf("Preço do ingresso: R$ %.2f\n", precoLucroMaximo);
        System.out.printf("Ingressos vendidos: %d\n", ingressosLucroMaximo);
    }
}