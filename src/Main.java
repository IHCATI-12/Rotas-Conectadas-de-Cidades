public class Main {
    public static void main(String[] args) {
        MapaCidades mapa = new MapaCidades();
        
        // Cadastrando cidades
        Cidade sp = new Cidade("São Paulo", "SP", 12300000);
        Cidade rj = new Cidade("Rio de Janeiro", "RJ", 6748000);
        Cidade bh = new Cidade("Belo Horizonte", "MG", 2522000);
        Cidade sa = new Cidade("Salvador", "BA", 2887000);
        Cidade poa = new Cidade("Porto Alegre", "RS", 1493000);
        
        mapa.cadastrarCidade(sp);
        mapa.cadastrarCidade(rj);
        mapa.cadastrarCidade(bh);
        mapa.cadastrarCidade(sa);
        mapa.cadastrarCidade(poa);
        
        // Criando rotas
        mapa.criarRota(sp, rj, 430);
        mapa.criarRota(sp, bh, 586);
        mapa.criarRota(rj, bh, 434);
        mapa.criarRota(bh, sa, 1372);
        
        // Testando funcionalidades
        System.out.println("Todas as cidades (ordenadas por nome):");
        for (Cidade cidade : mapa.getTodasCidades()) {
            System.out.println(cidade);
        }
        
        System.out.println("\nConexões de Belo Horizonte:");
        for (Rota rota : mapa.getConexoes(bh)) {
            System.out.println(rota);
        }
        
        System.out.println("\nSão Paulo e Rio estão conectadas? " + 
            mapa.estaoConectadas(sp, rj));
        
        System.out.println("\nPorto Alegre e Salvador estão conectadas? " + 
            mapa.estaoConectadas(poa, sa));
        
        System.out.println("\nCidades sem conexões:");
        for (Cidade cidade : mapa.getCidadesIsoladas()) {
            System.out.println(cidade);
        }
    }
}