import java.util.*;

public class MapaCidades {
    private TreeSet<Cidade> cidades;
    private HashMap<Cidade, Set<Rota>> grafo;

    public MapaCidades() {
        this.cidades = new TreeSet<>();
        this.grafo = new HashMap<>();
    }

    // Cadastrar nova cidade
    public boolean cadastrarCidade(Cidade cidade) {
        if (cidades.add(cidade)) {
            grafo.put(cidade, new HashSet<>());
            return true;
        }
        return false;
    }

    // Criar rota entre cidades (não direcionada)
    public boolean criarRota(Cidade origem, Cidade destino, double distancia) {
        if (!cidades.contains(origem) || !cidades.contains(destino)) {
            return false;
        }
        
        grafo.get(origem).add(new Rota(destino, distancia));
        grafo.get(destino).add(new Rota(origem, distancia));
        return true;
    }

    // Mostrar todas as conexões de uma cidade
    public Set<Rota> getConexoes(Cidade cidade) {
        return grafo.getOrDefault(cidade, Collections.emptySet());
    }

    // Verificar se duas cidades estão conectadas
    public boolean estaoConectadas(Cidade a, Cidade b) {
        if (!grafo.containsKey(a)) return false;
        
        for (Rota rota : grafo.get(a)) {
            if (rota.getDestino().equals(b)) {
                return true;
            }
        }
        return false;
    }

    // Listar cidades sem conexões
    public Set<Cidade> getCidadesIsoladas() {
        Set<Cidade> isoladas = new HashSet<>();
        
        for (Cidade cidade : cidades) {
            if (grafo.get(cidade).isEmpty()) {
                isoladas.add(cidade);
            }
        }
        return isoladas;
    }

    // Listar todas as cidades ordenadas
    public Set<Cidade> getTodasCidades() {
        return cidades;
    }
}