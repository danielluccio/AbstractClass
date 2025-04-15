public class Nivus extends Carro {

    public String modelo;

    @Override
    public void correr() {
        System.out.println("O Nivus está correndo !");
    }

    public Nivus() {
        // Constutor padrão
    }

    Nivus(String modelo) {
        super();
        this.modelo = modelo;
    }
}
