package com.mycompany.ClassificadorTriangulo;
import java.util.Scanner;

public class ClassificadorTriangulo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("--- Classificador de Triângulos ---");
        System.out.print("Digite o lado A: ");
        double ladoA = scanner.nextDouble();
        System.out.print("Digite o lado B: ");
        double ladoB = scanner.nextDouble();
        System.out.print("Digite o lado C: ");
        double ladoC = scanner.nextDouble();
        
        if ((ladoA + ladoB > ladoC) && (ladoA + ladoC > ladoB) && (ladoB + ladoC > ladoA)) {
            
            // Classifica o triângulo quanto aos lados
            if (ladoA == ladoB && ladoB == ladoC) {
                System.out.println("O triângulo é Equilátero (3 lados iguais).");
            } else if (ladoA == ladoB || ladoA == ladoC || ladoB == ladoC) {
                System.out.println("O triângulo é Isósceles (2 lados iguais).");
            } else {
                System.out.println("O triângulo é Escaleno (3 lados diferentes).");
            }
            
        } else {
            System.out.println("Os lados informados não podem formar um triângulo!");
        }
        
        scanner.close();
    }
}
