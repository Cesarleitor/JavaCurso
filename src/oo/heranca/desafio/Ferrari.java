package oo.heranca.desafio;

public class Ferrari extends Carro implements Esportivo, luxo {

    private boolean ligarTurbo;
    private boolean ligarAr;

    public Ferrari() {
        this(315);
    }

    public Ferrari(int velocidadeMaxima) {
        super(velocidadeMaxima);
        setDelta(15);
    }

    public void ligarTurbo() {
        ligarTurbo = true;
    }

    public void desligarturbo() {
        ligarTurbo = false;
    }
    public void ligarAr() {
        ligarAr = true;


    }
    public void desligarAr() {
        ligarAr = false;

    }

    @Override
    public int getDelta() {
        if(ligarTurbo && !ligarAr) {
            return 35;
        } else if(ligarTurbo && ligarAr) {
            return 30;
        } else if(!ligarTurbo && !ligarAr) {
            return 20;
        } else {
            return 15;
        }
    }
}
