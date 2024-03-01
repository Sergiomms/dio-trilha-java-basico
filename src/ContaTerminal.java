import java.util.Scanner;

public class ContaTerminal {
  public static void main(String[] args) throws Exception {

    int numero = 0;
    String agencia = "";
    String nomeCliente = "";
    double saldo = 0.0;

    Scanner sc = new Scanner(System.in);

    System.out.println("Por favor, digite o número da conta!");
    numero = sc.nextInt();

    System.out.println("Digite o número da agência com digito!");
    agencia = sc.next();

    System.out.println("Digite o nome do cliente!");
    nomeCliente = sc.next();

    System.out.println("Digite o saldo disponível!");
    saldo = sc.nextDouble();

    sc.close();

    System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, " +
                      "sua agência é: " + agencia + ", conta: " + numero + " e seu saldo: " + saldo +
                      " já está disponível para saque." );

  }
}
