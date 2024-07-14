import java.util.Scanner;
import java.util.Locale;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        //declarando Variavel
        double saldo = 0.0;
        int numero = 0;
        String agencia = "";
        String nomeCliente = "";

        //chamando Scanner
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US); //formatando no padrao americano

        //corpo do sistema
        
        System.out.println("Por favor, digite o número da Agência !");
        numero = scanner.nextInt();

        System.out.println(" ");

        System.out.println("Digite os quatros ultimos digitos da agencia: ");
        agencia = scanner.next();

        System.out.println(" ");

        System.out.println("Digite seu nome: ");
        nomeCliente = scanner.next();

        System.out.println("");

        System.out.println("Digite seu saldo: ");
        saldo = scanner.nextDouble();

        System.out.println(" ");

        System.out.println("Olá " + nomeCliente +", obrigado por criar uma conta em nosso banco, sua agência é " + agencia + ", conta " + numero + " e seu saldo " + saldo + " já está disponível para saque");

    }
}
