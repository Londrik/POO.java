        // --- ATIVIDADE 2: CONVERSÃO CELSIUS PARA FAHRENHEIT ---
        System.out.println("\n[Atividade 2] Conversão de Temperatura:");
        System.out.print("Digite a temperatura em Celsius: ");
        double celsius = leitor.nextDouble();
        
        double fahr = fahrenheit(celsius);
        System.out.printf("Temperatura em Fahrenheit: %.2f F\n", fahr);

        /**
     * Resolvendo Atividade 2: Conversão Fahrenheit.
     * Implementação direta da expressão aritmética de conversão de escala térmica.
     */
    public static double fahrenheit(double celsius) {
        return (9 * celsius + 160) / 5;
    }