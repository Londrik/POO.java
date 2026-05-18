    /**
     * ATIVIDADE 14: Sindicato dos Professores com ArrayList.
     * Gerencia a contribuição tributária com base na titulação.
     */
    public static void executarAtividade4(Scanner leitor) {
        System.out.println("\n--- [Atividade 4] Sindicato dos Professores ---");
        ArrayList<Professor> professores = new ArrayList<>();
        char continuar = 'S';

        while (Character.toUpperCase(continuar) == 'S') {
            Professor prof = new Professor();
            leitor.nextLine(); // Buffer

            System.out.print("Nome do Professor: ");
            prof.setNome(leitor.nextLine());
            System.out.print("CPF: ");
            prof.setCpf( leitor.nextLine() );
            
            String tit = "";
            while (!tit.equals("GRADUADO") && !tit.equals("MESTRE") && !tit.equals("DOUTOR")) {
                System.out.print("Titulação (Graduado, Mestre, Doutor): ");
                tit = leitor.nextLine().trim().toUpperCase();
            }
            prof.setTitulacao(tit);

            System.out.print("Salário Bruto: R$ ");
            prof.setSalario(leitor.nextDouble());

            professores.add(prof);

            System.out.print("Deseja cadastrar mais professores? (S/N): ");
            continuar = leitor.next().charAt(0);
        }

        double totalArrecadado = 0;
        int countMestres = 0;

        System.out.println("\nLista de Contribuição Sindical:");
        for (Professor p : professores) {
            double cont = p.getContribuicao();
            totalArrecadado += p.getContribuicao();
            System.out.printf("Prof: %-15s | Titulação: %-9s | Contribuição: R$ %,.2f\n",
                    p.getNome(), p.getTitulacao(), p.getContribuicao());

            if (p.getTitulacao().equals("MESTRE")) {
                countMestres++;
            }
        }

        System.out.printf("\nTotal arrecadado pelo sindicato: R$ %,.2f\n", totalArrecadado);
        System.out.println("Quantidade de professores com nível de MESTRE: " + countMestres);
    }



/**
 * Entidade Professor para a Atividade 14.
 */
class Professor {
    private String nome;
    private String cpf;
    private String titulacao; // GRADUADO, MESTRE, DOUTOR
    private double salario;

    // Regra tributária encapsulada (Alta coesão)
    public double getContribuicao() {
        double aliquota = 0;
        if (this.titulacao.equals("GRADUADO")) {
            aliquota = 0.012; // 1.2%
        } else if (this.titulacao.equals("MESTRE")) {
            aliquota = 0.014; // 1.4%
        } else if (this.titulacao.equals("DOUTOR")) {
            aliquota = 0.016; // 1.6%
        }
        return this.salario * aliquota;
    }

    // --- Getters e Setters ---
    public String getNome() { return nome; }
    public void setNome(String nome) { this.nome = nome; }
    public String getCpf() { return cpf; }
    public void setCpf(String cpf) { this.cpf = cpf; }
    public String getTitulacao() { return titulacao; }
    public void setTitulacao(String titulacao) { this.titulacao = titulacao; }
    public double getSalario() { return salario; }
    public void setSalario(double salario) { this.salario = salario; }
}
