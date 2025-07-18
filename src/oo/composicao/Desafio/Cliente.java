package oo.composicao.Desafio;

import java.util.ArrayList;
import java.util.List;

public class Cliente {

    final String nome;
    final List<Compra> compras = new ArrayList<>();

    public Cliente(String nome) {
        this.nome = nome;
    }

    public void adicionarCompra(Compra compra) {
        compras.add(compra);
    }

    double obterValorTotal() {
        double total = 0;

        for(Compra compra: compras) {
            total += compra.obterValorTotal();

        }
     return total;
    }


}
