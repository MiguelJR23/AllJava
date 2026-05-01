package com.mycompany.bhaskara;
import java.util.Scanner;

public class Bhaskara {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Calculadora para Bhaskara");

        System.out.print("Digite o numero de valor A: ");
        double a = scanner.nextDouble();

        System.out.print("Digite o numero de valor B: ");
        double b = scanner.nextDouble();

        System.out.print("Digite o numero do valor C: ");
        double c = scanner.nextDouble();

        // Verificando se é equação do segundo grau
        if (a == 0) {
            System.out.println("Nao e uma equação do segundo grau.");
        } else {

            // Calculando o delta: b² - 4ac
            double delta = Math.pow(b, 2) - 4 * a * c;

            if (delta < 0) {
                System.out.println("A equacao nao possui raizes reais");
            } else {

                // Fórmula de Bhaskara
                double x1 = (-b + Math.sqrt(delta)) / (2 * a);
                double x2 = (-b - Math.sqrt(delta)) / (2 * a);

                System.out.println("Delta: " + delta);
                System.out.println("Raiz x1: " + x1);
                System.out.println("Raiz x2: " + x2);
            }
        }

        scanner.close();
    }
}
