package classe;

public class Produto {

    String nome;
    double preco;
    final static double DESCONTO = 0.25;



    Produto(String nomeInicial, double precoInicial) {
        nome = nomeInicial; 
        preco = precoInicial;  
    }
    
    

    double precoComDesconto(double descontoDoGerente) {
        return preco * (1 - (DESCONTO + descontoDoGerente));
    }

}
