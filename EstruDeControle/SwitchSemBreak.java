

public class SwitchSemBreak {

    public static void main(String[] args) {

        String faixa = "verde";

        switch (faixa.toLowerCase()) {
            case "branca":
                System.out.println("Iniciante");
            case "amarela":
                System.out.println("Intermediário");
            case "laranja":
                System.out.println("Avançado");
            case "verde":
                System.out.println("Especialista");
            case "azul":
                System.out.println("Mestre");
            case "marrom":
                System.out.println("Grão-Mestre");
            case "preta":
                System.out.println("Lenda");
            break;
            default:
                System.out.println("Fim!"); 
        }




                // Exemplo de switch sem break
                // O código abaixo não possui o break, então todos os casos após o caso correspondente serão executados. 
                // Isso pode ser útil em alguns casos, mas geralmente não é recomendado, pois pode levar a comportamentos inesperados.
                // Neste exemplo, se a idade for 2, ele imprimirá todos os casos a partir do caso 2, incluindo 3, 1 e 0.
                // Se a idade fosse 3, ele imprimirá todos os casos a partir do caso 3, incluindo 2, 1 e 0.
                // Se a idade fosse 1, ele imprimirá todos os casos a partir do caso 1, incluindo 0.
                // Se a idade fosse 0, ele imprimirá apenas o caso 0.
                
                int idade = 2;
                switch (idade) {
                    case 3: 
                    System.out.println("sabe programar");
                    case 2:
                    System.out.println("sabe falar");
                    case 1: 
                    System.out.println("sabe andar");
                    case 0:
                    System.out.println("sabe respirar");
                } 
        }
         
    }


