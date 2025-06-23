public class Continue {

    public static void main(String[] args) {
        
        for (int i = 0; i < 10; i++) {
            if (i % 5 == 1) {
                continue; // pula a iteração quando i é igual a 5
            }
            System.out.println(i);
        }

        for(int i = 1; i <= 10; i++) {
           if (i == 5) continue; // pula a iteração quando i é igual a 5
            System.out.println(i);
        }
        
       
    }

}
// A palavra-chave continue é usada para pular a iteração atual do loop e continuar com a próxima iteração.
// No primeiro exemplo, o loop imprime os números de 0 a 9, mas pula a iteração quando i é igual a 1, 6, 11, etc.
// No segundo exemplo, o loop imprime os números de 1 a 10, mas pula a iteração quando i é igual a 5.
// Isso significa que o número 5 não será impresso em ambos os loops.