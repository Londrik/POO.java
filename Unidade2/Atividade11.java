 /**
     * ATIVIDADE 11: Calculadora Orientada a Objetos.
     * Instancia o objeto de dados da calculadora e invoca as operações encapsuladas.
     */
    public static void executarAtividade1(Scanner leitor) {
        System.out.println("\n--- [Atividade 1] Testando Calculadora ---");
        Calculadora calc = new Calculadora();

        System.out.print("Digite o operando 1: ");
        calc.setOperando1(leitor.nextDouble());

        System.out.print("Digite o operador (+, -, *, /): ");
        calc.setOperador(leitor.next().charAt(0));

        System.out.print("Digite o operando 2: ");
        calc.setOperando2(leitor.nextDouble());

        double resultado = calc.executarOperacao();
        System.out.printf("Resultado calculado pelo objeto: %.2f\n", resultado);
    }



/**
 * Entidade Calculadora para a Atividade 11.
 */
class Calculadora {
    private double operando1;
    private double operando2;
    private char operador;

    public double executarOperacao() {
        switch (this.operador) {
            case '+': return this.operando1 + this.operando2;
            case '-': return this.operando1 - this.operando2;
            case '*': return this.operando1 * this.operando2;
            case '/': 
                if (this.operando2 == 0) {
                    System.out.println("Divisão impossível por zero!");
                    return 0;
                }
                return this.operando1 / this.operando2;
            default:
                System.out.println("Operador aritmético não suportado.");
                return 0;
        }
    }

    // --- Getters e Setters ---
    public double getOperando1() { return operando1; }
    public void setOperando1(double operando1) { this.operando1 = operando1; }
    public double getOperando2() { return operando2; }
    public void setOperando2(double operando2) { this.operando2 = operando2; }
    public char getOperador() { return operador; }
    public void setOperador(char operador) { this.operador = operador; }
}
