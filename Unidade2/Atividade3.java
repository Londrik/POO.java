 // --- ATIVIDADE 3 & 6: CALCULADORA COMPLETA (MÉTODOS COESOS) ---
        System.out.println("\n[Atividade 3] Operações de Calculadora:");
        System.out.print("Digite o primeiro número: ");
        double n1 = leitor.nextDouble();
        System.out.print("Digite o operador (+, -, *, /, ^): ");
        char op = leitor.next().charAt(0);
        System.out.print("Digite o segundo número: ");
        double n2 = leitor.nextDouble();
        
        double resultadoCalc = calcular(n1, op, n2);
        System.out.printf("Resultado do cálculo: %.2f\n", resultadoCalc);

         /**
     * Resolvendo Atividade 3: Estrutura lógica de tomada de decisão aritmética.
     * Delega a execução para métodos coesos especialistas em cada operação matemática.
     */
    public static double calcular(double n1, char operador, double n2) {
        switch (operador) {
            case '+': return somar(n1, n2);
            case '-': return subtrair(n1, n2);
            case '*': return multiplicar(n1, n2);
            case '/': return dividir(n1, n2);
            case '^': return Math.pow(n1, n2); // Uso da API Math nativa do Java
            default:
                System.out.println("Operador Inválido. Retornando zero por padrão.");
                return 0;
        }
    }

    // Métodos coesos e especialistas (Dividir para Conquistar)
    public static double somar(double a, double b) { return a + b; }
    public static double subtrair(double a, double b) { return a - b; }
    public static double multiplicar(double a, double b) { return a * b; }
    public static double dividir(double a, double b) { 
        if (b == 0) {
            System.out.println("Erro Crítico: Divisão por Zero.");
            return 0;
        }
        return a / b; 
    }