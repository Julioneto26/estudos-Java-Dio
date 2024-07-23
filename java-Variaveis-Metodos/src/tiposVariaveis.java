import java.util.Scanner;
public class tiposVariaveis {
    
       public static void main(String[] args) throws Exception {
        Scanner ler = new Scanner(System.in); 

        System.out.println("teste de escrita");

        System.out.println("informe o seu salario mais alto, sem virgulas ou pontos");

        int salarioMaximo = ler.nextInt();

        System.out.println("informe o seu salario mais baixo, sem virgulas ou pontos");

        int salarioMinimo = ler.nextInt();

        System.out.println(" Sua média salarial baseado no maior e menor salario é de :");
        System.out.println((salarioMinimo + salarioMaximo) / 2);

        System.out.println(" O valor de sua hora trabalhada no mes de menor salario foi de : (mes de 190 horas)");
        System.out.println(salarioMinimo / 190);

        System.out.println(" O valor de sua hora trabalhada no mes de maior salario foi de : (mes de 190 horas)");
        System.out.println(salarioMaximo / 190);

        System.out.println(" O valor médio de sua hora trabalhada com base no maior e menor salario é de : (mes de 190 horas)");
        System.out.println(((salarioMinimo / 190)+(salarioMaximo / 190))/2);


        // tipos de variaveis primitivos
        // String representa texto

        double salarioMinimo2 = 2500;

        int numero = 5;

        double salarioFracionado = 2500.66;

        numero = 15;

        String string = "teste de texto com variavel string";

        final int paciencia = 2;

        boolean consideraJovem = false; 

        char sexo = 'M';
    }
}
