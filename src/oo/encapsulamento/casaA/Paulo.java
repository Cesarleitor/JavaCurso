package oo.encapsulamento.casaA;

public class Paulo {

    public static void main(String[] args) {
        Paulo paulo = new Paulo();
        paulo.testeAcessos();
    }

    void testeAcessos() {
          Ana esposa = new Ana();
        //System.out.println(esposa.segredo);
        System.out.println(esposa.facoDentroDeCasa);
        System.out.println(esposa.formaDeFalar);
        System.out.println(esposa.todosSabem);
    }
}

