package Polimorfismo;

// Sobrescrista (@Override), sobrecarga

public class Pessoa {
    public void falar() {
        System.out.println("A pessoa está falando");
    }

    // Estou sobrecarregando este método pois adicionei um parametro diferente
    // dentro dele, desta forma ele tera um novo comportamento
    public void falar(String texto) {
        System.out.println(texto);
    }
}
