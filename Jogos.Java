import java.util.Scanner;

public class JogosFavoritos {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um número de 1 a 8: ");
        int numero = scanner.nextInt();

        switch (numero) {
            case 1 -> System.out.println("Minecraft");
            case 2 -> System.out.println("FIFA");
            case 3 -> System.out.println("Fortnite");
            case 4 -> System.out.println("Call of Duty");
            case 5 -> System.out.println("The Sims");
            case 6 -> System.out.println("ARK");
            case 7 -> System.out.println("CS:GO");
            case 8 -> System.out.println("DOOM");
            default -> System.out.println("Jogo não encontrado");
        }

        scanner.close();
    }
}
