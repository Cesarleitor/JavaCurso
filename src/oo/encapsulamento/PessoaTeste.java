package oo.encapsulamento;

public class PessoaTeste {

    public static void main(String[] args) {
        
        Pessoa p1 = new Pessoa("Pedro","Santos",-45);
        p1.setIdade(230); //Alterar 

        System.out.println(p1.getNome()); //Ler
        System.out.println(p1.getNomeCompleto()); //toString
        System.out.println(p1); //toString
    }

}
