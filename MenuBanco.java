import java.util.Scanner;

public class MenuBanco {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double saldo = 1000.00; // saldo inicial
        
        try {
            System.out.println("MENU DE ATENDIMENTO BANCÁRIO");
            System.out.println("1 - Consultar saldo");
            System.out.println("2 - Sacar dinheiro");
            System.out.println("3 - Depositar dinheiro");
            System.out.println("4 - Encerrar atendimento");
            System.out.print("Digite a opção desejada: ");
            
            int opcao = input.nextInt();
            switch (opcao) {
                case 1:
                    System.out.println("Seu saldo atual é: R$ " + saldo);
                    break;
                case 2:
                    System.out.print("Digite o valor para saque: ");
                    double saque = input.nextDouble();
                    if (saque > saldo) {
                        System.out.println("Erro: saldo insuficiente!");
                    } else {
                        saldo -= saque;
                        System.out.println("Saque realizado com sucesso. Novo saldo: R$ " + saldo);
                    }
                    break;
                case 3:
                    System.out.print("Digite o valor para depósito: ");
                    double deposito = input.nextDouble();
                    saldo += deposito;
                    System.out.println("Depósito realizado com sucesso. Novo saldo: R$ " + saldo);
                    break;
                case 4:
                    System.out.println("Atendimento encerrado. Obrigado!");
                    break;
                default:
                    System.out.println("Operação inválida!");
            }
        } catch (Exception e) {
            System.out.println("Erro: entrada inválida. Digite apenas números!");
        } finally {
            input.close();
        }
    }
}
