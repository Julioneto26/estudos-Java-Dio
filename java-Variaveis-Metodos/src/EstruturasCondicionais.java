import java.util.Scanner;
import java.util.Locale;

public class EstruturasCondicionais{

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        double saldo = 1500;

        System.out.println("O que deseja?");
        System.out.println("1 : Ver Saldo");
        System.out.println("2: Fazer um Saque");

        int iniciar = scanner.nextInt();

        if (iniciar==1) {
            System.out.println("Seu saldo atual é: R$" + saldo);
            System.out.println("Quer continuar para o saque?");
            System.out.println("1: Não");
            System.out.println("2: Sim");

            int iniciar2 = scanner.nextInt();

                if (iniciar2 == 1) {

                    System.out.println("Obrigado Por escolher Nosso Banco. Tenha um Bom dia!");
                    
                    return;
                }

                 else {

                    System.out.println("Qual o valor do Saque?");



                }


        }

        else if (iniciar != 1 && iniciar != 2) {
            
            System.out.println("Por favor selecione numero 1 ou 2 ");

        }
        else {

            System.out.println("Qual o valor do Saque?");

        }

        

        double valorSaque = scanner.nextDouble();
        if (valorSaque>saldo) {

            System.out.println("Saldo Insuficiente! Este é o seu saldo atual: R$" + saldo);
            
        }
        else {

            System.out.println("Saque sendo processado!");

            saldo = saldo - valorSaque;

            System.out.println("Novo saldo: R$" + saldo);

            System.out.println("Obrigado por escolher Nosso banco");


        }

        

    }


}