package colecoes;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class Mapa {

    public static void main(String[] args) {
        
        Map<Integer, String> usuarios = new HashMap<>();

        usuarios.put(1, "Roberto");
        usuarios.put(2, "Ricardo");
        usuarios.put(3, "Rafaela");
        usuarios.put(4, "Rebeca");

        System.out.println(usuarios.size());
        System.out.println(usuarios.isEmpty());

        System.out.println(usuarios.keySet()); // Só as chaves
        System.out.println(usuarios.values()); // Apenas os valores
        System.out.println(usuarios.entrySet()); // Chaves e valores ao mesmo tempo

        System.out.println(usuarios.containsKey(20)); // Busca se a chave esta presente no  MAP
        System.out.println(usuarios.containsValue("Rebeca")); // Busca se o valor esta presente no  MAP

        System.out.println(usuarios.get(4)); // Retorna o valor contido na chave 4

        // Para remover um elemento
        System.out.println(usuarios.remove(2));
        System.out.println(usuarios.remove(3, "Rafaela"));

        // Percorrer os elementos do MAP

        // Só as chaves
        for(int chave: usuarios.keySet()) {
           System.out.println(chave);
        }
        // Só valores
        for(String valor: usuarios.values()) {
            System.out.println(valor);
        }
        //Chaves e Valores
        for(Entry<Integer, String> registro: usuarios.entrySet()){
            System.out.print(registro.getKey() + "==>");
            System.out.println(registro.getValue());

        }

    }



}
