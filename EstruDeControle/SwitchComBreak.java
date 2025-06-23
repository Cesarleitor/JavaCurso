
import java.util.Scanner;

public class SwitchComBreak {

    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);

        String conceito = "";
        System.out.println("Informe a nota do aluno: ");
        int nota = entrada.nextInt();


        switch(nota) {
            case 10: case 9: conceito = "A"; break;
            case 8: case 7: conceito = "B"; break;
            case 6: case 5: conceito = "C"; break;
            case 4: case 3: conceito = "D, esta de recuperção!"; break;
            case 2: case 1: conceito = "E, reprovado!"; break;
            case 0: conceito = "F, reprovado!"; break;
            default: conceito = "Nota Inválida"; break;
        }
        System.out.println("Conceito é: " + conceito);

        entrada.close();
    }

}
