import java.util.Scanner;

public class Frutas {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um número de 1 a 8: ");
        int numero = scanner.nextInt();

        switch (numero) {
            case 1 -> System.out.println("Maçã");
            case 2 -> System.out.println("Banana");
            case 3 -> System.out.println("Laranja");
            case 4 -> System.out.println("Manga");
            case 5 -> System.out.println("Melão");
            case 6 -> System.out.println("Mamão");
            case 7 -> System.out.println("Morango");
            case 8 -> System.out.println("Guaraná");
            default -> System.out.println("Fruta inválida");
        }

        scanner.close();
    }
}
