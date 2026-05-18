    /**
     * ATIVIDADE 15: Atribuição de Conceitos Acadêmicos.
     */
    public static void executarAtividade5(Scanner leitor) {
        System.out.println("\n--- [Atividade 5] Atribuição de Conceitos ---");
        AlunoConceito aluno = new AlunoConceito();
        leitor.nextLine(); // Buffer

        System.out.print("Digite o número de matrícula: ");
        aluno.setMatricula(leitor.nextLine());
        System.out.print("Digite a nota obtida (0.0 a 10.0): ");
        aluno.setNota(leitor.nextDouble());

        System.out.println("\nFicha de Avaliação:");
        System.out.println("Matrícula: " + aluno.getMatricula());
        System.out.println("Nota: " + aluno.getNota());
        System.out.println("Conceito Atribuído pelo Sistema: " + aluno.getConceito());
    }




/**
 * Entidade AlunoConceito para a Atividade 15.
 */
class AlunoConceito {
    private String matricula;
    private double nota;

    // Tradução de nota contínua para conceito discreto (Módulo 2 e 3 de UI)
    public char getConceito() {
        if (this.nota >= 9.0) {
            return 'A';
        } else if (this.nota >= 7.5) {
            return 'B';
        } else if (this.nota >= 6.0) {
            return 'C';
        } else {
            return 'D';
        }
    }

    // --- Getters e Setters ---
    public String getMatricula() { return matricula; }
    public void setMatricula(String matricula) { this.matricula = matricula; }
    public double getNota() { return nota; }
    public void setNota(double nota) { 
        if (nota >= 0 && nota <= 10) {
            this.nota = nota; 
        }
    }
}
