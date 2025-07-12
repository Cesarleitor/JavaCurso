package oo.abstrato;

public abstract  class Animal { 

    public String nome;

    public Animal(String nome) {
        this.nome = nome;
    }

    public abstract void mover();
    public abstract void alimentar();
}

