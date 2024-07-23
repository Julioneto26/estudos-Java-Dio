import java.util.Scanner;
import java.util.Locale;

public class EstruturasCondicionais{

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        double saldo = 1500;

        System.out.println("O que deseja? 1: Mostra Saldo 2: Fazer um saque");

        int iniciar = scanner.nextInt();

        if (iniciar==1) {
            System.out.println(saldo);

        }

        System.out.println("Qual o valor do Saque?");

        double valorSaque = scanner.nextDouble();
        if (valorSaque>saldo) {

            System.out.println("Saldo Insuficiente! Este é o seu saldo atual:" + saldo);
            
        }

        System.out.println("Saque sendo processado!");

    }


}