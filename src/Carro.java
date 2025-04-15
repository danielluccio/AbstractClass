public abstract class Carro {
    // Classe Abstrata -> Generalização da classe.

    // Método abstrato, ele não possui corpo e é obirgado a ser implementado nas
    // classes filhas.

    private String cor;
    private String marca;
    private int anoFabricacao;

    public abstract void correr();

    // Construtor Padrão
    Carro() {

    }

    // Construtor com atributos dentro do escopo do construtor
    public Carro(String cor, String marca, int anoFabricacao) {
        this.cor = cor;
        this.marca = marca;
        this.anoFabricacao = anoFabricacao;
    }
}
