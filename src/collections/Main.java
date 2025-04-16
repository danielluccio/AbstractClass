package collections;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;
import java.util.Map;

public class Main {
    public static void main(String[] args) {

        Usuario usuario = new Usuario("DanielLucio");
        Usuario usuario1 = new Usuario("DiegoLucio");
        Usuario usuario2 = new Usuario("DenisLucio");
        Usuario usuario3 = new Usuario("lucasLucio");
        Usuario usuario4 = new Usuario("miguelLucio");
        Usuario usuario5 = new Usuario("DanielLucio");

        // LIST -> ArrayList, LinkedList
        List<Usuario> listaUsuarios = new ArrayList<>();
        listaUsuarios.add(usuario);
        listaUsuarios.add(usuario1);
        listaUsuarios.add(usuario2);
        listaUsuarios.add(usuario3);
        listaUsuarios.add(usuario4);
        listaUsuarios.add(usuario5);

        List<Usuario> LinkedListUsuarios = new LinkedList<>();
        LinkedListUsuarios.add(usuario1);
        LinkedListUsuarios.add(usuario2);
        LinkedListUsuarios.add(usuario3);
        LinkedListUsuarios.add(usuario4);
        LinkedListUsuarios.add(usuario5);
        // SET -> HASH, TREESET

        // MAP HASHMAP, TREEMAP
    }
}
