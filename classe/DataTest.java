package classe;

public class DataTest {

    public static void main(String[] args) {
        
        Data d1 = new Data();
        d1.dia = 1;
        d1.mes = 4;
        d1.ano = 1987;
        
        var d2 = new Data();
        d2.dia = 25;
        d2.mes = 12;
        d2.ano = 2023;

        Data d3 =new Data();
        d3.dia = 13;
        d3.mes = 5;
        d3.ano = 2026
;

        System.out.printf("Data: %d/%d/%d\n", d1.dia, d1.mes, d1.ano);
        System.out.printf("Data: %d/%d/%d\n", d2.dia, d2.mes, d2.ano);
        System.out.printf("Data: %d/%d/%d\n", d3.dia, d3.mes, d3.ano);
        
        

    }

}
