
import java.util.Scanner;

public class WhileIndeterminado {

    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in); 
              String valor = "";
              while (!valor.equalsIgnoreCase("sair")) {
                System.out.println("Digite a sua dúvida: ");
                 valor = entrada.nextLine();
                System.out.println("Para fechar digite sair!");
               

              }
        
   entrada.close();
    }
}
