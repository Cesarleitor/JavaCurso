public class For1 {

    public static void main(String[] args) {
        for (int contador = 0; contador <= 20; contador += 2) {
            System.out.printf("i = %d\n", contador);
        }

        System.out.println("Fim!");
        
        // Exemplo de for com array
        String[] aprovados = {"Ana", "Bia", "Lia", "Gui"};
        for (int i = 0; i < aprovados.length; i++) {
            System.out.printf("Aprovado: %s\n", aprovados[i]);
        }
    }

}
