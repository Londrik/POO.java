/**
 * ARQUIVO DIDÁTICO INTEGRADO - POO JAVA
 * Este código reúne os conceitos das Aulas 1 e 2.
 */

import java.util.Scanner;

@SuppressWarnings("all") 
public class Guia_Completo_POO {

    public static void main(String[] args) {
        // 1. ENTRADA DE DADOS (Objeto Scanner)
        // O System.in representa a entrada padrão (teclado)
        Scanner leitor = new Scanner(System.in);

        System.out.println("=== BEM-VINDO AO GUIA PRÁTICO DE JAVA ===");

        // 2. TIPOS DE DADOS E VARIÁVEIS
        System.out.print("Digite seu nome: ");
        String nome = leitor.nextLine(); // Para textos (Objeto)

        System.out.print("Digite sua idade: ");
        int idade = leitor.nextInt(); // Inteiro padrão (32 bits)

        System.out.print("Digite sua altura (ex: 1,75): ");
        double altura = leitor.nextDouble(); // Flutuante padrão (64 bits)

        // 3. SAÍDA DE DADOS E CONCATENAÇÃO (+)
        System.out.println("\nOlá, " + nome + "! Você tem " + idade + " anos.");

        // 4. ESTRUTURAS CONDICIONAIS (Controle de Fluxo)
        if (idade >= 18) {
            System.out.println("Você é maior de idade.");
        } else {
            System.out.println("Você é menor de idade.");
        }

        // Exemplo de Switch com String (Recurso moderno do Java)
        System.out.print("\nEscolha um nível (Básico, Médio, Avançado): ");
        String nivel = leitor.next();
        
        switch (nivel.toLowerCase()) {
            case "basico":
                System.out.println("Você está começando agora!");
                break;
            case "medio":
                System.out.println("Você já conhece o caminho.");
                break;
            case "avancado":
                System.out.println("Você está quase um mestre!");
                break;
            default:
                System.out.println("Nível não reconhecido.");
        }

        // 5. ESTRUTURAS DE REPETIÇÃO E ARRAYS (Estruturas Homogêneas)
        System.out.println("\n--- Exemplo de Array e Loop ---");
        
        // Criando um array de 3 posições para notas
        double[] notas = new double[3];
        double soma = 0;

        // Loop FOR: inicia; condição; incremento
        for (int i = 0; i < notas.length; i++) {
            System.out.print("Digite a nota " + (i + 1) + ": ");
            notas[i] = leitor.nextDouble();
            soma += notas[i]; // Operador de atribuição cumulativa
        }

        // 6. CÁLCULOS E ATRIBUTO .LENGTH
        // O .length é um atributo do objeto Array que diz seu tamanho
        double media = soma / notas.length;
        System.out.printf("Sua média final foi: %.2f\n", media);

        // Loop WHILE: repete enquanto a condição for verdadeira
        int contador = 3;
        System.out.print("Contagem regressiva: ");
        while (contador > 0) {
            System.out.print(contador + "... ");
            contador--;
        }
        System.out.println("FIM!");

        leitor.close(); // Boa prática: fechar o fluxo de dados
    }
}