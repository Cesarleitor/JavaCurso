package classe;

public class ProdutoTest {

    public static void main(String[] args) {
        
    

    Produto p1 = new Produto("Notebook", 4356.89);
    Produto p2 = new Produto("Caneta Preta", 12.56);
    Produto p3 = new Produto ("Celular Iphone 11",5000.0);
    Produto p4 = new Produto("Computador Gamer", 4890);

    //Produto.desconto= 0.50;
    //p2.desconto = 0.29;

    System.out.println(p1.nome + " " + p1.precoComDesconto(0.0));
    System.out.println(p2.nome + " " + p2.precoComDesconto(0));
    System.out.println(p3.nome + " " + p3.precoComDesconto(0));
    System.out.println(p4.nome + " " + p4.precoComDesconto(0));

    double precoFinal1 = p1.precoComDesconto(0);
    double precoFinal2 = p2.precoComDesconto(0);
    double precoFinal3 = p3.precoComDesconto(0);
    double precoFinal4 = p4.precoComDesconto(0);
    double mediaCarrinho = (precoFinal1 + precoFinal2 + precoFinal3 + precoFinal4) / 2 ;

    System.out.printf("Média do carrinho = R$%.2f.", mediaCarrinho);
}

}
