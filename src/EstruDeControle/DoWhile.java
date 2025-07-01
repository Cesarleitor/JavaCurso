
import java.util.Scanner;

public class DoWhile {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        String texto = "";
        do {
            System.out.println("Você precisa falar a  palavra mágica: ");
            System.out.print("Quer Sair? ");
            texto = entrada.nextLine();
        }
         while (!texto.equalsIgnoreCase("Por favor"));


         System.out.println("Obrigado por falar a palavra mágica!");
        entrada.close();
        
    }

}
