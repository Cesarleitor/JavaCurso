import java.util.Scanner;

public class If {

    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        System.out.print("Informe a media: ");
        Double nota = entrada.nextDouble();

        //não usar ; em estruturas de controle
        if (nota >= 7.0 && nota <= 10.0) {
            System.out.println("Aprovado!");
            System.out.println("Parabens!");
        } else if (nota >= 5.0 && nota <=6.9) {
            System.out.println("Recuperacao!");
            System.out.println("Estude mais!");
        } else if (nota <=4.9 && nota >= 0.0) {
            System.out.println("Reprovado!");
            System.out.println("Tente novamente!");
        }
    

        entrada.close();
    }

}


