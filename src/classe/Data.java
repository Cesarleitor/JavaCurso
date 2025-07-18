package classe;

public class Data {
    int dia;
    int mes;
    int ano;
    // String formato = "%d/%d/%d"; // Atributo de instância removido pois não é utilizado
 
     Data() {
        this(1, 1, 1970);

        }

    Data(int dia, int mes, int ano) {
        this.dia = dia;
        this.mes = mes;
        this.ano = ano;

       

    }

    String obterDataFormatada() {
        // Variável local 
        final String formato = "%d/%d/%d";
        return  String.format(formato, this.dia, mes, ano);
        
    }
    
        void imprimirDataFormatada() {
            System.out.println(this.obterDataFormatada());
        }

        public static void main(String[] args) {
            Data data = new Data();
            data.imprimirDataFormatada();
        }
    }