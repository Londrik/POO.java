/**
 * IMPLEMENTAÇÃO TÉCNICA DO DESAFIO ELEITORAL
 * Autor: Henry (Engenharia de Software)
 * * Este sistema gerencia candidatos políticos aplicando os conceitos de
 * Abstração, Encapsulamento e Processamento de Arrays em Java.
 */

import java.util.Scanner;

@SuppressWarnings("all")
public class DesafioEleicoes {

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        System.out.println("=== SISTEMA DE GESTÃO ELEITORAL ===");
        System.out.print("Informe a quantidade de candidatos a cadastrar: ");
        int qtdCandidatos = leitor.nextInt();

        // Instanciação do array de referências do tipo Candidato
        Candidato[] candidatos = new Candidato[qtdCandidatos];

        // Loop de preenchimento de dados
        for (int i = 0; i < candidatos.length; i++) {
            leitor.nextLine(); // Limpeza preventiva do buffer de entrada
            candidatos[i] = new Candidato();

            System.out.println("\nCadastro do Candidato " + (i + 1) + ":");
            System.out.print("Nome: ");
            candidatos[i].setNome(leitor.nextLine());

            System.out.print("Número de Filiação: ");
            candidatos[i].setNumeroFiliacao(leitor.nextInt());

            leitor.nextLine(); // Limpeza do buffer
            String tipo = "";
            while (!tipo.equals("DEPUTADO FEDERAL") && !tipo.equals("DEPUTADO DISTRITAL") && !tipo.equals("SENADOR")) {
                System.out.print("Tipo de Candidatura (Deputado Federal, Deputado Distrital, Senador): ");
                tipo = leitor.nextLine().trim().toUpperCase();
            }
            candidatos[i].setTipoCandidatura(tipo);

            System.out.print("Já foi reeleito? (S/N): ");
            char reeleitoChar = leitor.next().charAt(0);
            candidatos[i].setReeleito(Character.toUpperCase(reeleitoChar) == 'S');
        }

        // --- PROCESSAMENTO E EXIBIÇÃO DE RELATÓRIOS (Sem menus de opção) ---
        exibirTodosCandidatos(candidatos);
        exibirCandidatosReeleitos(candidatos);
        exibirGastoDeputadosNaoReeleitos(candidatos);
        exibirGastoTotalEMedia(candidatos);
        exibirCandidatosPorNome(candidatos, "Tiririca");

        leitor.close();
    }

    // ==========================================
    // MÉTODOS DE SERVIÇO DE ANÁLISE DE DADOS
    // ==========================================

    public static void exibirTodosCandidatos(Candidato[] candidatos) {
        System.out.println("\n=========================================");
        System.out.println("LISTAGEM GERAL DE CANDIDATOS CADASTRADOS");
        System.out.println("=========================================");
        for (Candidato c : candidatos) {
            System.out.printf("Nome: %-15s | Cargo: %-18s | Nº: %-5d | Verba: R$ %,10.2f\n",
                    c.getNome(), c.getTipoCandidatura(), c.getNumeroFiliacao(), c.getVerbaCampanha());
        }
    }

    public static void exibirCandidatosReeleitos(Candidato[] candidatos) {
        System.out.println("\n-----------------------------------------");
        System.out.println("CANDIDATOS QUE JÁ FORAM REELEITOS");
        System.out.println("-----------------------------------------");
        for (Candidato c : candidatos) {
            if (c.isReeleito()) {
                System.out.println("- " + c.getNome() + " [Nº " + c.getNumeroFiliacao() + "]");
            }
        }
    }

    public static void exibirGastoDeputadosNaoReeleitos(Candidato[] candidatos) {
        double totalGasto = 0;
        for (Candidato c : candidatos) {
            // Deputados federais e distritais que não foram reeleitos
            if (!c.isReeleito() && (c.getTipoCandidatura().equals("DEPUTADO FEDERAL") || c.getTipoCandidatura().equals("DEPUTADO DISTRITAL"))) {
                totalGasto += c.getVerbaCampanha();
            }
        }
        System.out.printf("\nTotal gasto com deputados NÃO reeleitos: R$ %,.2f\n", totalGasto);
    }

    public static void exibirGastoTotalEMedia(Candidato[] candidatos) {
        double totalGasto = 0;
        for (Candidato c : candidatos) {
            totalGasto += c.getVerbaCampanha();
        }
        double mediaGasto = totalGasto / candidatos.length;
        System.out.printf("Custo Total da Campanha: R$ %,.2f\n", totalGasto);
        System.out.printf("Média de Custo por Candidato: R$ %,.2f\n", mediaGasto);
    }

    public static void exibirCandidatosPorNome(Candidato[] candidatos, String nomeBusca) {
        System.out.println("\n-----------------------------------------");
        System.out.println("BUSCA DE CANDIDATOS PELO NOME: " + nomeBusca.toUpperCase());
        System.out.println("-----------------------------------------");
        boolean achou = false;
        for (Candidato c : candidatos) {
            if (c.getNome().equalsIgnoreCase(nomeBusca)) {
                System.out.println("-> Candidato " + c.getNome() + " [Filiado sob o Nº " + c.getNumeroFiliacao() + "]");
                achou = true;
            }
        }
        if (!achou) {
            System.out.println("Nenhum candidato encontrado com o nome '" + nomeBusca + "'.");
        }
    }
}

// ==========================================
// CLASSE DE ENTIDADE TOTALMENTE ENCAPSULADA
// ==========================================

class Candidato {
    private String nome;
    private int numeroFiliacao;
    private String tipoCandidatura; // DEPUTADO FEDERAL, DEPUTADO DISTRITAL ou SENADOR
    private boolean reeleito;

    // Regra de Negócio encapsulada na classe de dados (Alta Coesão)
    public double getVerbaCampanha() {
        double verbaBase = 0;
        
        switch (this.tipoCandidatura) {
            case "DEPUTADO DISTRITAL":
                verbaBase = 170000.00;
                break;
            case "DEPUTADO FEDERAL":
                verbaBase = 250000.00;
                break;
            case "SENADOR":
                verbaBase = 350000.00;
                break;
        }

        // Dobra a verba se já tiver sido reeleito
        if (this.reeleito) {
            verbaBase *= 2;
        }

        return verbaBase;
    }

    // --- MÉTODOS ACESSORES (GETTERS E SETTERS) ---
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getNumeroFiliacao() {
        return numeroFiliacao;
    }

    public void setNumeroFiliacao(int numeroFiliacao) {
        this.numeroFiliacao = numeroFiliacao;
    }

    public String getTipoCandidatura() {
        return tipoCandidatura;
    }

    public void setTipoCandidatura(String tipoCandidatura) {
        this.tipoCandidatura = tipoCandidatura;
    }

    public boolean isReeleito() {
        return reeleito;
    }

    public void setReeleito(boolean reeleito) {
        this.reeleito = reeleito;
    }
}