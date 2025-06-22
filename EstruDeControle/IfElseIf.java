
import java.util.Scanner;

public class IfElseIf {

    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite a nota: ");

        double nota = entrada.nextDouble();

        if(nota > 10 || nota < 0) {
            System.out.println("Nota inválida!");
        } 
        else if (nota >=8.1) {
            System.out.println("Voçê tirou um A, Parabéns!");
        } 
        else if (nota >= 5.1 ) {
            System.out.println("Voçê tirou um B, Bom Trabalho!");
        }
        else if (nota >= 3.1) {
            System.out.println("Voçê tirou um C, Poderia ser melhor!");
        }
        else if (nota >=1.0 ) 
        { 
            System.out.println("Voçê tirou um D, Ruim!");
        }
    
        System.out.println("Fim do programa!");
        entrada.close();
    }
}


