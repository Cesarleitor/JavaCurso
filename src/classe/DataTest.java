package classe;

public class DataTest {

    public static void main(String[] args) {
        
        Data d1 = new Data(1, 1, 1970);
        d1.dia = 1;
        d1.mes = 4;
        d1.ano = 1987;
        
        var d2 = new Data(25, 12, 2023);
        

        Data d3 =new Data();
        d3.dia = 13;
        d3.mes = 5;
        d3.ano = 2026;

        //String dataFormatada = d1.obterDataFormatada();

        System.out.println(d1.obterDataFormatada());
        System.out.println(d2.obterDataFormatada());
        System.out.println(d3.obterDataFormatada());

        //d1.imprimirDataFormatada();
        //d2.imprimirDataFormatada();
        //d3.imprimirDataFormatada();
        

    }

}
