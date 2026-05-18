🛠️ Análise Arquitetural das Resoluções (Desafio e Atividades)

Este documento técnico explica os padrões arquiteturais, decisões de design de software e algoritmos utilizados para resolver o Desafio das Eleições e as 7 Atividades propostas.

1. Resolução do Desafio: Gestão de Candidatos Eleitorais

Abstração: Criou-se a classe Candidato contendo atributos encapsulados: nome, numeroFiliacao, tipoCandidatura e reeleito.

Regra de Negócio Encapsulada: O cálculo da verba de campanha (getVerbaCampanha()) foi inserido diretamente na entidade Candidato, pois depende exclusivamente do estado do candidato (tipoCandidatura e reeleito).

Processamento de Dados: Utilizou-se um array tradicional de objetos para demonstrar o controle de alocação de memória fixa e iteração linear. Filtros condicionais foram aplicados para separar os reeleitos, buscar candidatos com o nome exato "Tiririca" (usando .equalsIgnoreCase()), computar despesas específicas e calcular médias financeiras sem acoplamento de E/S na classe de dados.

2. Atividade 1: Calculadora Orientada a Objetos

Design Pattern: O estado da operação (operando1, operando2, operador) é mantido na classe Calculadora.

Polimorfismo/Coesão: Cada método aritmético (somar(), subtrair(), etc.) é altamente coeso. O método executarOperacao() centraliza a seleção da operação matemática com base no operador de instância.

3. Atividade 2: Manipulação de Texto (String API)

Objetivo: Explorar os métodos de processamento de texto da classe java.lang.String.

Implementação: A contagem de palavras foi resolvida de maneira limpa dividindo a string através do método .split("\\s+") (expressão regular para um ou mais espaços em branco), evitando falsas contagens causadas por múltiplos espaços consecutivos.

4. Atividade 3: Gestão Dinâmica de Alunos com ArrayList

Estrutura Dinâmica: Substituiu-se o array estático pelo ArrayList<AlunoEx3>, eliminando a limitação de tamanho fixo.

Lógica: O usuário insere dados dinamicamente dentro de um loop de controle estruturado. A média das notas é encapsulada na entidade AlunoEx3. No final, a classe principal itera sobre a coleção para computar a média da turma.

5. Atividade 4: Sindicato dos Professores

Validação de Domínio: A lógica de cálculo do desconto sindical foi implementada na classe Professor, utilizando regras percentuais atreladas à titulação (DOUTOR, MESTRE, GRADUADO).

Segurança na Comparação: Strings de titulação foram tratadas usando .toUpperCase() e comparadas com .equals() para evitar inconsistências de entrada do usuário.

6. Atividade 5: Atribuição de Conceitos Acadêmicos

Abstração: Classe de dados AlunoConceito contendo o comportamento getConceito() baseado em faixas de valores numéricos bem definidas.

Lógica: Implementação de uma tabela de conceitos clássica com estruturas condicionais encadeadas para garantir que cada nota caia estritamente em uma faixa conceitual (A, B, C ou D).

7. Atividade 6: Triatletas (Gestão de Dados em Alta Escala)

Estrutura: Classe de dados Atleta que possui o método de auto-avaliação de performance isElite().

Processamento de Coleções: Criação de métodos estáticos de filtragem que recebem e processam o ArrayList<Atleta>. A busca pelo melhor atleta (menor tempo de prova) utiliza o algoritmo clássico de varredura linear com inicialização do menor elemento.

8. Atividade 7: Validação e Processamento de Frases

Lógica de Strings: * A busca pela quantidade de letras 'A' foi implementada convertendo a string inteira para maiúscula e comparando os caracteres usando um loop e o método .charAt(i).

A validação da palavra "Corrupção" foi tratada de forma insensível a maiúsculas/minúsculas usando .toLowerCase().contains("corrupção").