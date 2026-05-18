 /**
     * ATIVIDADE 17: Processamento Avançado de Frase (String API).
     */
    public static void executarAtividade7(Scanner leitor) {
        System.out.println("\n--- [Atividade 7] Processamento de Frase ---");
        leitor.nextLine(); // Buffer
        System.out.print("Digite uma frase: ");
        String frase = leitor.nextLine();

        // 1. Contagem de caracteres específicos ('A' e 'a')
        int countA = 0;
        String maiuscula = frase.toUpperCase();
        for (int i = 0; i < maiuscula.length(); i++) {
            if (maiuscula.charAt(i) == 'A') {
                countA++;
            }
        }
        System.out.println("1. Quantidade de letras 'A' ou 'a': " + countA);

        // 2. Tamanho total
        System.out.println("2. Tamanho da frase: " + frase.length() + " caracteres");

        // 3. Qualificação por tamanho
        String qualif = "PEQUENA";
        if (frase.length() >= 30) {
            qualif = "GRANDE";
        } else if (frase.length() >= 10) {
            qualif = "MEDIA";
        }
        System.out.println("3. Classificação de porte: " + qualif);

        // 4. Caixa Alta
        System.out.println("4. Frase em CAIXA ALTA: " + frase.toUpperCase());

        // 5. Contagem de palavras
        String[] palavras = frase.trim().split("\\s+");
        int countPalavras = (frase.trim().isEmpty()) ? 0 : palavras.length;
        System.out.println("5. Quantidade de palavras na frase: " + countPalavras);

        // 6. Validação de segurança semântica (verificação de termo)
        if (frase.toLowerCase().contains("corrupção") || frase.toLowerCase().contains("corrupcao")) {
            System.out.println("6. Alerta: A frase contém termos de contexto de corrupção.");
        } else {
            System.out.println("6. Validação de termo: Palavra 'Corrupção' não detectada na frase.");
        }
    }
}