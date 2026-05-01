import java.util.Scanner;

public class BilhetesTransporte {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Escolha o tipo de transporte digitando o numero correspondente:");
        System.out.println("1 - Onibus urbano (R$ 4,40)");
        System.out.println("2 - Metro (R$ 5,00)");
        System.out.println("3 - Trem intermunicipal (R$ 6,50)");
        System.out.println("4 - Onibus rodoviario (R$ 12,00)");

        int opcao = input.nextInt();
        double preco = 0;

        switch (opcao) {
            case 1:
                preco = 4.40;
                break;
            case 2:
                preco = 5.00;
                break;
            case 3:
                preco = 6.50;
                break;
            case 4:
                preco = 12.00;
                break;
            default:
                System.out.println("Opcao invalida! Reinicie o programa e tente novamente.");
                return;
        }

        System.out.print("Digite a quantidade de bilhetes: ");
        int quantidade = input.nextInt();
        double total = preco * quantidade;
        System.out.println("Valor total da compra: R$ " + total);
    }
}
