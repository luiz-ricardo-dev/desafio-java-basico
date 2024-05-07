import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        //Criano o objeto scanner
        Scanner scanner = new Scanner(System.in);
       
        //Declaração das variaveis.
         int numero;
         String agencia;
         String nomeCliente;
         double saldo;

         //Texto na tela e recebimento dos dados
        System.out.println("Digite um numero para a conta: ");
            numero = scanner.nextInt();

        System.out.println("Digite um numero para a agencia: ");
            agencia = scanner.next();

        System.out.println("Digite o seu nome: ");
            nomeCliente = scanner.next();

        System.out.println("Digite o valor do seu primeiro depósito: ");
             saldo = scanner.nextDouble();


     //Saida com os dados        
    System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é "+ agencia +", conta "+ numero +" e seu saldo "+ saldo +" já está disponível para saque");
    }
}
