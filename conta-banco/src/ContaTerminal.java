import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        String nomeCliente, agencia;
        int numero;
        double saldo;

        System.out.println("Informe seu nome: ");
        nomeCliente = scanner.nextLine();
        System.out.println("Por favor, digite o número da conta: ");
        numero = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Por favor, digite o número da Agência: ");
        agencia = scanner.nextLine();
        System.out.println("Por favor, informe o seu saldo: ");
        saldo = scanner.nextDouble();

        System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia + ", conta " + numero + " e seu saldo " + saldo + " já está disponível para saque.");

        scanner.close();
    }
}
