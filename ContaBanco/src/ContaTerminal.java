import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        Scanner reader = new Scanner(System.in).useLocale(Locale.US);
        NumberFormat nf = NumberFormat.getNumberInstance(Locale.US);
        DecimalFormat df = (DecimalFormat) nf;
        df.applyPattern("#,#00.0#");
        System.out.println("Por favor, digite o número da conta!");
        int numero = reader.nextInt();
        reader.nextLine();
        System.out.println("Por favor, digite o código da Agência!");
        String agencia = reader.nextLine();
        System.out.println("Por favor, digite o nome do Cliente!");
        String nomeCliente = reader.nextLine();
        System.out.println("Por favor, digite o valor do Saldo!");
        double saldo = reader.nextDouble();
        System.out.printf("Olá %s, obrigado por criar uma conta em nosso banco, sua agência é %s," +
                " conta %d e seu saldo %s já está disponível para saque.\n", nomeCliente, agencia, numero,
                df.format(saldo));
        reader.close();

    }
}
