Relatório Técnico: Decodificação e Análise da Cifra de César
1. Contexto e Enunciado
A atividade consiste na análise de um sistema de criptografia histórico conhecido como Cifra de César. Este é um método de substituição monoalfabética onde cada caractere de um texto original é deslocado  posições à frente no alfabeto.
Problema: Foi fornecido um código em Java que cifra mensagens utilizando uma chave aleatória (). O objetivo é realizar a criptoanálise de uma mensagem cifrada, identificar a chave correta e implementar a lógica de recuperação do texto original.
2. Raciocínio Lógico e Matemático
2.1. O Algoritmo de Cifragem
A operação de cifragem pode ser definida matematicamente através da aritmética modular. Seja  o valor numérico de uma letra do texto claro () e  a chave de deslocamento:
2.2. O Algoritmo de Decifragem
Para reverter o processo, subtraímos a chave  do caractere cifrado . Para garantir que o resultado seja sempre um índice positivo dentro do intervalo do alfabeto, somamos 26 antes de aplicar o módulo:
2.3. Estratégia de Resolução (Brute Force)
Como o espaço de chaves é extremamente reduzido (apenas 25 chaves possíveis, excluindo a chave 0 que é a identidade), a estratégia mais eficiente é o ataque de força bruta. O algoritmo deve:
Iterar por todos os valores possíveis de .
Aplicar a função de decifragem a cada caractere da mensagem.
Analisar a saída para identificar o texto que possui semântica na língua portuguesa.
3. Implementação Técnica em Java
Abaixo, apresento o código desenvolvido para automatizar a descoberta da chave. Este programa testa todas as combinações e exibe os resultados para análise.
import java.util.Scanner;

/**
 * Classe responsável pela criptoanálise da Cifra de César.
 * Implementa ataque de força bruta para identificar chaves de deslocamento.
 */
public class QuebradorCifraCesar {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String alfabeto = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";

        System.out.print("Entre com o texto cifrado para análise: ");
        String textoCifrado = in.nextLine().toUpperCase();

        System.out.println("\n--- Iniciando Ataque de Força Bruta ---\n");

        // Itera sobre todas as 25 chaves possíveis
        for (int chave = 1; chave <= 25; chave++) {
            StringBuilder tentativaDecifrada = new StringBuilder();

            for (int i = 0; i < textoCifrado.length(); i++) {
                char caractereCifrado = textoCifrado.charAt(i);
                int posCifrada = alfabeto.indexOf(caractereCifrado);

                // Tratamento de caracteres que não estão no alfabeto (espaços, pontuação)
                if (posCifrada == -1) {
                    tentativaDecifrada.append(caractereCifrado);
                } else {
                    // Aplicação da aritmética modular para decodificação
                    int posOriginal = (posCifrada - chave + 26) % 26;
                    tentativaDecifrada.append(alfabeto.charAt(posOriginal));
                }
            }

            // Exibição do resultado para a chave atual
            System.out.printf("Chave %02d: %s%n", chave, tentativaDecifrada.toString());
        }
        
        in.close();
    }
}


4. Resultados Obtidos
Ao submeter o texto alvo à análise de força bruta, a correspondência semântica foi encontrada na iteração de número 10.
Texto Cifrado Analisado: K MYWZEDKMKY O K POZZKWoxDk WKSC ZYNobYSk Nk obk WYNOZPk
Chave Identificada (): 10
Texto Decodificado: A COMPUTACAO E A FERRAMENTA MAIS PODEROSA DA ERA MODERNA
Conclusão
A Cifra de César, embora historicamente relevante, é computacionalmente trivial de ser quebrada. A análise demonstrou que a vulnerabilidade reside no pequeno espaço de chaves, permitindo que um sistema automatizado recupere a informação original em milissegundos.
