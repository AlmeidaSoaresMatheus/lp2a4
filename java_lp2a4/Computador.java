import java.util.Objects;

public class Computador {
    private MemoriaRAM memoriaram;
    private Processador processador;

    // Constructors
    public Computador() {
        this.memoriaram = null;
        this.processador = null;
    }

    public Computador(MemoriaRAM memoriaram, Processador processador) {
        this.memoriaram = memoriaram;
        this.processador = processador;
    }

    @Override
    public String toString() {
        return "MemoriaRAM: " + memoriaram + ", Processador: " + processador;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Computador that = (Computador) o;
        return Objects.equals(memoriaram, that.memoriaram) && Objects.equals(processador, that.processador);
    }

    @Override
    public int hashCode() {
        return Objects.hash(memoriaram, processador);
    }

    public static void main(String[] args) {
        MemoriaRAM memoria1 = new MemoriaRAM("Corsair", 8);
        Processador processador1 = new Processador("Décima", "decima", 10);

        Computador computador1 = new Computador(memoria1, processador1);
        Computador computador2 = new Computador(memoria1, processador1);

        System.out.println(computador1);
        System.out.println(computador2);

        System.out.println("Computador 1 é igual a Computador 2? " + computador1.equals(computador2));
    }
}
