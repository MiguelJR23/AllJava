package com.mycompany.CalculadorMedia;
import java.util.Scanner;

public class CalculadorMedia {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("--- Calculadora de Média ---");
        System.out.print("Quantos números você deseja informar? ");
        int quantidade = scanner.nextInt();
        
        if (quantidade > 0) {
            double soma = 0;
            
            // Loop para receber cada número com base na quantidade informada
            for (int i = 1; i <= quantidade; i++) {
                System.out.print("Digite o " + i + "º número: ");
                double numero = scanner.nextDouble();
                soma += numero; // Acumula o valor informado
            }
            
            // Calcula e exibe a média final
            double media = soma / quantidade;
            System.out.printf("\nA soma total é: %.2f\n", soma);
            System.out.printf("A média dos %d números é: %.2f\n", quantidade, media);
            
        } else {
            System.out.println("Quantidade inválida! Informe um número maior que zero.");
        }
        
        scanner.close();
    }
}
