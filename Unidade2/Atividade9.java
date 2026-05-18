 // --- ATIVIDADE 9: CADASTRO DE ALUNOS (ARRAY DE OBJETOS) ---
        System.out.println("\n[Atividade 9] Cadastro de Turma (Array de Objetos):");
        System.out.print("Quantos alunos deseja cadastrar na escola? ");
        int qtdeAlunos = leitor.nextInt();
        
        // Instanciação da estrutura de dados homogênea de referências complexas (Módulo 1)
        AlunoEscola[] turma = new AlunoEscola[qtdeAlunos];
        
        // Loop para instanciar e preencher cada objeto individualmente
        for (int i = 0; i < turma.length; i++) {
            System.out.println("Cadastrando aluno " + (i + 1) + ":");
            leitor.nextLine(); // Limpeza do buffer do teclado
            
            // Passo de instanciação obrigatório da referência para evitar NullPointerException
            turma[i] = new AlunoEscola();
            
            System.out.print("Nome: ");
            turma[i].nome = leitor.nextLine();
            System.out.print("Matrícula: ");
            turma[i].matricula = leitor.nextInt();
            System.out.print("Situação (1 - Regular, 2 - Bolsista): ");
            int sit = leitor.nextInt();
            turma[i].situacao = (sit == 1) ? "REGULAR" : "BOLSISTA";
        }
        
        exibirRelatorioTurma(turma);


 /**
     * Resolvendo Atividade 9: Processamento e exibição de array de Alunos.
     */
    public static void exibirRelatorioTurma(AlunoEscola[] turma) {
        int qtdRegulares = 0;
        int qtdBolsistas = 0;
        
        System.out.println("\n--- Lista Geral de Alunos Cadastrados ---");
        for (int i = 0; i < turma.length; i++) {
            System.out.println("Matrícula: " + turma[i].matricula + " | Nome: " + turma[i].nome + " | Status: " + turma[i].situacao);
            if (turma[i].situacao.equals("REGULAR")) {
                qtdRegulares++;
            } else {
                qtdBolsistas++;
            }
        }
        System.out.println("\nTotal de Alunos Regulares: " + qtdRegulares);
        System.out.println("Total de Alunos Bolsistas: " + qtdBolsistas);
    }

