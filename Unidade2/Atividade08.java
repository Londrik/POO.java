// --- ATIVIDADE 8: ENTIDADE ALUNO (CLASSE DE DADOS) ---
        System.out.println("\n[Atividade 8] Manipulação de Entidade Única:");
        AlunoEstudo novoAluno = obterDadosAluno(leitor);
        exibirRelatorioAluno(novoAluno);


/**
     * Resolvendo Atividade 8: Obtenção de dados populando objeto complexo.
     * Instancia o objeto em memória e realiza o retorno da referência.
     */
    public static AlunoEstudo obterDadosAluno(Scanner leitor) {
        AlunoEstudo aluno = new AlunoEstudo();
        leitor.nextLine(); // Limpeza de buffer
        System.out.print("Nome do estudante: ");
        aluno.nome = leitor.nextLine();
        System.out.print("Digite a nota 1: ");
        aluno.nota1 = leitor.nextDouble();
        System.out.print("Digite a nota 2: ");
        aluno.nota2 = leitor.nextDouble();
        return aluno;
    }

    /**
     * Resolvendo Atividade 8: Impressão e avaliação de dados de entidade AlunoEstudo.
     */
    public static void exibirRelatorioAluno(AlunoEstudo aluno) {
        double media = (aluno.nota1 + aluno.nota2) / 2;
        System.out.println("\n--- Relatório do Aluno ---");
        System.out.println("Nome: " + aluno.nome);
        System.out.printf("Média Final: %.2f\n", media);
        System.out.println("Situação Acadêmica: " + ((media >= 7.0) ? "APROVADO" : "REPROVADO"));
    }
