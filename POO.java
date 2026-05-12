/**
 * RESUMO DA AULA: AMBIENTE DE DESENVOLVIMENTO E SINTAXE JAVA
 * * 1. IDE ECLIPSE:
 * - Ambiente de Desenvolvimento Integrado que facilita edição, compilação e deploy.
 * - Organização por 'Workspaces' e 'Projects'.
 * * 2. TIPOS DE DADOS:
 * - Inteiros: byte (8-bit), short (16-bit), int (32-bit - padrão), long (64-bit).
 * - Flutuantes: float (32-bit), double (64-bit - padrão).
 * - Caractere: char (16-bit, suporta UTF-16).
 * - Lógico: boolean (true/false).
 * - Texto: String (Objeto para cadeias de caracteres).
 * * 3. ESTRUTURAS DE CONTROLE:
 * - Condicionais: if/else, switch (aceita Strings em versões recentes).
 * - Repetição: for, while, do/while.
 * * 4. ARRAYS (VETORES):
 * - São objetos em Java.
 * - Possuem o atributo '.length' que retorna o tamanho total.
 * * 5. CONVENÇÕES JAVA (CamelCase):
 * - Classes: Letra Maiúscula (Ex: MinhaClasse).
 * - Métodos/Variáveis: Letra minúscula, CamelCase (Ex: calcularMedia).
 * - Constantes: Tudo maiúsculo com underline (Ex: VALOR_MAXIMO).
 */

import java.util.Scanner;

@SuppressWarnings("all") // Remove os alertas de fechamento do Scanner do Eclipse
public class POO {
    public static void main(String[] args) {
        // Exemplo Prático de Sintaxe e Array
        Scanner leitor = new Scanner(System.in);
        int[] notas = new int[3];
        int soma = 0;

        System.out.println("--- Sistema de Notas ---");
        
        for (int i = 0; i < notas.length; i++) {
            System.out.print("Digite a nota " + (i + 1) + ": ");
            notas[i] = leitor.nextInt();
            soma += notas[i];
        }

        double media = (double) soma / notas.length;
        System.out.printf("A média final é: %.2f\n", media);

        if (media >= 7.0) {
            System.out.println("Status: Aprovado");
        } else {
            System.out.println("Status: Reprovado");
        }
    }
}