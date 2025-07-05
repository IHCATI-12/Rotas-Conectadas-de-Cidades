Sistema Java orientado a objetos que modela um conjunto de cidades conectadas por rotas rodoviárias, utilizando estruturas de dados como:

ArrayList, LinkedList, Vector

HashMap, TreeMap

HashSet, TreeSet, Set

🏗️ Estrutura do Projeto
src/
├── Cidade.java          # Classe que representa uma cidade
├── Rota.java            # Classe que representa uma rota entre cidades
├── MapaCidades.java     # Classe principal que gerencia o sistema
└── Main.java            # Classe de teste/demonstração

🚀 Funcionalidades Implementadas

✔️ Cadastro de Cidades
Armazena nome, estado (UF) e população

Utiliza TreeSet para manter ordenação por nome

✔️ Sistema de Rotas
Conexões não direcionadas entre cidades

Distância em quilômetros entre cidades conectadas

Implementado com HashMap<Cidade, Set<Rota>>

✔️ Consultas
Listar todas as conexões de uma cidade

Verificar se duas cidades estão conectadas

Identificar cidades sem conexões

🛠️ Como Executar
Clone o repositório:

bash
git clone https://github.com/IHCATI-12/Rotas-Conectadas-de-Cidades.git

Compile e execute:
bash
javac src/*.java -d bin/
java -cp bin/ Main

📝 Exemplo de Uso

java

// Criando cidades
Cidade sp = new Cidade("São Paulo", "SP", 12300000);
Cidade rj = new Cidade("Rio de Janeiro", "RJ", 6748000);

// Cadastrando no sistema
mapa.cadastrarCidade(sp);
mapa.cadastrarCidade(rj);

// Criando rota
mapa.criarRota(sp, rj, 430);

// Consultando conexões
Set<Rota> conexoes = mapa.getConexoes(sp);


📊 Estruturas de Dados Utilizadas

Classe	    Estruturas Utilizadas	Finalidade
Cidade	    TreeSet	                Armazenamento ordenado de cidades
Rota	    -	                    Modelagem das conexões
MapaCidades	HashMap, HashSet        Representação do grafo de conexões
