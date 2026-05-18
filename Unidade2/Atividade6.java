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
