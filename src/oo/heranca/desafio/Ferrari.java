package oo.heranca.desafio;

public class Ferrari extends Carro implements Esportivo, Luxo {

    private boolean ligarTurbo;
    private boolean ligarAr;

    public Ferrari() {
        this(315);
    }

    public Ferrari(int velocidadeMaxima) {
        super(velocidadeMaxima);
        setDelta(15);
    }

    @Override
    public void ligarTurbo() {
        ligarTurbo = true;
    }

    @Override
    public void desligarturbo() {
        ligarTurbo = false;
    }
    @Override
    public void ligarAr() {
        ligarAr = true;


    }
    @Override
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
