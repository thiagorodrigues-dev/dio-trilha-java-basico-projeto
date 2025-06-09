import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int numero;//conta
        String agencia;
        String nomeCliente;
        double saldo;

        System.out.println("Por favor, digite o numero da sua conta");
        numero = input.nextInt();
        input.nextLine();//para quebrar o bug do scanner
        System.out.println("Por favor, digite o número da Agência !");
        agencia = input.nextLine();
        System.out.println("Por favor, digite o seu nome");
        nomeCliente = input.nextLine();
        System.out.println("Por favor, digite o saldo da conta");
        saldo = input.nextDouble();

        System.out.println("Olá, " + nomeCliente + " obrigado por criar uma conta em nosso banco, sua agência é " + agencia + ", conta " + numero + " e seu saldo " + saldo + " já está disponível para saque");
    }
}
