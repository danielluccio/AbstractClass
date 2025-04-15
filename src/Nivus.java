public class Nivus extends Carro implements CoisasDeCarro {

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

    public void ajustarRetrovisor() {
        boolean direita = false;
        boolean esquerda = true;

        if (esquerda == true) {
            System.out.println("Retrovisor ajustado para a esquerda");
        } else {
            direita = true;
            System.out.println("Retrovisor esta sendo ajustado para a direita");
        }
    }

    public void luzAlta() {
        boolean ligarLuzAlta = false;

        if (ligarLuzAlta == true) {
            System.out.println("Luz alta ligada !");
        }
    }
}
