/**
     * ATIVIDADE 13: Gestão de Alunos com ArrayList.
     * Armazena instâncias de AlunoEx3 dinamicamente até que o usuário decida parar.
     */
    public static void executarAtividade3(Scanner leitor) {
        System.out.println("\n--- [Atividade 3] ArrayList de Alunos ---");
        ArrayList<AlunoEx3> turma = new ArrayList<>();
        char continuar = 'S';

        while (Character.toUpperCase(continuar) == 'S') {
            AlunoEx3 aluno = new AlunoEx3();
            leitor.nextLine(); // Buffer

            System.out.print("Nome do Aluno: ");
            aluno.setNome(leitor.nextLine());
            System.out.print("Nota 1: ");
            aluno.setNota1(leitor.nextDouble());
            System.out.print("Nota 2: ");
            aluno.setNota2(leitor.nextDouble());

            turma.add(aluno); // Inserção dinâmica no ArrayList

            System.out.print("Deseja inserir outro aluno? (S/N): ");
            continuar = leitor.next().charAt(0);
        }

        // Iteração usando for-each nativo do Java sobre a coleção
        double somaMedias = 0;
        System.out.println("\nResultados Finais:");
        for (AlunoEx3 al : turma) {
            System.out.printf("Aluno: %-15s | Média: %.2f\n", al.getNome(), al.getMedia());
            somaMedias += al.getMedia();
        }

        double mediaTurma = somaMedias / turma.size();
        System.out.println("Quantidade total de alunos cadastrados: " + turma.size());
        System.out.printf("Média geral da turma: %.2f\n", mediaTurma);
    }


/**
 * Entidade Aluno para a Atividade 13.
 */
class AlunoEx3 {
    private String nome;
    private double nota1;
    private double nota2;

    public double getMedia() {
        return (this.nota1 + this.nota2) / 2;
    }

    // --- Getters e Setters ---
    public String getNome() { return nome; }
    public void setNome(String nome) { this.nome = nome; }
    public double getNota1() { return nota1; }
    public void setNota1(double nota1) { this.nota1 = nota1; }
    public double getNota2() { return nota2; }
    public void setNota2(double nota2) { this.nota2 = nota2; }
}
