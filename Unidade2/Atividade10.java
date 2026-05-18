// --- ATIVIDADE 10: COMPETIÇÃO DE PILOTOS ---
        System.out.println("\n[Atividade 10] Corrida de Pilotos (Ordenação Complexa):");
        System.out.print("Quantos pilotos participaram da corrida? ");
        int qtdePilotos = leitor.nextInt();
        Piloto[] grid = new Piloto[qtdePilotos];
        
        for (int i = 0; i < grid.length; i++) {
            grid[i] = new Piloto();
            leitor.nextLine(); // Limpeza de buffer
            System.out.print("Nome do Piloto " + (i + 1) + ": ");
            grid[i].nome = leitor.nextLine();
            System.out.print("Escuderia: ");
            grid[i].escuderia = leitor.nextLine();
            
            int tempo = 0;
            while (tempo < 1 || tempo > 60) {
                System.out.print("Tempo de volta (1 a 60 min): ");
                tempo = leitor.nextInt();
            }
            grid[i].tempoVolta = tempo;
        }
        
        processarCorrida(grid);
    }





/**
     * Resolvendo Atividade 10: Ordenação de Array de Objetos (Pilotos) por tempo de volta.
     * Utiliza o algoritmo clássico de ordenação Bubble Sort com troca de referências.
     */
    public static void processarCorrida(Piloto[] grid) {
        int somaTempos = 0;
        
        // Bubble Sort para ordenar o array de objetos baseado em um atributo numérico interno
        for (int i = 0; i < grid.length - 1; i++) {
            for (int j = 0; j < grid.length - 1 - i; j++) {
                if (grid[j].tempoVolta > grid[j+1].tempoVolta) {
                    // Troca de referências em memória física
                    Piloto temp = grid[j];
                    grid[j] = grid[j+1];
                    grid[j+1] = temp;
                }
            }
        }
        
        // Como o vetor está ordenado crescentemente, o primeiro é o mais rápido e o último o mais lento
        Piloto pilotoMaisRapido = grid[0];
        Piloto pilotoMaisLento = grid[grid.length - 1];
        
        for (int i = 0; i < grid.length; i++) {
            somaTempos += grid[i].tempoVolta;
        }
        
        double mediaCorrida = (double) somaTempos / grid.length;
        
        System.out.println("\n--- RESULTADOS DA CORRIDA ---");
        System.out.println("Piloto Mais Rápido: " + pilotoMaisRapido.nome + " (" + pilotoMaisRapido.tempoVolta + " min) - Escuderia: " + pilotoMaisRapido.escuderia);
        System.out.println("Piloto Mais Lento: " + pilotoMaisLento.nome + " (" + pilotoMaisLento.tempoVolta + " min) - Escuderia: " + pilotoMaisLento.escuderia);
        System.out.printf("Média de Tempo Geral: %.2f min\n", mediaCorrida);
        
        System.out.println("\nClassificação Geral (Ordenada):");
        for (int i = 0; i < grid.length; i++) {
            System.out.println((i + 1) + "º Lugar: " + grid[i].nome + " - " + grid[i].tempoVolta + " min");
        }
    }
}

// ==========================================
// CLASSES DE DADOS (ENTIDADES HETEROGÊNEAS)
// ==========================================

/**
 * Classe auxiliar para empacotamento das regras matemáticas da Atividade 5.
 * Funciona puramente como uma classe de serviço.
 */
class MyMath {
    
    public static int fatorial(int n) {
        int fat = 1;
        for (int i = 1; i <= n; i++) {
            fat *= i;
        }
        return fat;
    }
    
    public static int retornarMaior(int v1, int v2) {
        return (v1 > v2) ? v1 : v2;
    }
    
    public static boolean isPar(int n) {
        return (n % 2 == 0);
    }
    
    public static boolean isPrimo(int n) {
        if (n <= 1) return false;
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) return false;
        }
        return true;
    }
}

/**
 * Representação da Entidade Aluno para a Atividade 8.
 */
class AlunoEstudo {
    String nome;
    double nota1;
    double nota2;
}

/**
 * Representação da Entidade Aluno para o sistema escolar da Atividade 9.
 */
class AlunoEscola {
    String nome;
    int matricula;
    String situacao; // REGULAR ou BOLSISTA
}

/**
 * Representação da Entidade Piloto para a corrida da Atividade 10.
 */
class Piloto {
    String nome;
    String escuderia;
    int tempoVolta; // Medido em minutos
}    