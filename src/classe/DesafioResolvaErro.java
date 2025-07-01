//package classe;

// Desafio: Resolva o erro de compilação abaixo

//public class DesafioResolvaErro {

   // int a = 3;

   // public static void main(String[] args) {

       // System.out.println(a);
        
   // }
//}
// Resposta: O erro de compilação ocorre porque a variável 'a' é uma variável de instância e não pode ser acessada diretamente de um contexto estático (o método main é estático).
// Para resolver o erro, você pode criar uma instância da classe DesafioResolvaErro e acessar a variável 'a' através dessa instância. Veja a correção abaixo: 
// Resposta corrigida:
package classe;
public class DesafioResolvaErro {

    int a = 3;

    public static void main(String[] args) {
        DesafioResolvaErro obj = new DesafioResolvaErro();
        System.out.println(obj.a);
    }
}
// Agora, o código compilará e imprimirá o valor de 'a' corretamente.
// A variável 'a' é acessada através da instância 'obj' da classe DesafioResolvaErro, permitindo que o código funcione sem erros de compilação.
// Assim, o código agora está corrigido e funcional, resolvendo o erro de compilação original.
