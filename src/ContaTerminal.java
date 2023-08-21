import java.text.MessageFormat;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        double balance = 237.48;

        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Por favor, digite as informações solicitadas abaixo!");
            System.out.println("O número da sua agência:");
            int agencynumber = scanner.nextInt();
            
            System.out.println("O número da Conta (informe o dígito, exemplo xxx-x):");
            String accountnumber = scanner.next();
            
            System.out.println("Confirme seu nome:");
            String fullName = scanner.next();

            
            String response = MessageFormat.format(
                "Olá {0}, obrigado por criar uma conta em nosso banco, sua agência é {1}, conta {2} e seu saldo {3} já está disponível para saque.",
                fullName,
                agencynumber,
                accountnumber,
                balance
            );

            System.out.println(response);
        }
    }
}
