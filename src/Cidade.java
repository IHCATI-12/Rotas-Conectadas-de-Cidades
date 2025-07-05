import java.util.Objects;

public class Cidade implements Comparable<Cidade> {
    private String nome;
    private String uf;
    private int populacao;

    public Cidade(String nome, String uf, int populacao) {
        this.nome = nome;
        this.uf = uf;
        this.populacao = populacao;
    }

    // Getters
    public String getNome() { return nome; }
    public String getUf() { return uf; }
    public int getPopulacao() { return populacao; }

    // Para ordenação no TreeSet
    @Override
    public int compareTo(Cidade outra) {
        return this.nome.compareTo(outra.nome);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Cidade cidade = (Cidade) obj;
        return nome.equals(cidade.nome) && uf.equals(cidade.uf);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome, uf);
    }

    @Override
    public String toString() {
        return nome + " - " + uf + " (Pop: " + populacao + ")";
    }
}