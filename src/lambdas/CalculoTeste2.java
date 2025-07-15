package lambdas;

public class CalculoTeste2 {

    //Essa e a forma usando  LAMBDA

    public static void main(String[] args) {

        Calculo calculo = (x, y) -> { return x + y; };
        System.out.println(calculo.executar(2, 3));

        Calculo calc = (x, y) -> { return x * y; };
        System.out.println(calc.executar(3, 3));

        //Uma forma de lambda mais otimizada
        calc = (x, y) -> x * y;
          System.out.println(calc.executar(2, 3));
        
    }

}
