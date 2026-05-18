 /**
     * ATIVIDADE 12: Manipulação de Strings Básica.
     * Testa os métodos básicos de análise e comparação de Strings da API Java.
     */
    public static void executarAtividade2(Scanner leitor) {
        System.out.println("\n--- [Atividade 2] Manipulação de Strings ---");
        leitor.nextLine(); // Limpeza do buffer
        System.out.print("Digite uma frase/texto: ");
        String texto = leitor.nextLine();

        System.out.println("1. Caixa Alta: " + texto.toUpperCase());
        System.out.println("2. Caixa Baixa: " + texto.toLowerCase());
        System.out.println("3. Quantidade de Caracteres: " + texto.length());
        
        // Comparação de valor lógico de strings via API .equals()
        boolean igual = texto.equals("Eu estou estudando Java");
        System.out.println("4. É exatamente igual a 'Eu estou estudando Java'? " + (igual ? "SIM" : "NÃO"));

        // Algoritmo de contagem de palavras via expressão regular (Split de espaços em branco)
        String[] palavras = texto.trim().split("\\s+");
        int countPalavras = (texto.trim().isEmpty()) ? 0 : palavras.length;
        System.out.println("5. Quantidade de palavras na frase: " + countPalavras);
    }