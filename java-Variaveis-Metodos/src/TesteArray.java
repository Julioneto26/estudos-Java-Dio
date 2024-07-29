import java.util.Scanner;
import java.util.Locale;

public class TesteArray {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
        
        System.out.println("digite um número de 1 a 26");

        int alfabeto = scanner.nextInt();

        if (alfabeto<1 || alfabeto>26) {

            System.out.println("Apenas numeros entre 1 e 26");

            return;
        }

        String letras[] = {"A","B","C","D","E","F","G","H","I","J","K","L","M","N","O","P","Q","R","S","T","U","V","X","W","Y","Z"}; 

        for (int x=0; x<alfabeto; x++){

            System.out.println(letras[x]);

        }

        System.out.println(letras);



        
    }
}
