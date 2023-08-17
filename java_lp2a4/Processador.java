import java.util.Objects;

public class Processador {
    private String marca;
    private String geracao;
    private Integer threads;

    // Constructors
    public Processador() {
        this.marca = "";
        this.geracao = "";
        this.threads = 0;
    }

    public Processador(String marca, String geracao, Integer threads) {
        this.marca = marca;
        this.geracao = geracao;
        this.threads = threads;
    }

    public String toString() {
        return "Marca: " + marca + ", Geração: " + geracao + ", Threads: " + threads;
    }

    public static void main(String[] args) {
        Processador processador1 = new Processador("Corsair", "Décima", 8);
        Processador processador2 = new Processador("Corsair", "Décima", 8);

        System.out.println(processador1);
        System.out.println(processador2);

        System.out.println("Processador 1 é igual a Processador 2? " + processador1.equals(processador2));
    }
}
