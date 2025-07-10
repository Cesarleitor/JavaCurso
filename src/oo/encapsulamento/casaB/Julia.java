package oo.encapsulamento.casaB;

import oo.encapsulamento.casaA.Ana;

public class Julia {

    public static void main(String[] args) {
        Julia julia = new Julia();
        julia.testeAcessos();
    }


    void testeAcessos() {
        Ana sogra = new Ana();
        //System.out.println(sogra.segredo);
        //System.out.println(sogra.facoDentroDeCasa);
        //System.out.println(sogra.formaDeFalar);
        System.out.println(sogra.todosSabem);

        
    }

    
}
