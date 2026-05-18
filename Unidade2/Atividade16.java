    /**
     * ATIVIDADE 16: Gestão de Triatletas de Brasília.
     */
    public static void executarAtividade6(Scanner leitor) {
        System.out.println("\n--- [Atividade 6] Gestão de Triatletas ---");
        ArrayList<Atleta> atletas = new ArrayList<>();
        
        System.out.print("Para fins de teste, quantos atletas deseja cadastrar? (A federação comporta 1.200): ");
        int limite = leitor.nextInt();

        for (int i = 0; i < limite; i++) {
            Atleta atl = new Atleta();
            System.out.println("\nCadastro do Atleta " + (i + 1) + ":");
            System.out.print("Número de Inscrição (Único): ");
            atl.setInscricao(leitor.nextInt());
            leitor.nextLine(); // Buffer
            System.out.print("Nome: ");
            atl.setNome(leitor.nextLine());
            System.out.print("Tempo de Prova (Horas Completas): ");
            atl.setTempoProva(leitor.nextInt());
            System.out.print("Idade: ");
            atl.setIdade(leitor.nextInt());

            atletas.add(atl);
        }

        // --- GERAÇÃO DE RELATÓRIO TÉCNICO ---
        int eliteCount = 0;
        double somaTempos = 0;
        Atleta melhorAtleta = null;
        ArrayList<Atleta> categoria30a34 = new ArrayList<>();
        ArrayList<Atleta> naoElites = new ArrayList<>();

        for (Atleta a : atletas) {
            somaTempos += a.getTempoProva();
            if (a.isElite()) {
                eliteCount++;
            } else {
                naoElites.add(a);
            }

            // Lógica de busca de menor tempo (melhor atleta)
            if (melhorAtleta == null || a.getTempoProva() < melhorAtleta.getTempoProva()) {
                melhorAtleta = a;
            }

            // Filtro por faixa etária
            if (a.getIdade() >= 30 && a.getIdade() <= 34) {
                categoria30a34.add(a);
            }
        }

        System.out.println("\n=========================================");
        System.out.println("       RELATÓRIO DA FEDERAÇÃO DE TRIATLO  ");
        System.out.println("=========================================");
        System.out.println("1. Quantidade de atletas na categoria ELITE: " + eliteCount);
        
        if (melhorAtleta != null) {
            System.out.println("2. Melhor atleta: " + melhorAtleta.getNome() + " (" + melhorAtleta.getTempoProva() + " horas de prova)");
        }
        
        System.out.println("3. Atletas na categoria de 30 a 34 anos:");
        for (Atleta a : categoria30a34) {
            System.out.println("   - " + a.getNome() + " (Idade: " + a.getIdade() + ")");
        }

        double mediaTempo = atletas.isEmpty() ? 0 : somaTempos / atletas.size();
        System.out.printf("4. Média de tempo total da competição: %.2f horas\n", mediaTempo);

        System.out.println("5. Atletas que NÃO pertencem à ELITE:");
        for (Atleta a : naoElites) {
            System.out.println("   - " + a.getNome() + " (" + a.getTempoProva() + " horas)");
        }
    }


/**
 * Entidade Atleta para a Atividade 16.
 */
class Atleta {
    private int inscricao;
    private String nome;
    private int tempoProva; // em horas
    private int idade;

    // Regra de classificação de categoria
    public boolean isElite() {
        return this.tempoProva < 5;
    }

    // --- Getters e Setters ---
    public int getInscricao() { return inscricao; }
    public void setInscricao(int inscricao) { this.inscricao = inscricao; }
    public String getNome() { return nome; }
    public void setNome(String nome) { this.nome = nome; }
    public int getTempoProva() { return tempoProva; }
    public void setTempoProva(int tempoProva) { this.tempoProva = tempoProva; }
    public int getIdade() { return idade; }
    public void setIdade(int idade) { this.idade = idade; }
}    