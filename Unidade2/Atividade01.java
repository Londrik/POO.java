/**
 * RELATÓRIO TÉCNICO DE IMPLEMENTAÇÃO E RESOLUÇÃO DE ATIVIDADES
 * Autor: Henry (Desenvolvedor Full-Stack / Engenharia de Software)
 * * Este arquivo contém a implementação modularizada e comentada da atividade 1 
 *  e do Módulo 3, aplicando os conceitos de métodos estáticos,
 * passagem de parâmetros, manipulação de arrays e classes de dados/entidades.
 */

import java.util.Scanner;

@SuppressWarnings("all")
public class AtividadesPOO3 {

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        
        System.out.println("=== EXECUÇÃO TÉCNICA DAS ATIVIDADES ===");
        
        // --- ATIVIDADE 1: CÁLCULO DE JUROS EM DIÁRIA ---
        System.out.println("\n[Atividade 1] Calculando Juros:");
        System.out.print("Informe o valor original da dívida: ");
        double dividaOriginal = leitor.nextDouble();
        System.out.print("Informe a taxa de juros mensal (%): ");
        double taxaJuros = leitor.nextDouble();
        
        // Invocação de método passando tipos primitivos (cópia de valor)
        double dividaFinal = calcularDivida(dividaOriginal, taxaJuros);
        System.out.printf("Valor total com juros aplicados: R$ %.2f\n", dividaFinal);



         * Resolvendo Atividade 1: Juros Simples sobre Dívida.
     * Retorna o valor original somado aos juros percentuais calculados.
     */
    public static double calcularDivida(double principal, double jurosPercentual) {
        double jurosCalculado = principal * (jurosPercentual / 100);
        return principal + jurosCalculado;
    }
