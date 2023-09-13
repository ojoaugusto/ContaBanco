import java.util.Scanner;

public class ContaTerminal {


    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Por favor, digite o número da Agência: ");
        int agencia = sc.nextInt();

        System.out.println("Por favor, digite o número da Conta: ");
        String conta = sc.next();

        System.out.println("Por favor, digite o nome do Cliente: ");
        String primeiroNome = sc.next();

        System.out.println("Por favor, digite o sobrenome do Cliente: ");
        String segundoNome = sc.next();

        System.out.println("Por favor, digite o saldo da conta: ");
        double saldo;
        saldo = sc.nextDouble();


        System.out.println("Olá " + primeiroNome.concat(" ").concat(segundoNome) + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia +", conta " + conta + " e seu saldo"+ saldo + " já está disponível para saque");

    }
}
