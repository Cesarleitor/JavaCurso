package classe.desafio;

public class Jantar {

    public static void main(String[] args) {

        Comida c1 = new Comida("Arroz", 0.223);
         Comida c2 = new Comida("Feijão", 0.153);
          Comida c3 = new Comida("Frango", 0.330);
           Comida c4 = new Comida("Legumes", 0.180);

           Pessoa p = new Pessoa("João", 99.8);

           System.out.println(p.apresentar());
           p.comer(c1);
           System.out.println(p.apresentar());
           p.comer(c2);
           System.out.println(p.apresentar());
           p.comer(c3);
           System.out.println(p.apresentar());
           p.comer(c4);

           System.out.println(p.apresentar());

        
    }

}
