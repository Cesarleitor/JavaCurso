package oo.abstrato;

  public class Cachorro extends Mamifero {


   public Cachorro(String nome) {
    super(nome);

   }

   @Override
   public void mover() {
   System.out.println(nome + " está correndo");

   }


}
