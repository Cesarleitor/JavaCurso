package classe;

public class Data {
    int dia;
    int mes;
    int ano;

     Data() {

        }

    Data(int diaInicial, int mesInicial, int anoInicial) {
        dia = diaInicial;
        mes = mesInicial;
        ano = anoInicial;

       

    }

    String obterDataFormatada() {
        return  String.format(" %d/%d/%d", dia, mes, ano);
        
    }
    // Método para imprimir a data formatada (nao retorna nada)
    // Este método chama o método obterDataFormatada e imprime o resultado 
    // so no terminal
   }


