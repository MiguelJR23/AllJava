package com.mycompany.CalculadoraIMC;
import java.util.Scanner;

public class CalculadoraIMC {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("--- Calculadora de IMC ---");
        System.out.print("Digite seu peso em kg (ex: 70,5): ");
        double peso = scanner.nextDouble();
        System.out.print("Digite sua altura em metros (ex: 1,75): ");
        double altura = scanner.nextDouble();
        
        // Calcula o IMC: Peso / (Altura * Altura)
        double imc = peso / (altura * altura);
        System.out.printf("Seu IMC é: %.2f\n", imc);
        
        if (imc < 18.5) {
            System.out.println("Status: Abaixo do Peso");
        } else if (imc >= 18.5 && imc <= 24.99) {
            System.out.println("Status: Peso Ideal");
        } else {
            System.out.println("Status: Está acima do peso ideal");
        }
        
        scanner.close();
    }
}
