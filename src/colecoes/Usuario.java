package colecoes;

public class Usuario {

    String nome;
    
    Usuario(String nome) {
        this.nome = nome;
    }

    @Override
    public String toString() {
        return "Meu nome é:" + this.nome + " . ";
    }

  
    @Override
    public int hashCode() {
        int hash = 3;
        return hash;
    }

    
    @Override
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
        if (this.nome == null) {
            return other.nome == null;
        } else {
            return this.nome.equals(other.nome);
        }
    }




     

    



}
