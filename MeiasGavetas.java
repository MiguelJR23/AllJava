package com.mycompany.meiasgavetas;
import java.util.*;

public class MeiasGavetas {
    public static void main(String[] args) {
        int[] meias = {2, 4, 1, 3, 5};
        int total = 0;

        System.out.println("Voce esta contando as meias...\n");
        for (int i = 0; i < meias.length; i++) {
            try {
                Thread.sleep(1000); // pausa de 1 segundo para cada linha
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("Gaveta " + (i + 1) + ": " + meias[i] + " meias");
            total += meias[i];
        }
        try {
            Thread.sleep(1500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("\nVoce tem " + total + " meias");
    }
}
