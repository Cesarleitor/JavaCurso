
import POO.Desafio.Cliente;
import POO.Desafio.Compra;
import POO.Desafio.Produto;

public class Sistema {

    public static void main(String[] args) {

        Cliente cliente = new Cliente("Maria julia Morais");

        Compra compra1 = new Compra();
        compra1.adicionarItem("Caneta", 9.67, 100);
        compra1.adicionarItem(new Produto
        ("Notebook", 1897.88), 2 );

        
        
    }

}
