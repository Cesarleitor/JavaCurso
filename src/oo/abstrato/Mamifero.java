package oo.abstrato;

public abstract  class Mamifero extends Animal {

    public Mamifero(String nome) {
        super(nome);
    }

    public void alimentar() {
        System.out.println(nome + " está mamando");
    }

    }
