package com.mycompany.produtoslimpeza;
import java.util.Scanner;

public class ProdutosLimpeza {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
      
        double[] precos = {5.50, 3.20, 4.00, 2.80}; // Preços dos produtos de limpeza
        double total = 0;
        for (int i = 0; i < precos.length; i++) {
            total += precos[i];
        }
        System.out.println("Precos dos produtos:");
        for (int i = 0; i < precos.length; i++) {
            try {
                Thread.sleep(1000); // pausa de 1 segundo antes de mostrar cada produto
            } catch (InterruptedException e) {
            }
            System.out.println("Produto " + (i + 1) + ": R$ " + precos[i]);
        }
        try {
            Thread.sleep(1000); // pequena pausa antes de mostrar o total
        } catch (InterruptedException e) {
        }
      
        System.out.println("\nValor total da compra: R$ " + total);
        System.out.println("\nDigite com que tipo de dinheiro voce pagara:");
        System.out.println("1 para R$");
        System.out.println("2 para €(euro)");
        System.out.println("3 para BTC(Bitcoin)");
        int escolha = entrada.nextInt();

        double valorConvertido;
        switch (escolha) {
            case 1 ->
                System.out.println("Voce pagara em Reais: R$ " + total);
            case 2 -> {
                double taxaEuroParaReal = 6.30; // Usei: 1 € ≈ R$ 6,30
                valorConvertido = total / taxaEuroParaReal;
                System.out.printf("Valor em Euros: € %.2f%n", valorConvertido);
            }
            case 3 -> { // Pagando em Bitcoin
                double precoBitcoinUSD = 117000.0; // Usei um valor fixo de comparação: 1 BTC ≈ US$117.000
                double taxaDolarParaReal = 5.0; // simplifiquei: US$1 ≈ R$5,00
                double precoBitcoinReal = precoBitcoinUSD * taxaDolarParaReal;
                valorConvertido = total / precoBitcoinReal;
                System.out.printf("Valor em Bitcoin: ≈ %.4e BTC%n", valorConvertido);
            }
            default -> System.out.println("Opcao invalida.");
        }
        entrada.close();
    }
}
