package com.mycompany.ConversorTemperatura;
import java.util.Scanner;

public class ConversorTemperatura {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("--- Conversor de Temperatura ---");
        System.out.println("1. Celsius para Fahrenheit");
        System.out.println("2. Fahrenheit para Celsius");
        System.out.print("Escolha uma opção (1 ou 2): ");
        int opcao = scanner.nextInt();
        
        if (opcao == 1) {
            System.out.print("Digite a temperatura em Celsius: ");
            double celsius = scanner.nextDouble();
            double fahrenheit = (celsius * 9 / 5) + 32;
            System.out.printf("%.1f°C é igual a %.1f°F\n", celsius, fahrenheit);
        } else if (opcao == 2) {
            System.out.print("Digite a temperatura em Fahrenheit: ");
            double fahrenheit = scanner.nextDouble();
            double celsius = (fahrenheit - 32) * 5 / 9;
            System.out.printf("%.1f°F é igual a %.1f°C\n", fahrenheit, celsius);
        } else {
            System.out.println("Opção inválida!");
        }
        
        scanner.close();
    }
}
