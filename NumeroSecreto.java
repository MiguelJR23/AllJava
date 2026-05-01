package com.mycompany.numerosecreto;

import java.util.Random;
import java.util.Scanner;

public class NumeroSecreto {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        Random variavel = new Random(); // Vai criar o número aleatório e o sorteia
        int NumeroSecreto = variavel.nextInt(10) + 1;
        int tentativa; // É o que vai lembrar o palpite do usuário
        int contador = 0; // Conta quantos palpites o usuário fez

        do { // Começa o loop aqui
            System.out.println("Digite um numero entre 1 e 10:");
            tentativa = entrada.nextInt();
            contador++;

            if (tentativa < NumeroSecreto) { // Se o palpite for menor que o número secreto
                System.out.println("Um pouquinho mais alto...");
            } else if (tentativa > NumeroSecreto) { // Aqui se for maior
                System.out.println("So um pouquinho mais baixo...");
            } else {
                System.out.println("Isso mesmo, seu palpite esta correto!");
                System.out.println("Voce precisou de " + contador + " tentativas.");
            }

        } while (tentativa != NumeroSecreto);
    }
}
