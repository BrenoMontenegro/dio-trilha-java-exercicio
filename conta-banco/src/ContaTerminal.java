import java.util.Scanner;
public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        int numero_conta = 0;
        String agencia = "";
        String nome_cliente = "";
        double saldo = 0;

        Scanner meuScan = new Scanner(System.in);

        System.out.println("Digite o número da conta: ");
        numero_conta = meuScan.nextInt();

        System.out.println("Digite o número da agência: ");
        agencia = meuScan.next();

        System.out.println("Digite seu nome: ");
        nome_cliente = meuScan.next();

        System.out.println("Digite o saldo disponível: ");
        saldo = meuScan.nextDouble();

        //INFORMAÇÕES ABAIXO:

        System.out.println("Olá, " + nome_cliente + "!");
        System.out.println("Sua conta é: " + numero_conta + " e sua agência: " + agencia);
        System.out.println("Verificamos seu saldo disponível: R$" + saldo);

        //FECHANDO O SCANNER
        meuScan.close();
    }
}
