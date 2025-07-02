package colecoes;

public class Usuario {

    String nome;
    
    Usuario(String nome) {
        this.nome = nome;
    }

    public String toString() {
        return "Meu nome é:" + this.nome + " . ";
    }

  
    public int hashCode() {
        int hash = 3;
        return hash;
    }

    
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Usuario other = (Usuario) obj;
        return true;
    }




     

    



}
