package com.mycompany.saboressuco;
import java.util.Scanner;

public class SaboresSuco {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        String[] sabores = new String[3];

        for (int i = 0; i < 3; i++) {
            System.out.println("Digite o " + (i + 1) + "º sabor de suco que você gosta:");
            sabores[i] = entrada.nextLine();
        }

        System.out.println("\nListando os sabores, um segundo...\n");
        for (int i = 0; i < 3; i++) { // Mostra os sabores um por um, com intervalo de 1 segundo (1000 ms)
            try {
                Thread.sleep(1000); // Aqui faz uma pausa de 1 segundo entre cada sabor
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("- " + sabores[i]);
        }
        System.out.println("\nSeria uma boa mistura, mas so se fosse natural");
    }
}
