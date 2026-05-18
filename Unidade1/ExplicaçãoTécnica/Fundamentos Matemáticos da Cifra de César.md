Fundamentos Matemáticos e Computacionais da Criptografia de Substituição
Este documento detalha o embasamento teórico utilizado para a resolução da Cifra de César, transcrevendo a lógica algorítmica para a linguagem da álgebra moderna e da teoria da computação.
1. Aritmética Modular (O Legado de Carl Friedrich Gauss)
O núcleo da Cifra de César reside na Aritmética Modular, formalizada por Carl Friedrich Gauss em sua obra Disquisitiones Arithmeticae (1801).
Trabalhamos com o conjunto dos inteiros módulo , denotado por . No caso do alfabeto latino, utilizamos . Cada letra é mapeada para um elemento do conjunto:

1.1. A Função de Cifragem como Translação
A cifragem é uma função bijetora  definida por uma translação (ou deslocamento):

1.2. O Grupo Aditivo e o Elemento Inverso
Na estrutura de grupo , a operação de decifragem é a aplicação do elemento inverso aditivo da chave . Matematicamente, a decifragem é a função inversa :

Para garantir a corretude computacional (evitando resultados negativos), aplicamos a congruência:

2. Criptoanálise e Frequência (A Descoberta de Al-Kindi)
A quebra da cifra por força bruta ou análise léxica baseia-se na Análise de Frequência, um conceito introduzido pelo polímata árabe Al-Kindi no século IX.
2.1. Espaço de Chaves e Combinatória
Diferente de cifras modernas (como o AES), a Cifra de César possui um Espaço de Chaves  extremamente pequeno:

Isso torna o sistema vulnerável a um ataque de busca exaustiva, onde o custo computacional é de ordem constante  para o alfabeto dado.
3. Teoria da Computação e Expressões Regulares (Regex)
A automação da validação da chave correta utiliza a Teoria de Linguagens Formais, especificamente as Expressões Regulares, cujo fundamento matemático foi estabelecido por Stephen Kleene.
3.1. Autômatos Finitos e Reconhecimento de Padrões
Uma Regex define uma Linguagem Regular. Quando o código Java executa Pattern.compile(regex), ele está construindo internamente um Autômato Finito Não-Determinístico (AFN) para validar se a string decifrada pertence ao subconjunto de cadeias válidas da língua portuguesa.
A heurística de busca utiliza a interseção entre o conjunto de todas as decifragens possíveis  e o conjunto de palavras semanticamente válidas :

4. Modelagem de Dados: O Mapeamento Isomórfico
Ao implementar o código, estabelecemos um Isomorfismo entre o conjunto de caracteres ASCII/Unicode e o anel .
Normalização: Convertemos o domínio para que a distância entre os elementos seja uniforme.
Mapeamento:

Processamento: Aplicamos a translação de Gauss.
Mapeamento Inverso:

Resumo dos Conceitos Aplicados
Carl Friedrich Gauss: Aritmética Modular e Congruência.
Al-Kindi: Criptoanálise por análise de padrões e frequência.
Stephen Kleene: Álgebra de Kleene e Expressões Regulares para filtragem léxica.
Teoria de Grupos: Estrutura cíclica do alfabeto no deslocamento .
