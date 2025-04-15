public class Polo extends Carro {

    private String modelo;

    @Override
    public void correr() {
        // Método vindo de Carro implementado, possuindo corpo
        System.out.println("O polo está correndo !");
    }

    public Polo() {

    }

    Polo(String modelo) {
        super();
        this.modelo = modelo;
    }
}
