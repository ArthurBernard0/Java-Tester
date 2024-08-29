import java.util.Scanner;

public class ContaBanco {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.err.print("Digite o número da Conta (Ex: 00012345-6): "); //Número conta 
        String numeroConta = scanner.nextLine();

        System.out.print("Digite o número da Agência (Ex: 1234): "); //Número da Agência
        String numeroAgencia = scanner.nextLine();

        System.out.print("Digite o seu Nome: "); //Nome do Usuario
        String nomeCliente = scanner.nextLine();
        scanner.nextLine();

        System.out.print("Digite seu Saldo (Ex: 100): "); //Saldo da conta
        double saldo = scanner.nextDouble();
       
        //Exibir os dados 
        System.out.printf("Olá %s, obrigado por criar uma conta em nosso banco, sua agência é %s, conta %s e seu saldo R$%.2f já está disponível pra saque.%n",
                                nomeCliente, numeroAgencia, numeroConta, saldo);

        scanner.close();

    }
}
