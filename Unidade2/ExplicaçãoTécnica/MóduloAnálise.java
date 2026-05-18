/**
 * RESOLUÇÃO COMPILÁVEL E INTEGRADA DAS 7 ATIVIDADES PRÁTICAS
 * Autor: Henry (Engenharia de Software)
 * * Este arquivo unifica a implementação das atividades de 11 a 17, permitindo
 * a execução direta de cada caso através de um menu técnico de testes.
 */

import java.util.Scanner;
import java.util.ArrayList;

@SuppressWarnings("all")
public class AtividadesPOO4 {

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        int opcao = -1;

        while (opcao != 0) {
            System.out.println("\n=========================================");
            System.out.println("  MENU DE EXECUÇÃO TÉCNICA - ATIVIDADES   ");
            System.out.println("=========================================");
            System.out.println("1 - [Atividade 1] Calculadora Orientada a Objetos");
            System.out.println("2 - [Atividade 2] Manipulação de Strings Básica");
            System.out.println("3 - [Atividade 3] Gestão de Alunos com ArrayList");
            System.out.println("4 - [Atividade 4] Sindicato de Professores (ArrayList)");
            System.out.println("5 - [Atividade 5] Conceitos de Alunos");
            System.out.println("6 - [Atividade 6] Gestão de Triatletas (ArrayList)");
            System.out.println("7 - [Atividade 7] Processamento Avançado de Frase");
            System.out.println("0 - Sair do programa de testes");
            System.out.print("Escolha a atividade a testar: ");
            opcao = leitor.nextInt();

            switch (opcao) {
                case 1:
                    executarAtividade1(leitor);
                    break;
                case 2:
                    executarAtividade2(leitor);
                    break;
                case 3:
                    executarAtividade3(leitor);
                    break;
                case 4:
                    executarAtividade4(leitor);
                    break;
                case 5:
                    executarAtividade5(leitor);
                    break;
                case 6:
                    executarAtividade6(leitor);
                    break;
                case 7:
                    executarAtividade7(leitor);
                    break;
                case 0:
                    System.out.println("Saindo do programa de simulação...");
                    break;
                default:
                    System.out.println("Opção inválida.");
            }
        }
    }