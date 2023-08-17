import java.util.Objects;

public class Imagem {
    private String nome;
    private String formato;

    // Construtor padrão
    public Imagem() {
        this.nome = "";
        this.formato = "";
    }

    // Construtor com parâmetros
    public Imagem(String nome, String formato) {
        this.nome = nome;
        this.formato = formato;
    }

    // Métodos de acesso get/set para nome
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getformato() {
        return formato;
    }

    public void setformato(String formato) {
        this.formato = formato;
    }

  
    public String toString() {
        return "Imagem{" +
                "nome='" + nome + '\'' +
                ", formato=" + formato +
                '}';
    }

    // Método equals para comparação de igualdade
    @Override
    public boolean equals(Object object) {
        if (this == object) return true;
        if (object == null || getClass() != object.getClass()) return false;
        Imagem that = (Imagem) object;
        return formato == that.formato && Objects.equals(nome, that.nome);
    }

    // Método hashCode para geração de código hash
    @Override
    public int hashCode() {
        return Objects.hash(nome, formato);
    }

    public static void main(String[] args) {
        Imagem Imagem1 = new Imagem(nome:"pordosol",formato:"png")

        Imagem Imagem2 = new Imagem(nome:"pordosol",formato:"png")

        System.out.println(Imagem1);
        System.out.println(Imagem2);

        System.out.println("Imagem 1 é igual a Imagem 2? " + Imagem1.equals(Imagem2));
    }
}
