import java.util.Objects;

public class MemoriaRAM {
    private String marca;
    private int capacidadeGB;

    // Construtor padrão
    public MemoriaRAM() {
        this.marca = "";
        this.capacidadeGB = 0;
    }

    // Construtor com parâmetros
    public MemoriaRAM(String marca, int capacidadeGB) {
        this.marca = marca;
        this.capacidadeGB = capacidadeGB;
    }

    // Métodos de acesso get/set para marca
    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getCapacidadeGB() {
        return capacidadeGB;
    }

    public void setCapacidadeGB(int capacidadeGB) {
        this.capacidadeGB = capacidadeGB;
    }

  
    public String toString() {
        return "MemoriaRAM{" +
                "marca='" + marca + '\'' +
                ", capacidadeGB=" + capacidadeGB +
                '}';
    }

    // Método equals para comparação de igualdade
    @Override
    public boolean equals(Object object) {
        if (this == object) return true;
        if (object == null || getClass() != object.getClass()) return false;
        MemoriaRAM that = (MemoriaRAM) object;
        return capacidadeGB == that.capacidadeGB && Objects.equals(marca, that.marca);
    }

    // Método hashCode para geração de código hash
    @Override
    public int hashCode() {
        return Objects.hash(marca, capacidadeGB);
    }

    public static void main(String[] args) {
        MemoriaRAM memoria1 = new MemoriaRAM("Corsair", 16);
        MemoriaRAM memoria2 = new MemoriaRAM("Corsair", 16);

        System.out.println(memoria1);
        System.out.println(memoria2);

        System.out.println("Memória 1 é igual a Memória 2? " + memoria1.equals(memoria2));
    }
}
