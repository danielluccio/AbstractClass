package Interface;

public class Main {
    public static void main(String[] args) {

        Cachorro cachorro = new Cachorro();
        cachorro.fazerSom();
        cachorro.locomover();

        Gato gato = new Gato();
        gato.fazerSom();
        gato.locomover();
    }
}
