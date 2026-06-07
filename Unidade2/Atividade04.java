 // --- ATIVIDADE 4: SOMATÓRIO DE INTEIRO ---
        System.out.println("\n[Atividade 4] Somatório de 0 a N:");
        int nSomatorio = -1;
        // Estrutura de validação proativa (garantindo número positivo)
        while (nSomatorio < 0) {
            System.out.print("Digite um número inteiro positivo: ");
            nSomatorio = leitor.nextInt();
        }
        int totalSomatorio = somatorio(nSomatorio);
        System.out.println("O somatório acumulado é: " + totalSomatorio);


 /**
     * Resolvendo Atividade 4: Somatório acumulativo linear recursivo/iterativo.
     */
    public static int somatorio(int numero) {
        int acumulador = 0;
        for (int i = 0; i <= numero; i++) {
            acumulador += i;
        }
        return acumulador;
    }